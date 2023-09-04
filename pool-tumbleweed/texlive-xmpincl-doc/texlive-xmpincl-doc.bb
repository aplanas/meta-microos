SUMMARY = "Documentation for texlive-xmpincl"
DESCRIPTION = "This package includes the documentation for texlive-xmpincl"
LICENSE = "GPL-2.0-or-later"

PV = "2023.209.2.4svn60593"

RPM_NAME = "texlive-xmpincl-doc-2023.209.2.4svn60593-53.2.noarch.rpm"
RPM_HASH = "6c0b3474b5e44dedaa72228f379be0639b54f78a6af7ed032383bbbb0f84c7372e7a04aa427c551b4286094d7fa766b48579440d6745b68cde8e14fc8db65b94"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-xmpincl-doc"

RDEPENDS:${PN} += ""

inherit rpm
