SUMMARY = "Documentation for texlive-lroundrect"
DESCRIPTION = "This package includes the documentation for texlive-lroundrect"
LICENSE = "LPPL-1.0"

PV = "2023.209.1.0svn39804"

RPM_NAME = "texlive-lroundrect-doc-2023.209.1.0svn39804-55.1.noarch.rpm"
RPM_HASH = "505c112673ed7c59bf98bc6daceb3e5309f223a682d02c84b503930ef5cc4a59e108adec9642d861c25fb99e800f3af874080fb1c1fa8c0d6ef6f0d1a86af909"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-lroundrect-doc"

RDEPENDS:${PN} += ""

inherit rpm
