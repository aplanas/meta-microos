SUMMARY = "Zsh completion for herbstluftwm"
DESCRIPTION = "ZSH completion for herbstclient"
LICENSE = "BSD-2-Clause"

PV = "0.9.5"

RPM_NAME = "herbstluftwm-zsh-completion-0.9.5-1.4.noarch.rpm"
RPM_HASH = "1b6446f5b7db7805d18925744386f376770037753266851dc484a6b86f70ef29f5da2fcd2030bc82d48b2b2340a90f3c8540366a42a60101a9ee217438dbe3ca"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "herbstluftwm-zsh-completion"

RDEPENDS:${PN} += "herbstluftwm"

inherit rpm
