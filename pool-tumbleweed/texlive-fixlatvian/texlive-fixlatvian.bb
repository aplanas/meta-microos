SUMMARY = "Improve Latvian language support in XeLaTeX"
DESCRIPTION = "The package offers improvement of the Latvian language support \
in polyglossia, in particular in the area of the standard \
classes."
LICENSE = "LPPL-1.0"

PV = "2023.209.1asvn21631"

RPM_NAME = "texlive-fixlatvian-2023.209.1asvn21631-53.1.noarch.rpm"
RPM_HASH = "ed2f53fa5d7a913df1b713004ecd753420f6821cb15f2903c3e26bfc797bf0ee92ff89580f35bda7ff643af8d0a0e79c650b762ca0067ac3d02af6d63b639fd7"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-fixlatvian.sty \
texlive-fixlatvian"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-caption.sty \
tex-etoolbox.sty \
tex-icomma.sty \
tex-indentfirst.sty \
tex-perpage.sty \
tex-polyglossia.sty \
tex-svn-prov.sty \
tex-xstring.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
