SUMMARY = "Documentation for texlive-readarray"
DESCRIPTION = "This package includes the documentation for texlive-readarray"
LICENSE = "LPPL-1.0"

PV = "2023.209.3.1svn60540"

RPM_NAME = "texlive-readarray-doc-2023.209.3.1svn60540-54.2.noarch.rpm"
RPM_HASH = "8f2d0f46e5a68f323e201fa801c5d66fbc515cf8fa1a66f67e91d34ddfa98f021fbcc42c07a1dfbc67820d8b84d54403ccce2b24428fa9500a7229be9bdc7d95"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-readarray-doc"

RDEPENDS:${PN} += ""

inherit rpm
