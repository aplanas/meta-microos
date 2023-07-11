SUMMARY = "Print version information for a LaTeX file"
DESCRIPTION = "ltxfileinfo displays version information for LaTeX files. If no \
path information is given, the file is searched using \
kpsewhich. As an extra, for developers, the script will (use \
the --star or --color options) check the valididity of the \
\\Provides... statements in the files. The script uses code from \
Uwe Luck's readprov.sty."
LICENSE = "GPL-2.0-or-later"

PV = "2023.208.2.04svn38663"

RPM_NAME = "texlive-ltxfileinfo-2023.208.2.04svn38663-53.1.noarch.rpm"
RPM_HASH = "eca56f6f360c055dbc60dfd3c7e3f9bb30c27567106117e080152fa8538572fcfb0ed1cfdbe740fd58741f4238a4284470af262915973e37fae4f7697ade197e"
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
