SUMMARY = "Translations for package deepin-polkit-agent"
DESCRIPTION = "Provides translations for the 'deepin-polkit-agent' package."
LICENSE = "GPL-3.0-or-later"

PV = "5.5.21"

RPM_NAME = "deepin-polkit-agent-lang-5.5.21-1.2.noarch.rpm"
RPM_HASH = "5e633ff52d22e80fc23f8303071ea5f326a90bc2767ed477162f9b3150b619c938a9bff9b119971bcb86ce345e1c64b262e7bc2e1855b5aca2114b14547a0ff6"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "deepin-polkit-agent-lang deepin-polkit-agent-lang-all"
RDEPENDS:${PN} += "deepin-polkit-agent"

inherit rpm
