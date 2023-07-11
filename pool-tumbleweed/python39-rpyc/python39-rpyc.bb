SUMMARY = "Remote Python Call (RPyC), a RPC library"
DESCRIPTION = "RPyC (pronounced like 'are-pie-see'), or Remote Python Call, is a \
transparent library for symmetrical remote procedure calls, \
clustering, and distributed-computing.  RPyC makes use of \
object-proxying, a technique that employs python's dynamic nature, to \
overcome the physical boundaries between processes and computers, so \
that remote objects can be manipulated as if they were local."
LICENSE = "MIT"

PV = "5.3.0"

RPM_NAME = "python39-rpyc-5.3.0-2.5.noarch.rpm"
RPM_HASH = "3162fcd8a212db21914afcff370979a033223d127d9a36ed5000960e2615970f872114e136a923688c33a6a031132feccfa6024cc227097e35916969d570889f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-rpyc \
python39-rpyc \
python3dist-rpyc"

RDEPENDS:${PN} += "/usr/bin/python3.11 \
/usr/bin/python3.9 \
/usr/bin/sh \
python-abi \
python39-plumbum \
update-alternatives"

inherit rpm
