SUMMARY = "Fish Completion for kubernetes1.25-client"
DESCRIPTION = "Fish command line completion support for kubernetes1.25-client."
LICENSE = "Apache-2.0"

PV = "1.25.9"

RPM_NAME = "kubernetes1.25-client-fish-completion-1.25.9-1.2.noarch.rpm"
RPM_HASH = "bef94a44bb509cace642dc23aae95c8fa6f48dea450a6f5a2f46c331b15bc288e5fb454b78e24634c40ef767a61dc63a4ddad8292452e7bdd49e2ff635035eca"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "kubernetes-client-fish-completion \
kubernetes1.25-client-fish-completion"
RDEPENDS:${PN} += "kubernetes1.25-client"

inherit rpm
