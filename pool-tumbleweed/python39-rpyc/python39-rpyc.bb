SUMMARY = "Remote Python Call (RPyC), a RPC library"
DESCRIPTION = "RPyC (pronounced like 'are-pie-see'), or Remote Python Call, is a \
transparent library for symmetrical remote procedure calls, \
clustering, and distributed-computing.  RPyC makes use of \
object-proxying, a technique that employs python's dynamic nature, to \
overcome the physical boundaries between processes and computers, so \
that remote objects can be manipulated as if they were local."
LICENSE = "MIT"

PV = "5.3.0"

RPM_NAME = "python39-rpyc-5.3.0-2.3.noarch.rpm"
RPM_HASH = "846c5c46877027b101c55e9d4c5c033d439d5609cf393db4c98acac217f8eaea7abba1886ce8cedbae8c6ea31d7794bc16d188807bfb24f8b1c5fff55bbce09a"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-rpyc \
python39-rpyc \
python3dist-rpyc"

RDEPENDS:${PN} += "/usr/bin/python3.10 \
/usr/bin/python3.9 \
/usr/bin/sh \
python-abi \
python39-plumbum \
update-alternatives"

inherit rpm
