SUMMARY = "Documentation for texlive-eplain"
DESCRIPTION = "This package includes the documentation for texlive-eplain"
LICENSE = "GPL-2.0-or-later"

PV = "2023.209.3.13svn64721"

RPM_NAME = "texlive-eplain-doc-2023.209.3.13svn64721-54.1.noarch.rpm"
RPM_HASH = "6565baa169432a5ad3489486b2064aafab03276e4c4db7d961e7b17ecf522aa761d1f6f258ff35db80057880605a34b3c8890751720e11e751414324598d80ff"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "man-eplain.1 \
texlive-eplain-doc"

RDEPENDS:${PN} += "/usr/bin/awk \
/usr/bin/sh"

inherit rpm
