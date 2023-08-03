SUMMARY = "Documentation for texlive-brandeis-problemset"
DESCRIPTION = "This package includes the documentation for texlive-brandeis-problemset"
LICENSE = "LPPL-1.0"

PV = "2023.209.0.0.5.5svn50991"

RPM_NAME = "texlive-brandeis-problemset-doc-2023.209.0.0.5.5svn50991-53.1.noarch.rpm"
RPM_HASH = "1557a2578c4b5f6c22c7fc557b9c8ba6a3c2382c404e53f45633dcef551524ecede21d6320946a51ea28cf881677866811f4ad18ceb1cdbb7289de9487a97244"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-brandeis-problemset-doc"

RDEPENDS:${PN} += ""

inherit rpm
