SUMMARY = "Bash completion for gmic"
DESCRIPTION = "This package contains the bash completion command for gmic."
LICENSE = "CECILL-2.1"

PV = "3.3.0"

RPM_NAME = "gmic-bash-completion-3.3.0-1.1.noarch.rpm"
RPM_HASH = "c2f684e6f1533db0a81d1a0eea524c42262c5b54ce8b2e91e979428f9f9b800f9fd5e9c484406d752756019e813018e9a9abc8951ca8eb0d1f4afbb77f3afcfc"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "gmic-bash-completion"

RDEPENDS:${PN} += "bash-completion"

inherit rpm
