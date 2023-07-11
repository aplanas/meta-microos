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

RPM_NAME = "qbe-1.1-1.4.aarch64.rpm"
RPM_HASH = "a583cb2b2f8d3c625e37e4aa66a5646bc0d9e7a68eae89270794c5671588883ae74ea48521c1bf3d03fcbe80af64f54f9628c6237967b6c01ec236202b7b4f65"

RPROVIDES:${PN} += "qbe"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6"

inherit rpm
