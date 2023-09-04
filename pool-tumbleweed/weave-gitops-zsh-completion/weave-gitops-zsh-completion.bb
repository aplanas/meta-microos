SUMMARY = "Zsh Completion for weave-gitops"
DESCRIPTION = "zsh command line completion support for weave-gitops."
LICENSE = "MPL-2.0"

PV = "0.29.0"

RPM_NAME = "weave-gitops-zsh-completion-0.29.0-1.1.noarch.rpm"
RPM_HASH = "86848df2aee62d59126e31870d0861dc2ba3f5a99a6e602eec7b8f76e95e0faa87c44fed70d968c72b7207b46ee2ff8f58f8b7515fd5872880895b169392f913"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "weave-gitops-zsh-completion"

RDEPENDS:${PN} += "weave-gitops"

inherit rpm
