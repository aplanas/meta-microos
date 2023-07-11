SUMMARY = "Documentation for texlive-ebook"
DESCRIPTION = "This package includes the documentation for texlive-ebook"
LICENSE = "SUSE-Public-Domain"

PV = "2023.201.svn29466"

RPM_NAME = "texlive-ebook-doc-2023.201.svn29466-53.2.noarch.rpm"
RPM_HASH = "62aa3e176cb326a4b0903b580d96a307b60488ac1771b07aad7486c826847b894769962d5c8e637a157419cf89ace2322b3ee9eaaa411b688a904031fbe8cedb"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-ebook-doc"

RDEPENDS:${PN} += ""

inherit rpm
