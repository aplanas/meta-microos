SUMMARY = "A high-quality TrueType font that supports the many diverse languages that use the Myanmar script"
DESCRIPTION = "Padauk is a Unicode-based font family with broad support for \
writing systems that use the Myanmar script."
LICENSE = "OFL-1.1"

PV = "2023.209.3.002svn42617"

RPM_NAME = "texlive-padauk-2023.209.3.002svn42617-52.1.noarch.rpm"
RPM_HASH = "e62a2e662a14b26893dad4160110e8b87b278e7e1fba4b35f97deda3331d17e22ee733927227f9952feffbffae5f1cb51484ac6554f9ed7b60919d7441ef6e58"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-padauk"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-padauk-fonts \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
