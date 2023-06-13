SUMMARY = "Documentation for texlive-grundgesetze"
DESCRIPTION = "This package includes the documentation for texlive-grundgesetze"
LICENSE = "GPL-2.0-or-later"

PV = "2023.201.1.03svn58997"

RPM_NAME = "texlive-grundgesetze-doc-2023.201.1.03svn58997-53.1.noarch.rpm"
RPM_HASH = "50e6243ba7f7d4ae331c9b7b6f2ba129c847734ac9df2818e49bcfa21da69a177f7f7462637621a9573e7807696af03e2f49c2aaedb14d1a85dcbe5c53ba831c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-grundgesetze-doc"

RDEPENDS:${PN} += ""

inherit rpm
