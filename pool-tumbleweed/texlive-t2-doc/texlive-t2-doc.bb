SUMMARY = "Documentation for texlive-t2"
DESCRIPTION = "This package includes the documentation for texlive-t2"
LICENSE = "LPPL-1.0"

PV = "2023.209.svn47870"

RPM_NAME = "texlive-t2-doc-2023.209.svn47870-58.1.noarch.rpm"
RPM_HASH = "bff26afddb3832ae6108881814983856a323ac8891220cced9afd2186f70a54e3f6323b9bf64f70270d8530666afebfc2c48bc3af38f37d42c22342f4d7b3f0b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-t2-doc"

RDEPENDS:${PN} += "/usr/bin/perl \
/usr/bin/sh"

inherit rpm
