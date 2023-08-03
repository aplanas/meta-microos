SUMMARY = "Write roman number with 'bars'"
DESCRIPTION = "'Bars', in the present context, are lines above and below text \
that abut with the text. Barred roman numerals are sometimes \
found in publications. The package provides a function that \
prints barred roman numerals (converting arabic numerals if \
necessary). The package also provides a predicate \\ifnumeric."
LICENSE = "LPPL-1.0"

PV = "2023.209.1.0fsvn25005"

RPM_NAME = "texlive-romanbar-2023.209.1.0fsvn25005-54.1.noarch.rpm"
RPM_HASH = "506582820d224462398a4e84732bb2272b3c1c8cce82ad209b7cf57cf6f8ff432d72c9f3ec47c4b5e57734da7478cc1bf6a509f273bcbdfa6133bf89d446b3b8"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-romanbar.sty \
texlive-romanbar"

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
