SUMMARY = "User-friendly integration of Asymptote into LaTeX"
DESCRIPTION = "The package is an unofficial alternative to the package \
provided with the Asymptote distribution, for including \
pictures within a LaTeX source file. While it does not \
duplicate all the features of the official package, this \
package is more user-friendly in several ways. Most notably, \
Asymptote errors are repackaged as LaTeX errors, making \
debugging less of a pain. It also has a more robust mechanism \
for identifying unchanged pictures that need not be recompiled."
LICENSE = "LPPL-1.0"

PV = "2023.209.0.0.3svn33490"

RPM_NAME = "texlive-asypictureb-2023.209.0.0.3svn33490-54.1.noarch.rpm"
RPM_HASH = "9441a8a2cabb387e74ca369cadbb3b40e90be56bd1e0d07dd3274c5e6bb16db5fb73675affe78326cc26be0dcaacb23373fdb72832613b17a68647b950f61ee7"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-asypictureB.sty \
texlive-asypictureb"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-fancyvrb.sty \
tex-graphicx.sty \
tex-ifplatform.sty \
tex-pgfkeys.sty \
tex-verbatimcopy.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
