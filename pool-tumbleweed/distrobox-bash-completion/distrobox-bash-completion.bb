SUMMARY = "Bash completion for distrobox"
DESCRIPTION = "Bash command line completion support for distrobox."
LICENSE = "GPL-3.0-only"

PV = "1.5.0.2"

RPM_NAME = "distrobox-bash-completion-1.5.0.2-1.1.noarch.rpm"
RPM_HASH = "70473733c357a7f9c19233677476bb18e4f14d0ed30a73b45b5975a26dbe22efa6a0a47296b44d6178cf1ca42c44529b4aa7b4d2fb8861efadbf6cc8e0410789"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "distrobox-bash-completion"

RDEPENDS:${PN} += "bash-completion \
distrobox"

inherit rpm
