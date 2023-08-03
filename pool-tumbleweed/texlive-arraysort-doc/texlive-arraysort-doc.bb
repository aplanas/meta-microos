SUMMARY = "Documentation for texlive-arraysort"
DESCRIPTION = "This package includes the documentation for texlive-arraysort"
LICENSE = "LPPL-1.0"

PV = "2023.209.1.0svn31576"

RPM_NAME = "texlive-arraysort-doc-2023.209.1.0svn31576-54.1.noarch.rpm"
RPM_HASH = "d8250f84711ca1b62198acd6f4ac679553aac44f9bf384b6a8e6ec231d051662af63fcc86b3bc783e5cdbc44cf4900ec9b448bf5a8fa4754053f060fa2bbec9c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-arraysort-doc"

RDEPENDS:${PN} += ""

inherit rpm
