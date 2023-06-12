SUMMARY = "Documentation for texlive-fntproof"
DESCRIPTION = "This package includes the documentation for texlive-fntproof"
LICENSE = "SUSE-Public-Domain"

PV = "2023.201.svn20638"

RPM_NAME = "texlive-fntproof-doc-2023.201.svn20638-52.1.noarch.rpm"
RPM_HASH = "4cbd86f8fddc3f4d3c6d23729cf8fbd7f747a74c40a5542e6e871563370cdd5b7d0e2f13b94b7e2dc35fbfaa377a2ace58228c0a203c0e46cfe8a1170f8fbaed"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-fntproof-doc"
RDEPENDS:${PN} += ""

inherit rpm
