SUMMARY = "Documentation for texlive-encxvlna"
DESCRIPTION = "This package includes the documentation for texlive-encxvlna"
LICENSE = "LPPL-1.0"

PV = "2023.209.1.1svn34087"

RPM_NAME = "texlive-encxvlna-doc-2023.209.1.1svn34087-54.2.noarch.rpm"
RPM_HASH = "547f8e97596704d008889072d96b8fbca227465ce90fbad6741dcaac4bc1c3657e0430b97b1c8430c9c8c5696d73279ee3f4b2bbabe3cd6ed2c549e1ed71efe6"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-encxvlna-doc"

RDEPENDS:${PN} += ""

inherit rpm
