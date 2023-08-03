SUMMARY = "Allow URL breaks at any alphanumerical character"
DESCRIPTION = "This package loads url by default and defines possible URL \
breaks for all alphanumerical characters, as well as = / . : * \
- ~ ' ' All arguments which are valid for url can be used and \
will be passed on to this package. For more information read \
the documentation of url itself."
LICENSE = "LPPL-1.0"

PV = "2023.209.0.0.10svn61553"

RPM_NAME = "texlive-xurl-2023.209.0.0.10svn61553-53.1.noarch.rpm"
RPM_HASH = "f0c1e7f378b7152622cf5c7b459bd8e1be5e002381f79ec16f52bfb223f1a6ceed017072a1c3108ca6ad34c7b5a027836848bc59e10a82d8b78b95709e99d5ef"
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
