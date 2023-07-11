SUMMARY = "Translations for package matrix-quaternion"
DESCRIPTION = "Provides translations for the 'matrix-quaternion' package."
LICENSE = "GPL-3.0-only"

PV = "0.0.95.1"

RPM_NAME = "matrix-quaternion-lang-0.0.95.1-1.12.noarch.rpm"
RPM_HASH = "4cdce28fd6629c3cb4875fb46e6dd64db1e3e6f133f69c03301d12828e62723807a402a798274c468214f7c68ea782c20872f49b8edc0a86927fff3468e80deb"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "matrix-quaternion-lang \
matrix-quaternion-lang-all"

RDEPENDS:${PN} += "matrix-quaternion"

inherit rpm
