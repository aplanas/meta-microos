SUMMARY = "An OpenType text shaping engine"
DESCRIPTION = "HarfBuzz is an OpenType text shaping engine. \
This package contains the subset library"
LICENSE = "MIT"

PV = "8.0.1"

RPM_NAME = "libharfbuzz-subset0-8.0.1-1.1.aarch64.rpm"
RPM_HASH = "3f2e990b885534aab7374461257268f9f47be892bab1c7fca5f4d4689fcf910bb4a72d368bf49920926d14eb22481257614ee1b543d62d8733d6152cb532f7eb"

RPROVIDES:${PN} += "libharfbuzz-subset.so.0 \
libharfbuzz-subset0"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libharfbuzz.so.0 \
libm.so.6"

inherit rpm
