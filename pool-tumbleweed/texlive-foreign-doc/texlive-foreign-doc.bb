SUMMARY = "Documentation for texlive-foreign"
DESCRIPTION = "This package includes the documentation for texlive-foreign"
LICENSE = "LPPL-1.0"

PV = "2023.209.2.7svn27819"

RPM_NAME = "texlive-foreign-doc-2023.209.2.7svn27819-53.1.noarch.rpm"
RPM_HASH = "76ddffc006284113f3c8d2d1739a780ec526c571c7ca4f64cf463e43ac121038532ed06de853c3934f87fc6b8017c84968c82a94d0082cd27054f926163b6b13"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-foreign-doc"

RDEPENDS:${PN} += ""

inherit rpm
