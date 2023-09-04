SUMMARY = "Documentation for texlive-ebook"
DESCRIPTION = "This package includes the documentation for texlive-ebook"
LICENSE = "SUSE-Public-Domain"

PV = "2023.209.svn29466"

RPM_NAME = "texlive-ebook-doc-2023.209.svn29466-54.2.noarch.rpm"
RPM_HASH = "ed7525e4f8b65955e285f5b47aaa5e5c0543c7fe76c11c58bfb539f1d807dfee512e04d93c43a1af1c8fd9e0479dd8fe68eee559d11f54d3d7a68245704c5947"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-ebook-doc"

RDEPENDS:${PN} += ""

inherit rpm
