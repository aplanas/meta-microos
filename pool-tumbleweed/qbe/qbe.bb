SUMMARY = "Small embeddable C compiler backend"
DESCRIPTION = "QBE is a compiler backend that aims to provide 70% of the \
performance of industrial optimizing compilers in 10% of the code. \
QBE fosters language innovation by offering a compact user-friendly \
and performant backend. \
 \
The size limit constrains QBE to focus on the essential and \
prevents embarking on a never-ending path of diminishing returns."
LICENSE = "MIT"

PV = "1.1"

RPM_NAME = "qbe-1.1-1.3.aarch64.rpm"
RPM_HASH = "6538a40807e9476280543cf4514e3b8f42bc7a7b2074177bc216939ef067a2684869b46a20bd45b473b117dca576314c4c1146a9db9c435cacab1a92026e9f12"

RPROVIDES:${PN} += "qbe"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6"

inherit rpm
