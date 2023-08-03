SUMMARY = "Documentation for texlive-l3backend"
DESCRIPTION = "This package includes the documentation for texlive-l3backend"
LICENSE = "LPPL-1.0"

PV = "2023.209.svn65573"

RPM_NAME = "texlive-l3backend-doc-2023.209.svn65573-56.1.noarch.rpm"
RPM_HASH = "e263a6b5d1c81f590fcddcf2374f4103a9959a86114d9ca64bec4536abc5cfe24dbfc07b9ea53c30a3c4443ce7593c269d2b4cb8b424d7492f6e3491de709068"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-l3backend-doc"

RDEPENDS:${PN} += ""

inherit rpm
