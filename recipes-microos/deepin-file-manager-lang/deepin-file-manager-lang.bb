SUMMARY = "Translations for package deepin-file-manager"
DESCRIPTION = "Provides translations for the 'deepin-file-manager' package."
LICENSE = "GPL-3.0-or-later & MIT"

PV = "5.6.4"

RPM_NAME = "deepin-file-manager-lang-5.6.4-3.7.noarch.rpm"
RPM_HASH = "cc6cd9795ed96df34d675882440fb8137426417acaf366fc801920e240e46452d5560ed564d13978d68fe0061be544d8d465f5efb602ce0ca46607c43ad8ceda"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "deepin-file-manager-lang deepin-file-manager-lang-all"
RDEPENDS:${PN} += "deepin-file-manager"

inherit rpm
