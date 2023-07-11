SUMMARY = "Bash completion for herbstluftwm"
DESCRIPTION = "Bash completion for herbstclient"
LICENSE = "BSD-2-Clause"

PV = "0.9.5"

RPM_NAME = "herbstluftwm-bash-completion-0.9.5-1.5.noarch.rpm"
RPM_HASH = "5a496384387b019a367b69d42bd782178c63a14e1ddc15db4ae8f92cee5142597711dd6a7d7f65917ac0a7723bf00666ae17e00f80bf7da0227f3f2d799bb389"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "herbstluftwm-bash-completion"

RDEPENDS:${PN} += "bash-completion \
herbstluftwm"

inherit rpm
