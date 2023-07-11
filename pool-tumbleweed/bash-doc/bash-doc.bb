SUMMARY = "Documentation how to Use the GNU Bourne-Again Shell"
DESCRIPTION = "This package contains the documentation for using the bourne shell \
interpreter Bash."
LICENSE = "GPL-3.0-or-later"

PV = "5.2.15"

RPM_NAME = "bash-doc-5.2.15-8.6.noarch.rpm"
RPM_HASH = "53d5483dd4ddcb90b8c76bb3568b69343ab802953bec181e3848092b3794e48327a71cbc590ef52c6cb04bdfa90fd2bf86f620105bcb9e9dd4a057a4b7a15244"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "bash-/usr/share/info/bash.info.gz \
bash-doc"

RDEPENDS:${PN} += ""

inherit rpm
