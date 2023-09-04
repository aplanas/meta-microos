SUMMARY = "Fish Completion for typst"
DESCRIPTION = "Fish command-line completion support for typst."
LICENSE = "Apache-2.0"

PV = "0.7.0"

RPM_NAME = "typst-fish-completion-0.7.0-1.1.noarch.rpm"
RPM_HASH = "98ed11aa253bf089dded88b1c1693e3dc6da45b267411ff084e7eff12000488a38c92d79ea5fb6a654dcb1c39cdb40ff6380112c314f5aba1509e313e13aa009"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "typst-fish-completion"

RDEPENDS:${PN} += ""

inherit rpm
