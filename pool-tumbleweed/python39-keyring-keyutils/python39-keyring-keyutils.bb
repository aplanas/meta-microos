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

RPM_NAME = "python39-keyring-keyutils-0.1.1-2.1.aarch64.rpm"
RPM_HASH = "ac7c32a320363d9331e428ff4285a4944ee04af362737986c613e761f1b06e3744fb968fed1a56ec1f3de9a07fe57f099d324e9ec7a8a808cd8793c783d13e6d"

RPROVIDES:${PN} += "python3.9dist-keyring-keyutils \
python39-keyring-keyutils \
python3dist-keyring-keyutils"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libkeyutils.so.1 \
python-abi"

inherit rpm
