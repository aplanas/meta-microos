SUMMARY = "Documentation for texlive-gmdoc"
DESCRIPTION = "This package includes the documentation for texlive-gmdoc"
LICENSE = "LPPL-1.0"

PV = "2023.201.0.0.993svn21292"

RPM_NAME = "texlive-gmdoc-doc-2023.201.0.0.993svn21292-53.2.noarch.rpm"
RPM_HASH = "ab3ba853629d4b621cb7f3d4a6f0946766e2e696326be844986adf5df0e241fd0cdbc45b3be41fdb09c743ead26d8dbac53850c05180b60d16a4c437374fc0b6"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-gmdoc-doc"

RDEPENDS:${PN} += ""

inherit rpm
