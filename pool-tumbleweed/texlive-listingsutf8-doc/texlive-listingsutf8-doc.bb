SUMMARY = "Documentation for texlive-listingsutf8"
DESCRIPTION = "This package includes the documentation for texlive-listingsutf8"
LICENSE = "LPPL-1.0"

PV = "2023.209.1.5svn53097"

RPM_NAME = "texlive-listingsutf8-doc-2023.209.1.5svn53097-55.1.noarch.rpm"
RPM_HASH = "710540f1c012691fb1c362e379f51a3de9eff96213c0393130eef8cdd2c4b891ab25633765578e730026b4f3cb73f0160c05666f3d53417de308ca97b35ca5d1"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale-texlive-listingsutf8-doc-en \
texlive-listingsutf8-doc"

RDEPENDS:${PN} += ""

inherit rpm
