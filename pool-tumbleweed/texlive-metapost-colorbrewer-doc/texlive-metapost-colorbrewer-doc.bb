SUMMARY = "Documentation for texlive-metapost-colorbrewer"
DESCRIPTION = "This package includes the documentation for texlive-metapost-colorbrewer"
LICENSE = "GPL-2.0-or-later"

PV = "2023.201.svn48753"

RPM_NAME = "texlive-metapost-colorbrewer-doc-2023.201.svn48753-54.1.noarch.rpm"
RPM_HASH = "a3223659fbbc1f0c05d9e9bc0aa7ee1663815db6695fb98a17f020af0898d789f28520196c584873e1665c03bfb317996e276721ab536bc155d9695e981d9c15"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-metapost-colorbrewer-doc"

RDEPENDS:${PN} += "/usr/bin/python3"

inherit rpm
