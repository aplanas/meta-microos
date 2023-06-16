SUMMARY = "Improve Latvian language support in XeLaTeX"
DESCRIPTION = "The package offers improvement of the Latvian language support \
in polyglossia, in particular in the area of the standard \
classes."
LICENSE = "LPPL-1.0"

PV = "2023.201.1asvn21631"

RPM_NAME = "texlive-fixlatvian-2023.201.1asvn21631-52.1.noarch.rpm"
RPM_HASH = "6aa4e2dc479adf279b77d427567f903a6537b613eb629ea2f35688fb7134d6ef1c1f457fd456686a01878d4831c6bc50ed981d45cc7ea5c69258b494190fb574"
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
