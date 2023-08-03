SUMMARY = "Documentation for texlive-cancel"
DESCRIPTION = "This package includes the documentation for texlive-cancel"
LICENSE = "SUSE-Public-Domain"

PV = "2023.209.2.2svn32508"

RPM_NAME = "texlive-cancel-doc-2023.209.2.2svn32508-53.1.noarch.rpm"
RPM_HASH = "1b6e2f4e7a7ab8e25b61a991eaef84e1b89a46ec4da0ee905bc3a762ada43174265d70b942eeac3073fb9318febac1119665cd1045a94e4a8a3482d8878e67a2"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-cancel-doc"

RDEPENDS:${PN} += ""

inherit rpm
