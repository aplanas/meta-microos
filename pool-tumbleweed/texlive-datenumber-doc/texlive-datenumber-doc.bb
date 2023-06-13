SUMMARY = "Documentation for texlive-datenumber"
DESCRIPTION = "This package includes the documentation for texlive-datenumber"
LICENSE = "LPPL-1.0"

PV = "2023.204.0.0.03svn61761"

RPM_NAME = "texlive-datenumber-doc-2023.204.0.0.03svn61761-54.1.noarch.rpm"
RPM_HASH = "426b706244141b182f2258d25cd140109c27e8e5a4753026c68f2c4538f93ca52c7b81b2359c80e1c342d71cd90d153ef0a018b8382cbadb8bbfa6f563e1233f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale(texlive-datenumber-doc:de) \
texlive-datenumber-doc"

RDEPENDS:${PN} += ""

inherit rpm
