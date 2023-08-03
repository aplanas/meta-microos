SUMMARY = "Documentation for texlive-stringstrings"
DESCRIPTION = "This package includes the documentation for texlive-stringstrings"
LICENSE = "LPPL-1.0"

PV = "2023.209.1.24svn57097"

RPM_NAME = "texlive-stringstrings-doc-2023.209.1.24svn57097-58.1.noarch.rpm"
RPM_HASH = "823c8b3518567ea53ef6434f91b8417eaa381e8fa01c0863ec98b338b27750eb2eba0b31d22774418b0321e0758d21f89bfe14b946c68ec2d1621a287c6e5444"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-stringstrings-doc"

RDEPENDS:${PN} += ""

inherit rpm
