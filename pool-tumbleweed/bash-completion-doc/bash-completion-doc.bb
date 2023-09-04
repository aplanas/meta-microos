SUMMARY = "The Documentation of Programmable Completion for Bash"
DESCRIPTION = " \
This package contains the package documentation file of the \
package bash-completion."
LICENSE = "GPL-2.0-or-later"

PV = "2.11"

RPM_NAME = "bash-completion-doc-2.11-8.1.noarch.rpm"
RPM_HASH = "8c18d10cd52af7f36fc56cee47c547f4aa22416adb47aa1d48412a9f395e081d292490ae3d944301bdb9a3942b812f49498db4d327eab67e72fdffe6b6d9cf0e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "bash-completion-/usr/share/doc/packages/bash-completion/AUTHORS \
bash-completion-doc"

RDEPENDS:${PN} += ""

inherit rpm
