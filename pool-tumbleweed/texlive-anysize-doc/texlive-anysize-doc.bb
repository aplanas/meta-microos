SUMMARY = "Documentation for texlive-anysize"
DESCRIPTION = "This package includes the documentation for texlive-anysize"
LICENSE = "SUSE-Public-Domain"

PV = "2023.209.svn15878"

RPM_NAME = "texlive-anysize-doc-2023.209.svn15878-55.1.noarch.rpm"
RPM_HASH = "52f42f6ef9c572d857b71a7e536f9e015b4e9dba57274003000be7a95116d669e5a5c8213f4a82fbee34f9c4ab4f26118f8bc0bfc280a656d881f3d980b3fbea"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-anysize-doc"

RDEPENDS:${PN} += ""

inherit rpm
