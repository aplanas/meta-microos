SUMMARY = "Documentation for texlive-isotope"
DESCRIPTION = "This package includes the documentation for texlive-isotope"
LICENSE = "LPPL-1.0"

PV = "2023.209.0.0.3svn23711"

RPM_NAME = "texlive-isotope-doc-2023.209.0.0.3svn23711-56.1.noarch.rpm"
RPM_HASH = "2de2e003c5f70574742b350a40c7de18f759cdb4afd755a2bbbf9f5e06732a3bdca76903b485666da31c6c8d2ac8c81fd8a6976d3a7ac4f6ca0465c522f53fcb"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-isotope-doc"

RDEPENDS:${PN} += ""

inherit rpm
