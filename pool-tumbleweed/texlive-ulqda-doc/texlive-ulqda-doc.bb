SUMMARY = "Documentation for texlive-ulqda"
DESCRIPTION = "This package includes the documentation for texlive-ulqda"
LICENSE = "LPPL-1.0"

PV = "2023.209.1.1svn26313"

RPM_NAME = "texlive-ulqda-doc-2023.209.1.1svn26313-54.1.noarch.rpm"
RPM_HASH = "717af80dc4ef48b2b0e5fd9d9aab1ce10985e12f3c175744b2184e9c0a7f267f39cb1d8a9dd31315c26176cd51af264ffa2e62aec3e6c012825348b9bc51e451"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-ulqda-doc"

RDEPENDS:${PN} += ""

inherit rpm
