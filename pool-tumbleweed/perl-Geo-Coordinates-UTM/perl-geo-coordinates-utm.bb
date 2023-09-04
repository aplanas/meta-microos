SUMMARY = "Perl extension for Latitude Longitude conversions"
DESCRIPTION = "This module will translate latitude longitude coordinates to Universal \
Transverse Mercator(UTM) coordinates and vice versa."
LICENSE = "GPL-1.0+ | Artistic-1.0"

PV = "0.11"

RPM_NAME = "perl-Geo-Coordinates-UTM-0.11-5.26.noarch.rpm"
RPM_HASH = "de52767210ba8fbd97f6f149561c901a8e92d9353a12bafe8a3de1b340c10752ec45f5ecc1e555b75cc8db13ee7028d52910aae5ab9aadd34a0fcb1ade118671"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl-Geo--Coordinates--UTM \
perl-Geo-Coordinates-UTM"

RDEPENDS:${PN} += "perl--MODULE-COMPAT-5.38.0"

inherit rpm
