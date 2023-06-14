SUMMARY = "IMA/EVM Support"
DESCRIPTION = "Packages required to enable IMA/EVM on openSUSE MicroOS."
LICENSE = "MIT"

PV = "5.0"

RPM_NAME = "patterns-microos-ima_evm-5.0-70.1.aarch64.rpm"
RPM_HASH = "885aa615a8c0acf50a55182b331c3eb386bc69a4c8f7b87865bfbfa964b7c1b2c5af61df3f93d69cb6fa84320c267a4fc124b4d74cdee0d1f8a781ead02f27db"

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
