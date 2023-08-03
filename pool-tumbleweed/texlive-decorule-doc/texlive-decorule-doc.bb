SUMMARY = "Documentation for texlive-decorule"
DESCRIPTION = "This package includes the documentation for texlive-decorule"
LICENSE = "LPPL-1.0"

PV = "2023.209.0.0.7svn55230"

RPM_NAME = "texlive-decorule-doc-2023.209.0.0.7svn55230-53.1.noarch.rpm"
RPM_HASH = "0b52c5a5adfaffbf0db80dd3d6c897235fddb0f293c1e1f5f3ef870385e3ca1cfd6b505ae55dc175582d55a4d2876bf89cefd593e7bb8f88ef955e27e3efc4e4"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-decorule-doc"

RDEPENDS:${PN} += ""

inherit rpm
