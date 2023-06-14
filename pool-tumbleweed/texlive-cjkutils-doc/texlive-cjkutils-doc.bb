SUMMARY = "Documentation for texlive-cjkutils"
DESCRIPTION = "This package includes the documentation for texlive-cjkutils"
LICENSE = "GPL-2.0-or-later"

PV = "2023.201.4.8.5svn60833"

RPM_NAME = "texlive-cjkutils-doc-2023.201.4.8.5svn60833-53.1.noarch.rpm"
RPM_HASH = "c1e9da145b9547939f56820f05acc6268c27c6bfa68d332586f99666ad57da83d4e3658810356b9a60ef7b30d7fc79bc70887fac5a6195732a378610332b86aa"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "man-bg5conv.1 \
man-cef5conv.1 \
man-cefconv.1 \
man-cefsconv.1 \
man-extconv.1 \
man-hbf2gf.1 \
man-sjisconv.1 \
texlive-cjkutils-doc"

RDEPENDS:${PN} += ""

inherit rpm
