SUMMARY = "Documentation for texlive-emp"
DESCRIPTION = "This package includes the documentation for texlive-emp"
LICENSE = "GPL-2.0-or-later"

PV = "2023.209.svn23483"

RPM_NAME = "texlive-emp-doc-2023.209.svn23483-54.2.noarch.rpm"
RPM_HASH = "7a770ea9c4dffd4299167027136249011a405ec8d5d1c4c8c08eb0ba291525931ad58da198bfd4c3ad1d6b671c6d2dad90447d46fc9538e141bf20c6a18668ae"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-emp-doc"

RDEPENDS:${PN} += ""

inherit rpm
