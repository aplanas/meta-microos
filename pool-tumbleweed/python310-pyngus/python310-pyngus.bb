SUMMARY = "Callback API implemented over Proton"
DESCRIPTION = "A messaging framework built on the QPID Proton engine. It \
provides a callback-based API for message passing"
LICENSE = "Apache-2.0"

PV = "2.3.1"

RPM_NAME = "python310-pyngus-2.3.1-1.11.noarch.rpm"
RPM_HASH = "6f086762e63508ca5c389156cd0c3eb1222bf03687f1f15e2d9d2fa778a90d41e94628842670831c8c31d731c7c0f793ac7f67fe4216a87e79d42097aa6c6149"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.10dist-pyngus \
python310-pyngus \
python3dist-pyngus"

RDEPENDS:${PN} += "python-abi \
python310-python-qpid-proton"

inherit rpm
