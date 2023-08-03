SUMMARY = "Documentation for texlive-menucard"
DESCRIPTION = "This package includes the documentation for texlive-menucard"
LICENSE = "LPPL-1.0"

PV = "2023.209.0.0.1svn55643"

RPM_NAME = "texlive-menucard-doc-2023.209.0.0.1svn55643-55.1.noarch.rpm"
RPM_HASH = "afb1b52fed053dc33717859f57ab457b04000bcaff447ddcb3373f676540bee116121d13ddef7cf1bef6e9a23a00d163a6908cd87349aaba785ab818c4c87e8b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-menucard-doc"

RDEPENDS:${PN} += ""

inherit rpm
