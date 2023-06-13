SUMMARY = "Documentation for texlive-gender"
DESCRIPTION = "This package includes the documentation for texlive-gender"
LICENSE = "LPPL-1.0"

PV = "2023.201.1.0svn36464"

RPM_NAME = "texlive-gender-doc-2023.201.1.0svn36464-52.1.noarch.rpm"
RPM_HASH = "1fe22babbc9c9dd32444ab09bfa6862c068408c52b89f2511856ce2e88763a471b3f5b24d7a81821d65abfd96dd21ad0755d4cf93a62a0739f870f788f202e41"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-gender-doc"

RDEPENDS:${PN} += ""

inherit rpm
