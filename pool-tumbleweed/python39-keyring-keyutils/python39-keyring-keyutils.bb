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

RPM_NAME = "python39-keyring-keyutils-0.1.1-1.10.aarch64.rpm"
RPM_HASH = "c50e661977b66c4883590a9986b705eea3179afa47a09d7b8544a51848b374f1666c4c6e29919eb609091b9df8176717d01874f3be63cc00856aa83480c431af"

RPROVIDES:${PN} += "python3.9dist(keyring-keyutils) \
python39-keyring-keyutils \
python39-keyring-keyutils(aarch-64) \
python3dist(keyring-keyutils)"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) \
libc.so.6()(64bit) \
libkeyutils.so.1()(64bit) \
python(abi)"

inherit rpm
