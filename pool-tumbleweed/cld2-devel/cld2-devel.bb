SUMMARY = "Development files for cld2"
DESCRIPTION = "A library that detects over 80 languages in UTF-8 text, based largely \
on groups of four letters. Also tables for 160+ language versions. \
 \
This subpackage contains the headers for cld2."
LICENSE = "Apache-2.0"

PV = "20150820"

RPM_NAME = "cld2-devel-20150820-5.10.aarch64.rpm"
RPM_HASH = "49d5448264fca574cc024644d194301a8512e5eb3afb5c339edfa9ab5f43468cdfd4d6d04157921c323cbe690c516ee85bc39147f941126936fb33e87d98c5b7"

RPROVIDES:${PN} += "cld2-devel \
pkgconfig-cld2"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libcld2-0"

inherit rpm
