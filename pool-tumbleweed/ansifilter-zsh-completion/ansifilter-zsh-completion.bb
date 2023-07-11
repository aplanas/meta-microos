SUMMARY = "Zsh completion for ansifilter"
DESCRIPTION = "This package provides Zsh command-line completion support for ansifilter."
LICENSE = "GPL-3.0-or-later"

PV = "2.20"

RPM_NAME = "ansifilter-zsh-completion-2.20-1.1.noarch.rpm"
RPM_HASH = "ac5501ef2454b53dd384f03db04974cf88b4a9cfff6b29ed2d39ca460dbe57481abcc2ebc0d18b91ca014ca5a172b2be0693711e07fd8c4663f2bcee2699d6c1"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "ansifilter-zsh-completion"

RDEPENDS:${PN} += "ansifilter \
zsh"

inherit rpm
