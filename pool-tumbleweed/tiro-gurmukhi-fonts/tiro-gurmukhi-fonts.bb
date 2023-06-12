SUMMARY = "Tiro Gurmukhi Fonts"
DESCRIPTION = "Tiro Gurmukhi has its origins in a typeface designed for the \
Murty Classical Library of India book series, so is especially suited to \
traditional literary publishing but also made with the needs of today’s \
multiple print and screen media in mind."
LICENSE = "OFL-1.1"

PV = "1.52"

RPM_NAME = "tiro-gurmukhi-fonts-1.52-1.2.noarch.rpm"
RPM_HASH = "c38e56d862dd6ed6f8e443a98f41ca8fdf02056093d9cdda946efcc86f3f86f18b70ec89fa231f614777fc721cfe42ebbc1326c253b377da56ff443111842878"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tiro-gurmukhi-fonts"
RDEPENDS:${PN} += "/bin/sh \
aaa_base \
coreutils \
perl"

inherit rpm
