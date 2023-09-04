SUMMARY = "Documentation for texlive-pst-qtree"
DESCRIPTION = "This package includes the documentation for texlive-pst-qtree"
LICENSE = "GPL-2.0-or-later"

PV = "2023.209.svn15878"

RPM_NAME = "texlive-pst-qtree-doc-2023.209.svn15878-54.2.noarch.rpm"
RPM_HASH = "63911394caced6f5ef63b9db9db24f16ed8db44264e67cf79882c777fee7aab8b29e4721f8ee7321ac17fa888eb5a3cb058abf7aca31cbe159d58f946eed1074"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-pst-qtree-doc"

RDEPENDS:${PN} += ""

inherit rpm
