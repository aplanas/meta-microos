SUMMARY = "Thai word segmentation utility"
DESCRIPTION = "Thai word segmentation utility."
LICENSE = "BSD-3-Clause"

PV = "0.5.1b2"

RPM_NAME = "wordcut-0.5.1b2-206.1.aarch64.rpm"
RPM_HASH = "cf2dc3cec6c2278481ef37063d11794e5fda793be97e65c0a53bb45a8398c421c33043b9d989028bd67d9d963261e7afd11b0955f2b8f7c147733827f51b304e"

RPROVIDES:${PN} += "locale-th \
wordcut"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libwordcut.so.0"

inherit rpm
