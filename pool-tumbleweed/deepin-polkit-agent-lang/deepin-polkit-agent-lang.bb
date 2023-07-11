SUMMARY = "Translations for package deepin-polkit-agent"
DESCRIPTION = "Provides translations for the 'deepin-polkit-agent' package."
LICENSE = "GPL-3.0-or-later"

PV = "5.5.21"

RPM_NAME = "deepin-polkit-agent-lang-5.5.21-1.3.noarch.rpm"
RPM_HASH = "5be3b541edf08ccbc7c1be248f755b464700e285b68415e2b3e8d7830e59e85eed001d89b9f28609355c9c3141f704631f86a5a2a121f0b59ce0ceb9fa808bd3"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "deepin-polkit-agent-lang \
deepin-polkit-agent-lang-all"

RDEPENDS:${PN} += "deepin-polkit-agent"

inherit rpm
