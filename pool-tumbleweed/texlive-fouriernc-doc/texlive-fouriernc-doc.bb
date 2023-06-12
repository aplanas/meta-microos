SUMMARY = "Documentation for texlive-fouriernc"
DESCRIPTION = "This package includes the documentation for texlive-fouriernc"
LICENSE = "LPPL-1.0"

PV = "2023.201.svn29646"

RPM_NAME = "texlive-fouriernc-doc-2023.201.svn29646-52.1.noarch.rpm"
RPM_HASH = "9c01b0b5fe48260bf02b35530fb3853c4fcc6e6f45950d5efc5901eb63d44b8051cf70c90e8e1ffccc43fcb4d6f3a71c4889cfb460da4cba4b5a72352c48d641"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-fouriernc-doc"
RDEPENDS:${PN} += ""

inherit rpm
