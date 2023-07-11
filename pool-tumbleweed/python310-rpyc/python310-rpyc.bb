SUMMARY = "Remote Python Call (RPyC), a RPC library"
DESCRIPTION = "RPyC (pronounced like 'are-pie-see'), or Remote Python Call, is a \
transparent library for symmetrical remote procedure calls, \
clustering, and distributed-computing.  RPyC makes use of \
object-proxying, a technique that employs python's dynamic nature, to \
overcome the physical boundaries between processes and computers, so \
that remote objects can be manipulated as if they were local."
LICENSE = "MIT"

PV = "5.3.0"

RPM_NAME = "python310-rpyc-5.3.0-2.5.noarch.rpm"
RPM_HASH = "1ef534cadff7333f7a5336e5c58e7e9e3e0bc1763fe89de7f1c516983c7259f49a95182ec22496ae0acd5120f4e54431f8c6f95616a872dee913a8fa181b9706"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.10dist-rpyc \
python310-rpyc \
python3dist-rpyc"

RDEPENDS:${PN} += "/usr/bin/python3.10 \
/usr/bin/python3.11 \
/usr/bin/sh \
python-abi \
python310-plumbum \
update-alternatives"

inherit rpm
