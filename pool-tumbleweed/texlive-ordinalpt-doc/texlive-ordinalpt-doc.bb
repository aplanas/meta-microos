SUMMARY = "Documentation for texlive-ordinalpt"
DESCRIPTION = "This package includes the documentation for texlive-ordinalpt"
LICENSE = "LPPL-1.0"

PV = "2023.201.2.1svn15878"

RPM_NAME = "texlive-ordinalpt-doc-2023.201.2.1svn15878-54.1.noarch.rpm"
RPM_HASH = "6737efe4600419302efdb68984a7a78ef8e84f10645dc252919e8b52ea3018bdf3339a3056bc90e55656a3f1c09ae32939937a4b49ac2bf2dff012780a05c761"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-ordinalpt-doc"

RDEPENDS:${PN} += ""

inherit rpm
