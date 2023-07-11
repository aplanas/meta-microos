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

RPM_NAME = "python310-keyring-keyutils-0.1.1-1.12.aarch64.rpm"
RPM_HASH = "c69ae560a37d06b755019cc882bb4f500e3756a6a472200a63c9df003876929e447e45cadbf0b00caf20aacf54d7e26dd0cee5026b79da2f47ec3690fbb46716"

RPROVIDES:${PN} += "python3.10dist-keyring-keyutils \
python310-keyring-keyutils \
python3dist-keyring-keyutils"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libkeyutils.so.1 \
python-abi"

inherit rpm
