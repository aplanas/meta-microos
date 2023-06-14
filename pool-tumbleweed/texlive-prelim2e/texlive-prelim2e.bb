SUMMARY = "Allows the marking of preliminary versions of a document"
DESCRIPTION = "Puts text below the normal page content (the default text marks \
the document as draft and puts a timestamp on it). Can be used \
together with e.g. the vrsion, rcs and rcsinfo packages. Uses \
the everyshi package and can use the scrtime package from the \
koma-script bundle."
LICENSE = "LPPL-1.0"

PV = "2023.201.2.00svn57000"

RPM_NAME = "texlive-prelim2e-2023.201.2.00svn57000-52.1.noarch.rpm"
RPM_HASH = "fcbbc461efbfaeb7806d87266bcfd2b39c980f80d70390c053cc1760332b0e0ceb79b319ba66005d63e631e8dcb78a55b1761007dc0019bf6f53a906c85e1dbd"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-prelim2e.sty \
texlive-prelim2e"

RDEPENDS:${PN} += "/bin/sh \
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
