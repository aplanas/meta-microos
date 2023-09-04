SUMMARY = "Allow URL breaks at any alphanumerical character"
DESCRIPTION = "This package loads url by default and defines possible URL \
breaks for all alphanumerical characters, as well as = / . : * \
- ~ ' ' All arguments which are valid for url can be used and \
will be passed on to this package. For more information read \
the documentation of url itself."
LICENSE = "LPPL-1.0"

PV = "2023.209.0.0.10svn61553"

RPM_NAME = "texlive-xurl-2023.209.0.0.10svn61553-53.2.noarch.rpm"
RPM_HASH = "20afd63b5cc3f72f9d860834b4ea7e88c452b545162bff4eb98516d457e6f1ba2f72a7d9fc3b2d4df8a123b1ad580abf5ef5d5ee3e781ef3be5531e5c294c671"
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
