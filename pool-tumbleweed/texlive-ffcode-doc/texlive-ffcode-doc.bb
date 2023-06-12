SUMMARY = "Documentation for texlive-ffcode"
DESCRIPTION = "This package includes the documentation for texlive-ffcode"
LICENSE = "LPPL-1.0"

PV = "2023.201.0.0.8.0svn65170"

RPM_NAME = "texlive-ffcode-doc-2023.201.0.0.8.0svn65170-52.1.noarch.rpm"
RPM_HASH = "a80a3edebac21a05d9009ad378214eec71c893ceecb37876d9a6cbda18aa6952dde70c8da64b10afa5a411e507ea93453b7f34471b6761fa5a00eabc02da05cf"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-ffcode-doc"
RDEPENDS:${PN} += ""

inherit rpm
