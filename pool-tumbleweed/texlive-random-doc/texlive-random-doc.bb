SUMMARY = "Documentation for texlive-random"
DESCRIPTION = "This package includes the documentation for texlive-random"
LICENSE = "SUSE-Public-Domain"

PV = "2023.209.0.0.2svn54723"

RPM_NAME = "texlive-random-doc-2023.209.0.0.2svn54723-54.2.noarch.rpm"
RPM_HASH = "192bf45d58d32284fe6f7580c35b51452ee841fad76b0813ba9e1f9f41f07aa062f29088697c856afaa2170e1963fcbf315ea4bfb7b040a0ec4f9f35211306b0"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-random-doc"

RDEPENDS:${PN} += ""

inherit rpm
