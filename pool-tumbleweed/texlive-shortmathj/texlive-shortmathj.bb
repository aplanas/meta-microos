SUMMARY = "Automatically shortify titles of mathematical journals"
DESCRIPTION = "This small dummy package just contains a simple list of full \
and short journal names aswritten in AMS standard: \
https://mathscinet.ams.org/msnhtml/serials.pdf"
LICENSE = "LPPL-1.0"

PV = "2023.209.0.0.5.0svn54407"

RPM_NAME = "texlive-shortmathj-2023.209.0.0.5.0svn54407-54.1.noarch.rpm"
RPM_HASH = "28ccf172f287752ac95fc1868f2ca47674e7baa10c24260c731dd2494684d6c270aaa698e242f517520304cce41a009b8c46473a2cc42da66e4f2dc44b0de59d"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-shortmathj.sty \
texlive-shortmathj"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-ifthen.sty \
tex-xstring.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
