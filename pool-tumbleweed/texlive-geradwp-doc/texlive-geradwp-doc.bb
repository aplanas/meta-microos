SUMMARY = "Documentation for texlive-geradwp"
DESCRIPTION = "This package includes the documentation for texlive-geradwp"
LICENSE = "LPPL-1.0"

PV = "2023.201.1.1svn63134"

RPM_NAME = "texlive-geradwp-doc-2023.201.1.1svn63134-52.1.noarch.rpm"
RPM_HASH = "bd9f42a936d138c60261b33e98037545375d0e59a6b20d984b7da49b0c65b6ae29f5b246ed3088c95045982ede2165e1d43b9449c92b86200219ead2619b391b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale(texlive-geradwp-doc:fr) \
texlive-geradwp-doc"

RDEPENDS:${PN} += ""

inherit rpm
