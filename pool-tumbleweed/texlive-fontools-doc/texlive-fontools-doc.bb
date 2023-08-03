SUMMARY = "Documentation for texlive-fontools"
DESCRIPTION = "This package includes the documentation for texlive-fontools"
LICENSE = "GPL-2.0-or-later"

PV = "2023.209.svn65706"

RPM_NAME = "texlive-fontools-doc-2023.209.svn65706-53.1.noarch.rpm"
RPM_HASH = "723d24a17b0296fb251bdbb7c1f658f6d802d700dc698b8bb30db95e7592f4bf0d44aeac485d666b35870626b845e44010a6bf2852694a7406062632066dc1c8"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "man-afm2afm.1 \
man-autoinst.1 \
man-ot2kpx.1 \
texlive-fontools-doc"

RDEPENDS:${PN} += "/usr/bin/perl"

inherit rpm
