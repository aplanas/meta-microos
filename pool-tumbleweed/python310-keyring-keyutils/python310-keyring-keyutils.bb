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

RPM_NAME = "python310-keyring-keyutils-0.1.1-3.1.aarch64.rpm"
RPM_HASH = "83b9d7db0c7b94e33bc29e7aeea4ea31566e11bf089f918e756c9a80efa51babe57dbc638235b84046dc0847ebc9ae20695b1663c23f16d2c9b98035a428638a"

RPROVIDES:${PN} += "python3.10dist-keyring-keyutils \
python310-keyring-keyutils \
python3dist-keyring-keyutils"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libkeyutils.so.1 \
python-abi"

inherit rpm
