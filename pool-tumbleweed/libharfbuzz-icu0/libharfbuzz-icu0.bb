SUMMARY = "ICU integration into the HarfBuzz OpenType text shaping engine"
DESCRIPTION = "HarfBuzz is an OpenType text shaping engine. \
This package contains the ICU library."
LICENSE = "MIT"

PV = "7.3.0"

RPM_NAME = "libharfbuzz-icu0-7.3.0-1.2.aarch64.rpm"
RPM_HASH = "e054206658b5e62cf347f16455ec9e7820b8137bf258c25be1c066c5cff6804616fc021fcf9c2ac27d0d92e6ed26461c12d0e4bd9b8c27dd56a7c287cc6e0399"

RPROVIDES:${PN} += "libharfbuzz-icu.so.0 \
libharfbuzz-icu0"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libharfbuzz.so.0 \
libicuuc.so.73"

inherit rpm
