SUMMARY = "Library for the GNU Objective C Compiler"
DESCRIPTION = "The library for the GNU Objective C compiler."
LICENSE = "GPL-3.0-or-later-with-GCC-exception-3.1"

PV = "13.1.1+git7552"

RPM_NAME = "libobjc4-13.1.1+git7552-1.1.aarch64.rpm"
RPM_HASH = "ff12ed2daab5bffaca95620dfa56839b04fadbcd9d229b7cae509b2314ca030f25e9892a1ae67f236be9279f3519a65bf9cbb1eea42177eb47da0928d44fadb5"

RPROVIDES:${PN} += "libobjc.so.4 \
libobjc4"

RDEPENDS:${PN} += "/sbin/ldconfig \
libc.so.6 \
libgcc-s.so.1"

inherit rpm
