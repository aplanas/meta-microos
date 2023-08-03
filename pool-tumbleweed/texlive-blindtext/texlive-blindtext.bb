SUMMARY = "Producing 'blind' text for testing"
DESCRIPTION = "The package provides the commands \\blindtext and \\Blindtext for \
creating 'blind' text useful in testing new classes and \
packages, and \\blinddocument, \\Blinddocument for creating an \
entire random document with sections, lists, mathematics, etc. \
The package supports three languages, english, (n)german and \
latin; the latin option provides a short 'lorem ipsum' (for a \
fuller lorem ipsum text, see the lipsum package)."
LICENSE = "LPPL-1.0"

PV = "2023.209.2.0svn25039"

RPM_NAME = "texlive-blindtext-2023.209.2.0svn25039-53.1.noarch.rpm"
RPM_HASH = "1f0770f2c262be0770383c591fc8a551e802bdd7ed6c0907b7d0aa8154394b8ee4b921f1d4ea31af441d376fee87aab692e5b1a0e42624b0074bf13c2714f1a8"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-blindtext.sty \
texlive-blindtext"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-xspace.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
