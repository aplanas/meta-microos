SUMMARY = "A simplified documentation for tlmgr"
DESCRIPTION = "This package provides simplified documentation for tlmgr, the \
TeX Live Manager. It describes the most commonly-used actions \
and options in a convenient format."
LICENSE = "GPL-2.0-or-later"

PV = "2023.201.svn66271"

RPM_NAME = "texlive-tlmgrbasics-2023.201.svn66271-52.1.noarch.rpm"
RPM_HASH = "216a57f039d9fb5064dd34abf9769f82e31689b5e99b5f9c81f043fc0d776e9c4ea5bd59638685b7e1ac238cce9c46c28626f3b5d382b3dbd8b638128e8af205"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-tlmgrbasics"

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
texlive-scripts \
texlive-scripts-bin"

inherit rpm
