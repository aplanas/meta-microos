SUMMARY = "Documentation for texlive-xetex-pstricks"
DESCRIPTION = "This package includes the documentation for texlive-xetex-pstricks"
LICENSE = "SUSE-Public-Domain"

PV = "2023.201.svn17055"

RPM_NAME = "texlive-xetex-pstricks-doc-2023.201.svn17055-52.2.noarch.rpm"
RPM_HASH = "42aef80311615371a07323226d5b02b4801c3faa68b36ee0c2d65094ce79063b3881aa3ed5d10c0211aa8956507cab757632fb85048d874eaeb21a469571da35"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-xetex-pstricks-doc"

RDEPENDS:${PN} += ""

inherit rpm
