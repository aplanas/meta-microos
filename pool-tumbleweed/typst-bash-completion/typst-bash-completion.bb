SUMMARY = "Bash Completion for typst"
DESCRIPTION = "Bash command-line completion support for typst."
LICENSE = "Apache-2.0"

PV = "0.5.0"

RPM_NAME = "typst-bash-completion-0.5.0-1.1.noarch.rpm"
RPM_HASH = "70ab3f54de467c1d9aa9db4f3d0c60ea93e9694160b8d7a20f713003da22c45928f15f222709455c52ea290604bafc72029d8d260134e8de2467a6d33e8e999a"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "typst-bash-completion"

RDEPENDS:${PN} += ""

inherit rpm
