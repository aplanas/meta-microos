SUMMARY = "Bash Completion for fnotifystat"
DESCRIPTION = "Bash completion script for fnotifystat."
LICENSE = "GPL-2.0-or-later"

PV = "0.02.06"

RPM_NAME = "fnotifystat-bash-completion-0.02.06-1.13.noarch.rpm"
RPM_HASH = "c43ac435145c1c132f6abcf4db5817a81a0db185bb5b7cbeafeae507bbc5988915576aa2bcf68903026702dda7a373f641be5b374ba12bc01f2bf59c000a3f5a"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "fnotifystat-bash-completion"

RDEPENDS:${PN} += "bash-completion \
fnotifystat"

inherit rpm
