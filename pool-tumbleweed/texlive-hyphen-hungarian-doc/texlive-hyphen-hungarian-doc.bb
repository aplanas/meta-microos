SUMMARY = "Documentation for texlive-hyphen-hungarian"
DESCRIPTION = "This package includes the documentation for texlive-hyphen-hungarian"
LICENSE = "GPL-2.0-or-later"

PV = "2023.209.svn58652"

RPM_NAME = "texlive-hyphen-hungarian-doc-2023.209.svn58652-54.1.noarch.rpm"
RPM_HASH = "c7ef8f6efe2b1eafe8996ae63493286fe38ef48acd19010e9f70405824b427ffdb45de9634d6a3fdc359fc2406c7e3f1384f13b9be13ad09d75a5cf8c3817d70"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-hyphen-hungarian-doc"

RDEPENDS:${PN} += "/usr/bin/ruby"

inherit rpm
