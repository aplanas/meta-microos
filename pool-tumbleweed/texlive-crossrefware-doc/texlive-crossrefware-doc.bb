SUMMARY = "Documentation for texlive-crossrefware"
DESCRIPTION = "This package includes the documentation for texlive-crossrefware"
LICENSE = "GPL-2.0-or-later"

PV = "2023.209.svn64754"

RPM_NAME = "texlive-crossrefware-doc-2023.209.svn64754-55.1.noarch.rpm"
RPM_HASH = "bfdece90007b247c08af3451cfa3ee28db1e6c9e041e0d8bb3a9d2076b465caa5fbf4090ce749529ba8ed65f229286acc5426b7475751be90ccb146ef4ec84b8"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "man-bbl2bib.1 \
man-bibdoiadd.1 \
man-bibmradd.1 \
man-biburl2doi.1 \
man-bibzbladd.1 \
man-ltx2crossrefxml.1 \
texlive-crossrefware-doc"

RDEPENDS:${PN} += ""

inherit rpm
