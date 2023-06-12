SUMMARY = "Fish Completion for yadm"
DESCRIPTION = "The official fish completion script for yadm."
LICENSE = "GPL-3.0-only"

PV = "3.2.2"

RPM_NAME = "yadm-fish-completion-3.2.2-1.1.noarch.rpm"
RPM_HASH = "23bf4b18bbd044d8856f257748e389995574cb125da624fe761330c8d2e8da503314ab166537e4804307857e5e183fb50a0d1ebd7d05c001e05cc776a2ccae2a"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "yadm-fish-completion"
RDEPENDS:${PN} += ""

inherit rpm
