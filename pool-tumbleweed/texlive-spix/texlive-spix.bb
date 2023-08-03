SUMMARY = "Yet another TeX compilation tool: simple, human readable, no option, no magic"
DESCRIPTION = "SpiX offers a way to store information about the compilation \
process for a tex file inside the tex file itself. Just write \
the commands as comments in the tex files, and SpiX will \
extract and run those commands. Everything is stored in the tex \
file (so that you are not missing some piece of information \
that is located somewhere else), in a human-readable format (no \
need to know SpiX to understand it)."
LICENSE = "GPL-2.0-or-later"

PV = "2023.209.1.3.0svn65050"

RPM_NAME = "texlive-spix-2023.209.1.3.0svn65050-58.1.noarch.rpm"
RPM_HASH = "08d75cad472ce997c99c863611f69a148a9bf7846b7088cba8fdc9a3052d5dffa312b0ad32b2186c0ebe659dd66f187b2b1a2367f2e8630f488c2ad66a65ea12"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-spix"

RDEPENDS:${PN} += "/usr/bin/python3 \
/usr/bin/sh \
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
texlive-scripts-bin \
texlive-spix-bin"

inherit rpm
