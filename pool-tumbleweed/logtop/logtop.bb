SUMMARY = "Statistics generator for logs"
DESCRIPTION = "Logtop is a basic log analyzer. \
It allows piping logs into it to obtain statistics."
LICENSE = "BSD-2-Clause"

PV = "0.7"

RPM_NAME = "logtop-0.7-1.17.aarch64.rpm"
RPM_HASH = "55e1db90a1b95f7bdccdc450dd256956856e19f3c4730bdc160ff802cc5581067cdba3ea3eca3223c4ac5788ef1d876b86a629f395629654c4218af72e0fd59a"

RPROVIDES:${PN} += "logtop"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libncursesw.so.6"

inherit rpm
