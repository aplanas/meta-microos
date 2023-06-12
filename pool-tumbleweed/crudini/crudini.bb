SUMMARY = "A utility for manipulating ini files"
DESCRIPTION = "A utility for easily handling ini files from the command line and shell \
scripts."
LICENSE = "GPL-2.0-only"

PV = "0.9.4"

RPM_NAME = "crudini-0.9.4-1.1.noarch.rpm"
RPM_HASH = "bde41feb6b7aee6832411747752846486121a15adfc6c740c9755472758de302182072db48982e8a6b7846f17715c1121c3586703b587b00459a3e695f7571bc"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "crudini"
RDEPENDS:${PN} += "/usr/bin/python3 \
python3-iniparse"

inherit rpm
