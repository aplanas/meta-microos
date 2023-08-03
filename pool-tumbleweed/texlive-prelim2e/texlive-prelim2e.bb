SUMMARY = "Allows the marking of preliminary versions of a document"
DESCRIPTION = "Puts text below the normal page content (the default text marks \
the document as draft and puts a timestamp on it). Can be used \
together with e.g. the vrsion, rcs and rcsinfo packages. Uses \
the everyshi package and can use the scrtime package from the \
koma-script bundle."
LICENSE = "LPPL-1.0"

PV = "2023.209.2.00svn57000"

RPM_NAME = "texlive-prelim2e-2023.209.2.00svn57000-53.1.noarch.rpm"
RPM_HASH = "262ea3dafe2644f1fffa8896ccf966c262a7774e12c7c681558874d0ecde8bfc7aa9dc8d642ce14f805d6b2f2044ea257b52a486c1230e6888511c44181fcdf0"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-prelim2e.sty \
texlive-prelim2e"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-scrtime.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
