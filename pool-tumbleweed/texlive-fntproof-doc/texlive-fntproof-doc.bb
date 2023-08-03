SUMMARY = "Documentation for texlive-fntproof"
DESCRIPTION = "This package includes the documentation for texlive-fntproof"
LICENSE = "SUSE-Public-Domain"

PV = "2023.209.svn20638"

RPM_NAME = "texlive-fntproof-doc-2023.209.svn20638-53.1.noarch.rpm"
RPM_HASH = "d29bc76658176c2a57f8382847336ffda5fb566d286ddfc8aaa58c7cf41abf9b28a117be02608aab0bac8ec853526071b7e5c94346f51a411ff70219d5f3f234"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-fntproof-doc"

RDEPENDS:${PN} += ""

inherit rpm
