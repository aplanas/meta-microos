SUMMARY = "Yet Another Dotfiles Manager"
DESCRIPTION = "yadm is a tool for managing a collection of files across multiple computers, \
using a shared Git repository. In addition, yadm provides a feature to select \
alternate versions of files based on the operation system or host name. Lastly, \
yadm supplies the ability to manage a subset of secure files, which are \
encrypted before they are included in the repository."
LICENSE = "GPL-3.0-only"

PV = "3.2.2"

RPM_NAME = "yadm-3.2.2-1.1.noarch.rpm"
RPM_HASH = "daf74ef4cc553c1ed41694c15a629964b685a5c08f0ddb312221b3b338603e53878a3b5d90f8e08c4c91d180002e57df52bd561f6447dfdfa58359676cf00ea8"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "yadm"

RDEPENDS:${PN} += "/usr/bin/bash \
bash \
git"

inherit rpm
