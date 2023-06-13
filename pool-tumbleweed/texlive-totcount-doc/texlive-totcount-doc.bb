SUMMARY = "Documentation for texlive-totcount"
DESCRIPTION = "This package includes the documentation for texlive-totcount"
LICENSE = "LPPL-1.0"

PV = "2023.201.1.2svn21178"

RPM_NAME = "texlive-totcount-doc-2023.201.1.2svn21178-52.1.noarch.rpm"
RPM_HASH = "8dbcca62afaee509f346ce98268973096e966a6bd23e5496d5e3fd42e68e6d45809a4d4aabf97c7195d7f70eb8220707abe51af9f2121a4f263c91cd97422c53"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-totcount-doc"

RDEPENDS:${PN} += ""

inherit rpm
