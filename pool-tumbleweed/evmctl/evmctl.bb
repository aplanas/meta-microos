SUMMARY = "IMA/EVM signing utility"
DESCRIPTION = "The evmctl utility can be used for producing and verifying digital signatures, \
which are used by Linux kernel integrity subsystem (IMA/EVM). It can be also \
used to import keys into the kernel keyring."
LICENSE = "LGPL-2.1-or-later"

PV = "1.5"

RPM_NAME = "evmctl-1.5-1.3.aarch64.rpm"
RPM_HASH = "64792cc0a73f5f92a377724460636c997e4a3cf2e9ed1c1c307822d590e3640e813e1baf5d0f4329447e9bff150993dfa9c9a3563509cd8281fd21daa2954b83"

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
