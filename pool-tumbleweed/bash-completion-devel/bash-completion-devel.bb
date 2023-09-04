SUMMARY = "The Configuration of Programmable Completion for Bash"
DESCRIPTION = "This package contains the package configuration file of the \
package bash-completion."
LICENSE = "GPL-2.0-or-later"

PV = "2.11"

RPM_NAME = "bash-completion-devel-2.11-8.1.noarch.rpm"
RPM_HASH = "4b02e0bdcdaa3ae0efb53da8ea987e5bb6511dbacb531fe4022c2f53477df7e84ab917b58bb4bb096fa9ce50b0b0b7a938919d0514c8cba4eb9c247da4ade7a3"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "bash-completion-/usr/share/pkgconfig/bash-completion.pc \
bash-completion-devel \
pkgconfig-bash-completion"

RDEPENDS:${PN} += "/usr/bin/pkg-config"

inherit rpm
