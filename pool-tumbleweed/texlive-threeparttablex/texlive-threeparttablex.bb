SUMMARY = "Notes in longtables"
DESCRIPTION = "The package provides the functionality of the threeparttable \
package to tables created using the longtable package."
LICENSE = "LPPL-1.0"

PV = "2023.209.0.0.3svn34206"

RPM_NAME = "texlive-threeparttablex-2023.209.0.0.3svn34206-55.1.noarch.rpm"
RPM_HASH = "aa50ac9d1b5b96fe27886fcb39fea6fd4b2cb718e19bedd9db94b0325a5eda80e591a47fe47cae2170ef240b4493a60be59a56726d534bf5e832f9b977973bf4"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-threeparttablex.sty \
texlive-threeparttablex"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-environ.sty \
tex-threeparttable.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
