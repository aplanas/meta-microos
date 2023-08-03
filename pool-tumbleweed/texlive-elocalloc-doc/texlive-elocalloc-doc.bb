SUMMARY = "Documentation for texlive-elocalloc"
DESCRIPTION = "This package includes the documentation for texlive-elocalloc"
LICENSE = "LPPL-1.0"

PV = "2023.209.0.0.03svn42712"

RPM_NAME = "texlive-elocalloc-doc-2023.209.0.0.03svn42712-54.1.noarch.rpm"
RPM_HASH = "de332adb3407776ca38ffb0c2eba89ed2284306fe2a03915dde668dc944ab224cf4d5c83d19f248067a747f99534bc92921dbfd9d76b57cac02e0df083668560"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-elocalloc-doc"

RDEPENDS:${PN} += ""

inherit rpm
