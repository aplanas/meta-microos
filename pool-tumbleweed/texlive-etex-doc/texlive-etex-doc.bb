SUMMARY = "Documentation for texlive-etex"
DESCRIPTION = "This package includes the documentation for texlive-etex"
LICENSE = "SUSE-TeX"

PV = "2023.209.svn66203"

RPM_NAME = "texlive-etex-doc-2023.209.svn66203-53.1.noarch.rpm"
RPM_HASH = "9d4845a5c2b68cba456f741a1b87352047ba22e33d26b6ec3325912f34c97b7be8087280975a56895be3aa38e509d4e5d101ebf4512d653a16014628be6e8ae0"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "man-etex.1 \
texlive-etex-doc"

RDEPENDS:${PN} += ""

inherit rpm
