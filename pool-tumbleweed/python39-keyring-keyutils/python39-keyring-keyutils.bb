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

RPM_NAME = "python39-keyring-keyutils-0.1.1-1.12.aarch64.rpm"
RPM_HASH = "a98e19f868885462b50f30f5793d6602627e7fc3cbee69da5e4136bf2d0feba61542aee50939f8fc194557fe27714d19bbbf424a48964d67fcd768df6b7f7924"

RPROVIDES:${PN} += "python3.9dist-keyring-keyutils \
python39-keyring-keyutils \
python3dist-keyring-keyutils"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libkeyutils.so.1 \
python-abi"

inherit rpm
