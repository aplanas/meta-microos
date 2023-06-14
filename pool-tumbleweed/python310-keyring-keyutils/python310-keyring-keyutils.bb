SUMMARY = "A python-keyring backend for the kernel keyring"
DESCRIPTION = "A python-keyring [1] backend that can be used to access the kernel \
keyring. In particular, this package ships \
 \
- a python-keyring [1] backend for the kernel keyring \
- a special python-keyring backend that can be used by osc \
- a high-level interface to the kernel keyring \
- a low-level module that wraps around the C keyutils library [2] \
 \
[1] https://github.com/jaraco/keyring \
[2] https://git.kernel.org/pub/scm/linux/kernel/git/dhowells/keyutils.git"
LICENSE = "MIT"

PV = "0.1.1"

RPM_NAME = "python310-keyring-keyutils-0.1.1-1.10.aarch64.rpm"
RPM_HASH = "09d5b839ba57fe280a49566ee385432c8223c3f5756f60b2be1f7ed54cf433b4e17b0f6115a20c6772cc87379e6d5f927bd004af3d01b9e30b4f0bfc349283b7"

RPROVIDES:${PN} += "python3-keyring-keyutils \
python3.10dist-keyring-keyutils \
python310-keyring-keyutils \
python3dist-keyring-keyutils"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libkeyutils.so.1 \
python-abi"

inherit rpm
