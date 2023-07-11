SUMMARY = "Perl extension for Latitude Longitude conversions"
DESCRIPTION = "This module will translate latitude longitude coordinates to Universal \
Transverse Mercator(UTM) coordinates and vice versa."
LICENSE = "GPL-1.0+ | Artistic-1.0"

PV = "0.11"

RPM_NAME = "perl-Geo-Coordinates-UTM-0.11-5.25.noarch.rpm"
RPM_HASH = "3d17c3b952d1fbf16677fa30dd207fc3a06658ad274eb7e4061bd313bad72e40ef802ec6fec0300d399e9b60867ee9cffadf8b13bb00bad67c1b135d3bb2c444"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl-Geo--Coordinates--UTM \
perl-Geo-Coordinates-UTM"

RDEPENDS:${PN} += "perl--MODULE-COMPAT-5.36.1"

inherit rpm
