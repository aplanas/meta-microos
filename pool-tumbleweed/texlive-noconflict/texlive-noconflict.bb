SUMMARY = "Resolve macro name conflict between packages"
DESCRIPTION = "The package provides several commands to prefix (and hence \
obscure) a macro's (or a sequence of macros') name, and to \
restore the original macro(s) at places in a document where \
they are needed."
LICENSE = "LPPL-1.0"

PV = "2023.209.1.0svn30140"

RPM_NAME = "texlive-noconflict-2023.209.1.0svn30140-55.1.noarch.rpm"
RPM_HASH = "81970dccd001d17eb056cea037748223c812b7145eb4563a1f29228a4ddec7bf3bb2d5bcfbf9fac2041419980a50050b98ef07a08100688420d88ac8f818c655"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-noconflict.sty \
texlive-noconflict"

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
