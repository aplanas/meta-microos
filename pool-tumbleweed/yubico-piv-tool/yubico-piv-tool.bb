SUMMARY = "Yubico YubiKey NEO CCID Manager"
DESCRIPTION = "This is a command line tool to interact with the PIV applet on a YubiKey NEO. \
Among other functions it supports, generating keys on device, importing keys \
and certificates and creating certificate requests."
LICENSE = "BSD-2-Clause"

PV = "2.3.1"

RPM_NAME = "yubico-piv-tool-2.3.1-1.3.aarch64.rpm"
RPM_HASH = "2a5a270e107a0cdecb0ed7292e0b235ba6bc57c624cfc2831fd45548ce495793a0dc2ad8f6b479fa19a7b5d5a2b62338e3f934ac4ec647a7cd8d890da539bdd1"

RPROVIDES:${PN} += "yubico-piv-tool"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libcrypto.so.3 \
libykcs11-2 \
libykpiv.so.2 \
libykpiv2"

inherit rpm
