SUMMARY = "Documentation for texlive-emp"
DESCRIPTION = "This package includes the documentation for texlive-emp"
LICENSE = "GPL-2.0-or-later"

PV = "2023.209.svn23483"

RPM_NAME = "texlive-emp-doc-2023.209.svn23483-54.1.noarch.rpm"
RPM_HASH = "d13f0a21cebdac989454b60d8f381c63bf9f5f75e045ee38389d2610686be11704799b01c2db87dcf2b5bedd8726a84cf2ad0450c53367fa8d14914a7a79f788"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-emp-doc"

RDEPENDS:${PN} += ""

inherit rpm
