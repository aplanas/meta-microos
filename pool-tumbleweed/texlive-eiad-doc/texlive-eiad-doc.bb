SUMMARY = "Documentation for texlive-eiad"
DESCRIPTION = "This package includes the documentation for texlive-eiad"
LICENSE = "SUSE-Public-Domain"

PV = "2023.209.svn15878"

RPM_NAME = "texlive-eiad-doc-2023.209.svn15878-54.2.noarch.rpm"
RPM_HASH = "ae69d4c87c756c6e60e8336963750a5900753cdde071344caf1a1cdb53ca735462d4919d341f854227cc395ab096f7044b63eb59ac8239af9be5602648586971"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-eiad-doc"

RDEPENDS:${PN} += ""

inherit rpm
