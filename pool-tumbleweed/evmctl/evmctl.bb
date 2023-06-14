SUMMARY = "IMA/EVM signing utility"
DESCRIPTION = "The evmctl utility can be used for producing and verifying digital signatures, \
which are used by Linux kernel integrity subsystem (IMA/EVM). It can be also \
used to import keys into the kernel keyring."
LICENSE = "LGPL-2.1-or-later"

PV = "1.5"

RPM_NAME = "evmctl-1.5-1.2.aarch64.rpm"
RPM_HASH = "5a833cdbe707ae1fe71957572d4505784d69c058116ceea8e3c6592361a826e3832e873693e40814323f8832f9b45dcff1305ddec3fb654950ef76b23776c7fe"

RPROVIDES:${PN} += "evmctl \
ima-evm-utils"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libcrypto.so.3 \
libimaevm.so.4 \
libkeyutils.so.1 \
libtss2-esys.so.0 \
libtss2-rc.so.0"

inherit rpm
