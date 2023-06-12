SUMMARY = "Documentation for texlive-changebar"
DESCRIPTION = "This package includes the documentation for texlive-changebar"
LICENSE = "LPPL-1.0"

PV = "2023.201.3.6dsvn63259"

RPM_NAME = "texlive-changebar-doc-2023.201.3.6dsvn63259-52.1.noarch.rpm"
RPM_HASH = "e682277128bd2086639dde62fa3007e217f062ba306a53056d078be89a510672fc6fb3f1d1d9aadbb13f7329c4b3e1d704e21f2e50ccf00366f379dc46afeb7f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-changebar-doc"
RDEPENDS:${PN} += ""

inherit rpm
