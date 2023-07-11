SUMMARY = "Documentation for texlive-here"
DESCRIPTION = "This package includes the documentation for texlive-here"
LICENSE = "SUSE-Public-Domain"

PV = "2023.201.svn16135"

RPM_NAME = "texlive-here-doc-2023.201.svn16135-53.2.noarch.rpm"
RPM_HASH = "2b7b974a1c73d64c3532850c63a7acf6a139685731dcb62a3f5bf99f36b01b291850f373963cc2e634b0533681cd8eb4b15bfd371742e1f2e32258b3d166df44"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-here-doc"

RDEPENDS:${PN} += ""

inherit rpm
