SUMMARY = "Catcode table stable support"
DESCRIPTION = "This package provides a method for defining category code table \
stacks in LuaTeX. It builds on code provided by the 2015/10/01 \
release of LaTeX2e (also available as ltluatex.sty for plain \
users). It is required by the luatexbase package (v1.0 onward) \
which uses ctablestack to provide a back-compatibility form of \
this concept."
LICENSE = "LPPL-1.0"

PV = "2023.204.1.0svn38514"

RPM_NAME = "texlive-ctablestack-2023.204.1.0svn38514-54.1.noarch.rpm"
RPM_HASH = "a8d6e7ac406160948c3840b9e958cf0f98512ae1f30056acb1024309ffa23f30564ab7d5aed2c13e9fa49a3e772b746f50845f201b81aa104eedadb8a56763d8"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-ctablestack.sty \
texlive-ctablestack"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
