SUMMARY = "Documentation for texlive-cns"
DESCRIPTION = "This package includes the documentation for texlive-cns"
LICENSE = "SUSE-Public-Domain"

PV = "2023.209.4.2.0svn45677"

RPM_NAME = "texlive-cns-doc-2023.209.4.2.0svn45677-54.1.noarch.rpm"
RPM_HASH = "ab3cd2d36bf27c960a73e67aa157a92769cd2065a10cb31cdabdf5a0dbf7ed4d6db15863a022b4bfd643c6cc6690ad95a440c5fb0068ba944c82aabd3485e7b2"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-cns-doc"

RDEPENDS:${PN} += ""

inherit rpm
