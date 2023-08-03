SUMMARY = "Create and manipulate lists of symbols"
DESCRIPTION = "Listofsymbols provides commands to automatically create a list \
of symbols (also called notation or nomenclature), and to \
handle symbols logically, i.e. define a macro that is expanded \
to the desired output and use the macro in the text rather than \
`hardcoding' the output into the text. This helps to ensure \
consistency throughout the text, especially if there is a \
chance that symbols will be changed at some stage. The package \
is more or less a combination of what the packages nomencl and \
formula do. The concept of creating the list of symbols, \
though, is different from the way nomencl.sty does it."
LICENSE = "LPPL-1.0"

PV = "2023.209.0.0.2svn16134"

RPM_NAME = "texlive-listofsymbols-2023.209.0.0.2svn16134-55.1.noarch.rpm"
RPM_HASH = "c5c99314ddea8bbd4738bfc3757ad74ebcb71b4ffc1edd55a7325925497d77bf67cebd9bdf1e977230eb10b6c403228547f84aa236265ceaec08c20d548d9a36"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-listofsymbols.sty \
texlive-listofsymbols"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-calc.sty \
tex-ifthen.sty \
tex-nomencl.sty \
tex-xspace.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
