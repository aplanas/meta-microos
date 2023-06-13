SUMMARY = "Documentation for texlive-clicks"
DESCRIPTION = "This package includes the documentation for texlive-clicks"
LICENSE = "LPPL-1.0"

PV = "2023.201.0.0.4.1svn64602"

RPM_NAME = "texlive-clicks-doc-2023.201.0.0.4.1svn64602-53.1.noarch.rpm"
RPM_HASH = "e7648f12d21fecbd3a184720fb68c8335efe88edf9b0a02ca7b919ee288e9a3ac452212d5ee048c25b9119401ec33d392bb6cb71777100b8cd48b7f671264115"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-clicks-doc"

RDEPENDS:${PN} += ""

inherit rpm
