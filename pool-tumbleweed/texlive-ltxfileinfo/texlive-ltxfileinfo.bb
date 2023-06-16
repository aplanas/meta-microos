SUMMARY = "Print version information for a LaTeX file"
DESCRIPTION = "ltxfileinfo displays version information for LaTeX files. If no \
path information is given, the file is searched using \
kpsewhich. As an extra, for developers, the script will (use \
the --star or --color options) check the valididity of the \
\\Provides... statements in the files. The script uses code from \
Uwe Luck's readprov.sty."
LICENSE = "GPL-2.0-or-later"

PV = "2023.201.2.04svn38663"

RPM_NAME = "texlive-ltxfileinfo-2023.201.2.04svn38663-52.1.noarch.rpm"
RPM_HASH = "6112b01c9cf6dc9cfe791fd0e274e33cec3aec760eb2b97a5451d0a597e2b5b490c1bcaa0c7d732e3602d89706f5cc84f67e7847f869948ff9f78fea001b77ad"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-ltxfileinfo"

RDEPENDS:${PN} += "/usr/bin/bash \
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
texlive-ltxfileinfo-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
