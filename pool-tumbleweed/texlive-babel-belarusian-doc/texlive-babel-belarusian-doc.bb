SUMMARY = "Documentation for texlive-babel-belarusian"
DESCRIPTION = "This package includes the documentation for texlive-babel-belarusian"
LICENSE = "LPPL-1.0"

PV = "2023.201.1.5svn49022"

RPM_NAME = "texlive-babel-belarusian-doc-2023.201.1.5svn49022-53.1.noarch.rpm"
RPM_HASH = "56374db2c6cc9151506feab62a74a66037da2d0d4c36d565b3afe33fb9ccb3308527319124229b36ae84b82125a56c38556dbfd8ba502c27a7ec7fdb38279f37"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-babel-belarusian-doc"

RDEPENDS:${PN} += ""

inherit rpm
