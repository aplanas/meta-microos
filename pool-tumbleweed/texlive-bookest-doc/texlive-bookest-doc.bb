SUMMARY = "Documentation for texlive-bookest"
DESCRIPTION = "This package includes the documentation for texlive-bookest"
LICENSE = "LPPL-1.0"

PV = "2023.209.1.1svn15878"

RPM_NAME = "texlive-bookest-doc-2023.209.1.1svn15878-53.1.noarch.rpm"
RPM_HASH = "919df6bd3c3d333eadbc101be9edb2041903f76c247af28638c4c698a7f6686fbc830cad261d78912369ab4fac9e1c796e11df1ecc57cf3d5f1b787563680799"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale-texlive-bookest-doc-en;it \
texlive-bookest-doc"

RDEPENDS:${PN} += ""

inherit rpm
