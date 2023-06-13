SUMMARY = "Bash completion for cpu-x"
DESCRIPTION = "Shell completion definitions from cpu-x for cpu-x."
LICENSE = "GPL-3.0-or-later"

PV = "4.5.3"

RPM_NAME = "cpu-x-zsh-completion-4.5.3-1.1.noarch.rpm"
RPM_HASH = "3439330735ca48f38dd3d6c77dc5b241561328dbbf6d7aacc651f0e359f2b42303f6ca87c4da22509a63e11d799ac1e8b43f82061ffff8c52312ef919a9cbe69"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "cpu-x-zsh-completion"

RDEPENDS:${PN} += ""

inherit rpm
