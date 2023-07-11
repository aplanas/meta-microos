SUMMARY = "IMA/EVM Support"
DESCRIPTION = "Packages required to enable IMA/EVM on openSUSE MicroOS."
LICENSE = "MIT"

PV = "5.0"

RPM_NAME = "patterns-microos-ima_evm-5.0-72.1.aarch64.rpm"
RPM_HASH = "0e62f5675cf331912a5f990f1e5e54dcbbe2390374872a8d393036c96bb09d8f9365df3e01efa1ae371c73f363bea53ed6d5d3976b2675d41e35e41f1852c4f5"

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
