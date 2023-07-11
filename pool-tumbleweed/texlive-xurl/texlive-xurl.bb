SUMMARY = "Allow URL breaks at any alphanumerical character"
DESCRIPTION = "This package loads url by default and defines possible URL \
breaks for all alphanumerical characters, as well as = / . : * \
- ~ ' ' All arguments which are valid for url can be used and \
will be passed on to this package. For more information read \
the documentation of url itself."
LICENSE = "LPPL-1.0"

PV = "2023.201.0.0.10svn61553"

RPM_NAME = "texlive-xurl-2023.201.0.0.10svn61553-52.2.noarch.rpm"
RPM_HASH = "d6fd330c5a7ebc2b8fa5fd14da28a1d000204dab4748eea6dda8517e3e211b01aaed562778d2cd8bc4b1f1129dac9a3c3854e2c40bda5ce298b8d1acd2267955"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-xurl.sty \
texlive-xurl"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-url.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
