SUMMARY = "Bash completion for glab"
DESCRIPTION = "Bash command line completion support for glab."
LICENSE = "MIT"

PV = "1.30.0"

RPM_NAME = "glab-bash-completion-1.30.0-1.1.noarch.rpm"
RPM_HASH = "f6fae31d8481b54d381cd831aeb195e89d5b117e99d715ff5843cab4e004a63b9437069d994b1df3e1ff59fea077002b748247cd38fe671dd0c92fe7bea70338"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "glab-bash-completion"
RDEPENDS:${PN} += "glab"

inherit rpm
