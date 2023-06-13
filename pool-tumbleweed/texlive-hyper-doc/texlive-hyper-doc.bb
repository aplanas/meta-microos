SUMMARY = "Documentation for texlive-hyper"
DESCRIPTION = "This package includes the documentation for texlive-hyper"
LICENSE = "LPPL-1.0"

PV = "2023.201.4.2dsvn17357"

RPM_NAME = "texlive-hyper-doc-2023.201.4.2dsvn17357-52.1.noarch.rpm"
RPM_HASH = "9290cfb3bf41923593443bbf178357c835fe28f490595fb7ff3c9d417d57fbc6fcefa8d67a037a38433681bd3617d05d265644265819052b95a6f0a941201290"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-hyper-doc"

RDEPENDS:${PN} += ""

inherit rpm
