SUMMARY = "Typesetting Ecclesiastic Latin"
DESCRIPTION = "The package modifies the way the latin option to babel operates \
when typesetting Latin. The style is somewhat 'frenchified' in \
respect of punctuation spacings and footnote style; shortcuts \
are available in order to set accents on all vowels, including \
y and the diphthongs ae and oe."
LICENSE = "LPPL-1.0"

PV = "2023.201.0.0.3svn38172"

RPM_NAME = "texlive-ecclesiastic-2023.201.0.0.3svn38172-53.2.noarch.rpm"
RPM_HASH = "dac7c2a162bfba503acd8ce81f8972c0b6f06cef8ae525b5343e36c2e7e44f86a29cd0726237e9d6f45fb5d2644b9261331a9568e7f6fff121cb4ebdf2038da6"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-ecclesiastic.sty \
texlive-ecclesiastic"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-iftex.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
