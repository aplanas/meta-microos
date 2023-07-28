SUMMARY = "ICU integration into the HarfBuzz OpenType text shaping engine"
DESCRIPTION = "HarfBuzz is an OpenType text shaping engine. \
This package contains the ICU library."
LICENSE = "MIT"

PV = "8.0.1"

RPM_NAME = "libharfbuzz-icu0-8.0.1-1.1.aarch64.rpm"
RPM_HASH = "3f90b7895e392fce9f899256ede6e75f84d2bd4a403f3dd0e88906f460d2973f260190aeba58f4d19a011061fafb483e04015cab28b463f42434b196083220fa"

RPROVIDES:${PN} += "libharfbuzz-icu.so.0 \
libharfbuzz-icu0"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libharfbuzz.so.0 \
libicuuc.so.73"

inherit rpm
