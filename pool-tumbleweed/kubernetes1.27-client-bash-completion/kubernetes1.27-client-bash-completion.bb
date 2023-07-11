SUMMARY = "Bash Completion for kubernetes1.27-client"
DESCRIPTION = "Bash command line completion support for kubernetes1.27-client"
LICENSE = "Apache-2.0"

PV = "1.27.3"

RPM_NAME = "kubernetes1.27-client-bash-completion-1.27.3-1.1.noarch.rpm"
RPM_HASH = "bdba6d711b18d92986ca83764c02f4088d13ec5f772b21af17152c685e549417858bba30aa503a18b3aaa969f94a997a61cb743f805979722bed8f1a8981a390"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "kubernetes-client-bash-completion \
kubernetes1.27-client-bash-completion"

RDEPENDS:${PN} += "bash-completion \
kubernetes1.27-client"

inherit rpm
