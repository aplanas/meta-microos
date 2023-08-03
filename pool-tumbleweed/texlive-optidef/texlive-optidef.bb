SUMMARY = "Environments for writing optimization problems"
DESCRIPTION = "This small library provides a standard set of environments for \
writing optimization problems. It automatically aligns the \
problems in three points with an optional fourth: Beginning of \
the words 'minimize/argmin' and 'subject to' The objective \
function and the longest left hand side of the constraints. The \
$= | > | <$ signs of the constraints. Optionally, the user can \
add manually a double align character && to align some common \
constraints feature. A clear example could be the constraints \
names, e.g. (boundary constraint) alignment with (dynamic \
constraint). Furthermore, it provides an easy interface to \
define optimization problem for three different reference \
situations: Where no equation is referenced/numbered. Where the \
problem is referenced with a single number. Where each equation \
has an individual reference. Finally, it also allows a \
definition of any optimization problem without a limitless \
number of constraints."
LICENSE = "LPPL-1.0"

PV = "2023.209.3.1svn50941"

RPM_NAME = "texlive-optidef-2023.209.3.1svn50941-55.1.noarch.rpm"
RPM_HASH = "cdd6643084cbe75278c382b2dc9e916242857eeee149ef9e6ab3ce6e422ba27f064755c942038779fa67e9aa274ea8f9a551d15d11318c2874f6d2e95638b67d"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-optidef.sty \
texlive-optidef"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-calc.sty \
tex-environ.sty \
tex-etoolbox.sty \
tex-mathtools.sty \
tex-xifthen.sty \
tex-xparse.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
