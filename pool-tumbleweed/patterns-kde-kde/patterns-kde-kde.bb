SUMMARY = "KDE Applications and Plasma 5 Desktop"
DESCRIPTION = "Packages providing the Plasma desktop environment and applications from KDE."
LICENSE = "MIT"

PV = "20230801"

RPM_NAME = "patterns-kde-kde-20230801-1.1.noarch.rpm"
RPM_HASH = "ae70cb1de19837d0867dceb522354cdb367535933792f51c5193a4767758d2a85b4d3a6fd3820aab0e01a4d32ffb6433311b5a20aa60856c5fde897aee748f22"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "pattern- \
pattern-category- \
pattern-icon- \
pattern-order- \
pattern-visible- \
patterns-kde-kde \
patterns-openSUSE-kde \
patterns-openSUSE-kde4"

RDEPENDS:${PN} += "pattern-"

inherit rpm
