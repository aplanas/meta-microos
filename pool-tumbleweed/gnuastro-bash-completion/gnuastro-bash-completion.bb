SUMMARY = "Bash completion for gnuastro"
DESCRIPTION = "Bash command line completion support for gnuastro"
LICENSE = "GPL-3.0-or-later"

PV = "0.19"

RPM_NAME = "gnuastro-bash-completion-0.19-1.11.noarch.rpm"
RPM_HASH = "d64a8c2e5adf40ad9742a5d480acdbb6af890a42274778d072b3c60bd21b6552f84a15d4f2b9cd9f64408990c4e8d7feb7afd110c41464f7739ed3869dcdf58e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "gnuastro-bash-completion"

RDEPENDS:${PN} += "bash-completion"

inherit rpm
