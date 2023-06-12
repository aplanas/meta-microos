SUMMARY = "Documentation for texlive-mailing"
DESCRIPTION = "This package includes the documentation for texlive-mailing"
LICENSE = "LPPL-1.0"

PV = "2023.201.svn15878"

RPM_NAME = "texlive-mailing-doc-2023.201.svn15878-52.1.noarch.rpm"
RPM_HASH = "71ec19dc9ca4beeec75b0e9459b5c6312de2b2c25ff5df129a695db2283421303e580b995c8a2abd1addee36c26a0cd6f11b072b3ae49743b1bf6f726e5541c6"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-mailing-doc"
RDEPENDS:${PN} += ""

inherit rpm
