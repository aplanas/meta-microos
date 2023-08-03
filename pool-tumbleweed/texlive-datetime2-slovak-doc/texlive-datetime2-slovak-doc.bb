SUMMARY = "Documentation for texlive-datetime2-slovak"
DESCRIPTION = "This package includes the documentation for texlive-datetime2-slovak"
LICENSE = "LPPL-1.0"

PV = "2023.209.1.1svn52281"

RPM_NAME = "texlive-datetime2-slovak-doc-2023.209.1.1svn52281-53.1.noarch.rpm"
RPM_HASH = "b543941cf3cdc515826a56e572680a19985baf76c71de3b5dc078ac21b808f5c6b459fe7d58bac7e8d6ba720c578d7ede295b569610aec9ce8fc47556fe4318e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-datetime2-slovak-doc"

RDEPENDS:${PN} += ""

inherit rpm
