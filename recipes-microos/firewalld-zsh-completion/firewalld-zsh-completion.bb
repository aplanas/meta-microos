SUMMARY = "Zsh Completion for firewalld"
DESCRIPTION = "Zsh command line completion support for firewalld."
LICENSE = "GPL-2.0-or-later"

PV = "1.3.2"

RPM_NAME = "firewalld-zsh-completion-1.3.2-2.1.noarch.rpm"
RPM_HASH = "5e7da6bf2a284c01b7366e08b50677a806d37080f6f75da8211f052398569ac2344683a61ee4aa74c1db2ad2c5bbe1f3fc400e9c3e21cadbf20157353a89eab2"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "firewalld-zsh-completion"
RDEPENDS:${PN} += "firewalld \
zsh"

inherit rpm
