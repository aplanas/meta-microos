SUMMARY = "Documentation for texlive-mhequ"
DESCRIPTION = "This package includes the documentation for texlive-mhequ"
LICENSE = "SUSE-Public-Domain"

PV = "2023.209.1.72svn64978"

RPM_NAME = "texlive-mhequ-doc-2023.209.1.72svn64978-55.1.noarch.rpm"
RPM_HASH = "df78ba6e859b0cabf426c1c821832cd77fa320c2013619f7ba0af03ea8fa5e494dde8ab52d7686a65a153576df40d36b62bc198e11d5f8069083520274010f81"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-mhequ-doc"

RDEPENDS:${PN} += ""

inherit rpm
