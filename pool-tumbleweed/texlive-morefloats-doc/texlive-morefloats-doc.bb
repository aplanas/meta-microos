SUMMARY = "Documentation for texlive-morefloats"
DESCRIPTION = "This package includes the documentation for texlive-morefloats"
LICENSE = "LPPL-1.0"

PV = "2023.209.1.0hsvn37927"

RPM_NAME = "texlive-morefloats-doc-2023.209.1.0hsvn37927-55.1.noarch.rpm"
RPM_HASH = "7f3927b6e917d06887f5cc56faf824833828c640f6fc05d146baf1850313f99d1dc775f49fe7112251b87b4e075732bfdcbb7d31c778db2c2aa729cfdff5b9bc"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-morefloats-doc"

RDEPENDS:${PN} += ""

inherit rpm
