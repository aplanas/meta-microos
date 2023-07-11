SUMMARY = "Consistent quote marks"
DESCRIPTION = "The package provides a means of ensuring consistent quote marks \
throughout your document. The style can be changed either via \
package option or command, and the package detects language \
selections (from the babel or ngerman packages), and uses the \
punctuation marks appropriate for the current language. The \
author now considers the package obsolete, and recommends use \
of csquotes in its place."
LICENSE = "LPPL-1.0"

PV = "2023.201.1.0svn15878"

RPM_NAME = "texlive-quotmark-2023.201.1.0svn15878-53.2.noarch.rpm"
RPM_HASH = "f04ea933927ddfe69b5a4b1920c6c6274f4c50f9093ccc19da0510ff00b950b713a668a7358bf2c56244a070ded302810a63eeb7f36cf90584f08c6403253f56"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-quotmark-UKenglish.def \
tex-quotmark-USenglish.def \
tex-quotmark-afrikaans.def \
tex-quotmark-brazil.def \
tex-quotmark-bulgarian.def \
tex-quotmark-catalan.def \
tex-quotmark-croatian.def \
tex-quotmark-czech.def \
tex-quotmark-danish.def \
tex-quotmark-dutch.def \
tex-quotmark-estonian.def \
tex-quotmark-finnish.def \
tex-quotmark-frenchb.def \
tex-quotmark-germanb.def \
tex-quotmark-greek.def \
tex-quotmark-hebrew.def \
tex-quotmark-icelandic.def \
tex-quotmark-irish.def \
tex-quotmark-italian.def \
tex-quotmark-magyar.def \
tex-quotmark-ngermanb.def \
tex-quotmark-norsk.def \
tex-quotmark-polish.def \
tex-quotmark-portuges.def \
tex-quotmark-romanian.def \
tex-quotmark-russianb.def \
tex-quotmark-serbian.def \
tex-quotmark-slovak.def \
tex-quotmark-slovene.def \
tex-quotmark-sorbian.def \
tex-quotmark-spanish.def \
tex-quotmark-swedish.def \
tex-quotmark-swiss.def \
tex-quotmark-turkish.def \
tex-quotmark-ukraineb.def \
tex-quotmark-welsh.def \
tex-quotmark.sty \
texlive-quotmark"

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
