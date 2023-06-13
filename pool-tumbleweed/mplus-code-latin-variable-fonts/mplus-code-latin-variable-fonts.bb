SUMMARY = "Variable M PLUS Code Latin font"
DESCRIPTION = "A monospaced variable font that can be adjusted for both \
weight and width."
LICENSE = "OFL-1.1"

PV = "20230116"

RPM_NAME = "mplus-code-latin-variable-fonts-20230116-1.1.noarch.rpm"
RPM_HASH = "b5f93779c366e0abda395cce29e296b0344898b580fc0984092128e977d4975876331784f840556092f8fe38c672d6addb8aa723aca8feb460d132c94d603688"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "mplus-code-latin-variable-fonts"

RDEPENDS:${PN} += "/bin/sh \
aaa_base \
coreutils \
perl"

inherit rpm
