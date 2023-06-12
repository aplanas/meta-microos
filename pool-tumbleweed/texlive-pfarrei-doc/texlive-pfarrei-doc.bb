SUMMARY = "Documentation for texlive-pfarrei"
DESCRIPTION = "This package includes the documentation for texlive-pfarrei"
LICENSE = "LPPL-1.0"

PV = "2023.201.r36svn31934"

RPM_NAME = "texlive-pfarrei-doc-2023.201.r36svn31934-51.1.noarch.rpm"
RPM_HASH = "a53d53dc16b4bb995464a2099ca06dca7b4b086718690ac5375d47c3a261c6af0a6816f4e97c46c7b9023a7a4036f66ed5f69e3b48522146953210ad9c137b75"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale(texlive-pfarrei-doc:de) \
texlive-pfarrei-doc"
RDEPENDS:${PN} += ""

inherit rpm
