SUMMARY = "Fish completion for flameshot"
DESCRIPTION = "Fish command line completion support for flameshot."
LICENSE = "GPL-3.0-only"

PV = "12.1.0"

RPM_NAME = "flameshot-fish-completion-12.1.0-2.2.noarch.rpm"
RPM_HASH = "051d601ef1306aff4b159931e6fb7420dc08a8dbcab6cb3d5da53758c09775b4039f3a2f2ce5c1697dbc74563a0f6a364109df29dfbd63fe498af0fa0c399256"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "flameshot-fish-completion"

RDEPENDS:${PN} += "flameshot"

inherit rpm
