SUMMARY = "Perl extension for Latitude Longitude conversions"
DESCRIPTION = "This module will translate latitude longitude coordinates to Universal \
Transverse Mercator(UTM) coordinates and vice versa."
LICENSE = "GPL-1.0+ | Artistic-1.0"

PV = "0.11"

RPM_NAME = "perl-Geo-Coordinates-UTM-0.11-5.24.noarch.rpm"
RPM_HASH = "fd905355d2d3e8217be4d7edc0caa273a6f0a4355629bd152dca27c18d777d5d6b5806204a240f7928c8e51b67dda459f367d9d13259b6ccc84e9a1c885f6f9e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl(Geo::Coordinates::UTM) \
perl-Geo-Coordinates-UTM"

RDEPENDS:${PN} += "perl(:MODULE_COMPAT_5.36.0)"

inherit rpm
