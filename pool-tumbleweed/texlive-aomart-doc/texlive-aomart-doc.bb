SUMMARY = "Documentation for texlive-aomart"
DESCRIPTION = "This package includes the documentation for texlive-aomart"
LICENSE = "LPPL-1.0"

PV = "2023.209.1.27svn63442"

RPM_NAME = "texlive-aomart-doc-2023.209.1.27svn63442-55.1.noarch.rpm"
RPM_HASH = "8ac1de585e7b8ecd8540e6dc69e7accca8c8d12bc8d5ae3192876e9526bcb68089990974fa8b798662bc3548f503272a587c03dff8b1ec6ac3c70548ae7aa900"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-aomart-doc"

RDEPENDS:${PN} += "/usr/bin/perl"

inherit rpm
