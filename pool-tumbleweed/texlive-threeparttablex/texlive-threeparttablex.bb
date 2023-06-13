SUMMARY = "Notes in longtables"
DESCRIPTION = "The package provides the functionality of the threeparttable \
package to tables created using the longtable package."
LICENSE = "LPPL-1.0"

PV = "2023.201.0.0.3svn34206"

RPM_NAME = "texlive-threeparttablex-2023.201.0.0.3svn34206-54.1.noarch.rpm"
RPM_HASH = "3c8868d27172cef25bdf1b7f1b4f8d0b3bcd020a0bed823f0a2e46bb8d23f4f1fa7d4f7e36d026e96da78784f00c06b2a8c78bdbab18e535b71612c46a1ba677"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex(threeparttablex.sty) \
texlive-threeparttablex"

RDEPENDS:${PN} += "/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex(environ.sty) \
tex(threeparttable.sty) \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
