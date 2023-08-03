SUMMARY = "Documentation for texlive-bangla"
DESCRIPTION = "This package includes the documentation for texlive-bangla"
LICENSE = "LPPL-1.0"

PV = "2023.209.2.1svn65786"

RPM_NAME = "texlive-bangla-doc-2023.209.2.1svn65786-54.1.noarch.rpm"
RPM_HASH = "b7813029de34830d9e81d7796d20d1d567ae3ed0caa77017ab00542974907bdf8afab962e54d68d524ac1d959c84d10607e0ca63ac11bd0c04d55880104d3816"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-bangla-doc"

RDEPENDS:${PN} += ""

inherit rpm
