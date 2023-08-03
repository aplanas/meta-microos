SUMMARY = "Documentation for texlive-drs"
DESCRIPTION = "This package includes the documentation for texlive-drs"
LICENSE = "LPPL-1.0"

PV = "2023.209.1.1bsvn19232"

RPM_NAME = "texlive-drs-doc-2023.209.1.1bsvn19232-53.1.noarch.rpm"
RPM_HASH = "a53000c18145ebb3a13f89116939c46998b1d5516b6018e5c06c3eef8286973416a36fde89c3da866364ebe9068cb75a1a904bc8653d434707321d07fa3ca01f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-drs-doc"

RDEPENDS:${PN} += ""

inherit rpm
