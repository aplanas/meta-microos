SUMMARY = "The Thai table for ibus-table"
DESCRIPTION = "ibus-table-thai provides the Thai table for ibus-table. \
ภาษาไทย / Thai"
LICENSE = "GPL-3.0-or-later"

PV = "1.3.16"

RPM_NAME = "ibus-table-thai-1.3.16-1.1.noarch.rpm"
RPM_HASH = "41153a257252c42211abd5c1a8eb1c7351ec2058b00035112659f2bb5a6a65b9d717836810e34a19178dbac1b58b8a7d16fdbfd2afbb75c2328efdeaaaf30bd2"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "ibus-table-thai"

RDEPENDS:${PN} += "ibus-table"

inherit rpm
