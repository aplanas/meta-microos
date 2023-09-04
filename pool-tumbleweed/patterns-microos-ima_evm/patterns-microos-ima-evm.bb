SUMMARY = "IMA/EVM Support"
DESCRIPTION = "Packages required to enable IMA/EVM on openSUSE MicroOS."
LICENSE = "MIT"

PV = "5.0"

RPM_NAME = "patterns-microos-ima_evm-5.0-73.1.aarch64.rpm"
RPM_HASH = "0465720c519e170c694e277d56bd1763f1f87c85fb73edc32bed7824066fe550f47724398082e9ecdec2ba91178f479a87ba4dcb52014d9c6c5a01d2eeee6ae6"

RPROVIDES:${PN} += "pattern- \
pattern-category- \
pattern-icon- \
pattern-order- \
pattern-visible- \
patterns-microos-ima-evm"

RDEPENDS:${PN} += "attr \
dracut-ima \
ima-evm-utils \
keyutils"

inherit rpm
