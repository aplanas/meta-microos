SUMMARY = "German version of chemsym"
DESCRIPTION = "This is a 'translation' of the chemsym documentation."
LICENSE = "LPPL-1.0"

PV = "2023.209.svn23804"

RPM_NAME = "texlive-translation-chemsym-de-2023.209.svn23804-53.1.noarch.rpm"
RPM_HASH = "04c61b281200f816925a63cffb10f32c9e6362feba6e1ff0f915853bc8ab598f4d27b8af9674f187ef3673afbc4318381d733fab39657462c762726eb30ff5f8"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-translation-chemsym-de"

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
