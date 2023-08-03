SUMMARY = "Documentation for texlive-elvish"
DESCRIPTION = "This package includes the documentation for texlive-elvish"
LICENSE = "LPPL-1.0"

PV = "2023.209.svn15878"

RPM_NAME = "texlive-elvish-doc-2023.209.svn15878-54.1.noarch.rpm"
RPM_HASH = "6c659ebfd0c597f56efaafa8b5e2bfdcc5ce589b6b37c862a30946285a669308cc555df56fa863b85c6d1e7d4c7c5bba1af6a701716620c2274dc154ccd4fe9b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-elvish-doc"

RDEPENDS:${PN} += ""

inherit rpm
