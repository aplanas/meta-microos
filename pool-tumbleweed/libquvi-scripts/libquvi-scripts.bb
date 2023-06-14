SUMMARY = "Lua scripts used by libquvi"
DESCRIPTION = "libquvi-scripts contains the embedded lua scripts that libquvi uses for \
parsing the media details. Some additional utility scripts are also \
included."
LICENSE = "LGPL-2.1-or-later"

PV = "0.9.20131130"

RPM_NAME = "libquvi-scripts-0.9.20131130-4.7.aarch64.rpm"
RPM_HASH = "91a7edc9bfa15193ce5708b15c1449e620409c6ad742c143e6d0d9ab679e21b05824a5e158475b14858d8281eb46b9f2a5ec9e859d183f5ceda82eac23debdb9"

RPROVIDES:${PN} += "libquvi-scripts"

RDEPENDS:${PN} += "-lua53-luasocket if liblua5-3-5 \
-lua54-luasocket if liblua5-4-5"

inherit rpm
