SUMMARY = "Documentation for texlive-oplotsymbl"
DESCRIPTION = "This package includes the documentation for texlive-oplotsymbl"
LICENSE = "LPPL-1.0"

PV = "2023.209.1.4svn44951"

RPM_NAME = "texlive-oplotsymbl-doc-2023.209.1.4svn44951-55.1.noarch.rpm"
RPM_HASH = "69809d22d2aded59e20ebf9ff66552350461dc3ea17cc581895d978dcc0c274ac72918dc7d76bd88e9d3f7c6ab5a47996f93f685ca10e8d969ace51e1ec3e337"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-oplotsymbl-doc"

RDEPENDS:${PN} += ""

inherit rpm
