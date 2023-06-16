SUMMARY = "Producing 'blind' text for testing"
DESCRIPTION = "The package provides the commands \\blindtext and \\Blindtext for \
creating 'blind' text useful in testing new classes and \
packages, and \\blinddocument, \\Blinddocument for creating an \
entire random document with sections, lists, mathematics, etc. \
The package supports three languages, english, (n)german and \
latin; the latin option provides a short 'lorem ipsum' (for a \
fuller lorem ipsum text, see the lipsum package)."
LICENSE = "LPPL-1.0"

PV = "2023.201.2.0svn25039"

RPM_NAME = "texlive-blindtext-2023.201.2.0svn25039-52.1.noarch.rpm"
RPM_HASH = "817c1edc5e3f2afe324223bd2ca77a8548e08a502ddf385b9205858c74f15b71fcbd00ca78e7234d3abebbc775bd15e8af8f66e6db6c7b0183ef8bd540bae851"
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
