SUMMARY = "Leptonica tools"
DESCRIPTION = "Programs for manipulating images."
LICENSE = "BSD-2-Clause"

PV = "1.83.1"

RPM_NAME = "leptonica-tools-1.83.1-1.4.aarch64.rpm"
RPM_HASH = "0036eade692fe3d447024aa7d2d7b2a455e0e86b41b5af6468c7cb9f6b58ed1ee0deaf78e438cec0d38aacf4bc7116d4e36a4748b345da45fa2c05671b6ca90c"

RPROVIDES:${PN} += "leptonica-tools"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libleptonica.so.6"

inherit rpm
