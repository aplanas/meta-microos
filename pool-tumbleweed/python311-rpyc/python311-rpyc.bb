SUMMARY = "Remote Python Call (RPyC), a RPC library"
DESCRIPTION = "RPyC (pronounced like 'are-pie-see'), or Remote Python Call, is a \
transparent library for symmetrical remote procedure calls, \
clustering, and distributed-computing.  RPyC makes use of \
object-proxying, a technique that employs python's dynamic nature, to \
overcome the physical boundaries between processes and computers, so \
that remote objects can be manipulated as if they were local."
LICENSE = "MIT"

PV = "5.3.0"

RPM_NAME = "python311-rpyc-5.3.0-2.5.noarch.rpm"
RPM_HASH = "c23cb4450e85771d6466a2a2d935e9bcc5f896b9bf03dd997e40eb1a88ddf2dbcf84cfc01652845ec2596216461be2828d8fc34787e244e1a5526e4eedb3c55f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-rpyc \
python3.11dist-rpyc \
python311-rpyc \
python3dist-rpyc"

RDEPENDS:${PN} += "/usr/bin/python3.11 \
/usr/bin/sh \
python-abi \
python311-plumbum \
update-alternatives"

inherit rpm
