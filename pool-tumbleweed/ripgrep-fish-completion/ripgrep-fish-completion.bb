SUMMARY = "Fish Completion for ripgrep"
DESCRIPTION = "The official fish completion script for ripgrep, generated during the build."
LICENSE = "MIT & Unlicense"

PV = "13.0.0"

RPM_NAME = "ripgrep-fish-completion-13.0.0-5.4.noarch.rpm"
RPM_HASH = "2b24f865873244a55b8bf328e8e25cf0c7f575a03511ecce7056e62d666424dabf433736667f64121899d66adbf92c360ee393eaf9bd426993f1176c1767fd9f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "ripgrep-fish-completion"

RDEPENDS:${PN} += ""

inherit rpm
