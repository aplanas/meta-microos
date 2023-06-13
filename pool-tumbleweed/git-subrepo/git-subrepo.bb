SUMMARY = "Git Submodule Alternative"
DESCRIPTION = "This git command 'clones' an external git repo into a subdirectory of your \
repo. Later on, upstream changes can be pulled in, and local changes can be \
pushed back. Simple."
LICENSE = "MIT"

PV = "0.4.6"

RPM_NAME = "git-subrepo-0.4.6-1.1.noarch.rpm"
RPM_HASH = "6c4969f1ca24fb6a6bf730e60cc9e6d603835e0fbaa36c22606b0880b8a51fd840c21e9cb6045525b3b4401cbd4f23959f3f231e4941cacb0e2942954cc73a37"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "git-subrepo"

RDEPENDS:${PN} += "/bin/bash \
bash \
git-core"

inherit rpm
