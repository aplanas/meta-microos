SUMMARY = "Documentation for texlive-addliga"
DESCRIPTION = "This package includes the documentation for texlive-addliga"
LICENSE = "SUSE-Public-Domain"

PV = "2023.201.1.0svn50912"

RPM_NAME = "texlive-addliga-doc-2023.201.1.0svn50912-54.1.noarch.rpm"
RPM_HASH = "3ebf75aba4c0fca3ae28c72c996ab45ed2e791e65f1186982078a0bac104890c9cec5eba4b7a19b7635bd43d4041fb7d6bd724671257042c669ad71a22f75a48"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-addliga-doc"

RDEPENDS:${PN} += ""

inherit rpm
