SUMMARY = "Documentation for texlive-prftree"
DESCRIPTION = "This package includes the documentation for texlive-prftree"
LICENSE = "GPL-2.0-or-later"

PV = "2023.209.1.6svn54080"

RPM_NAME = "texlive-prftree-doc-2023.209.1.6svn54080-53.1.noarch.rpm"
RPM_HASH = "d1633531749f7ae52a7f9069bb2e3f4daa0ca9d2663757ccd59a770b14cbb5440cae816fac560347d0abc2a8cf5b506a74f634831f00a26ae9cc5502cc4cf444"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-prftree-doc"

RDEPENDS:${PN} += ""

inherit rpm
