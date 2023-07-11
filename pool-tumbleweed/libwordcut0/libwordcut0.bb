SUMMARY = "Thai word segmentation utility"
DESCRIPTION = "Thai word segmentation utility."
LICENSE = "BSD-3-Clause"

PV = "0.5.1b2"

RPM_NAME = "libwordcut0-0.5.1b2-206.1.aarch64.rpm"
RPM_HASH = "1e676e9443759d5251937c263c48cc490341e5fef6f612b33376a795544434da9abe1e1dabc26efb7bf26b48af9d618fb76b093a8ed3fa48c81ea30f76b24756"

RPROVIDES:${PN} += "libwordcut.so.0 \
libwordcut0"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6"

inherit rpm
