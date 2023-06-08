SUMMARY = "The Documentation of Programmable Completion for Bash"
DESCRIPTION = " \
This package contains the package documentation file of the \
package bash-completion."
LICENSE = "GPL-2.0-or-later"

PV = "2.11"

RPM_NAME = "bash-completion-doc-2.11-7.1.noarch.rpm"
RPM_HASH = "32f9291a2a07a53fabcfa0ebb7a517aa8e5abb6b184354e757f0b689661aadf596dde2ad9e9fcaab9dc0d913c2a95e6e779f0fd47c9656bb4571d3de1377b6a6"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "bash-completion-doc bash-completion:/usr/share/doc/packages/bash-completion/AUTHORS"
RDEPENDS:${PN} += ""

inherit rpm
