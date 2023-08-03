SUMMARY = "Documentation for texlive-chronology"
DESCRIPTION = "This package includes the documentation for texlive-chronology"
LICENSE = "LPPL-1.0"

PV = "2023.209.1.1.1svn37934"

RPM_NAME = "texlive-chronology-doc-2023.209.1.1.1svn37934-54.1.noarch.rpm"
RPM_HASH = "693ee925e1f5b0020d62f916a9262ea85e90166fe50aa7d5eaad99c4667edfa92375662628e86f4e1c8d0eeff44e94ec79f9f63abed18c74d198b783951aca44"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-chronology-doc"

RDEPENDS:${PN} += ""

inherit rpm
