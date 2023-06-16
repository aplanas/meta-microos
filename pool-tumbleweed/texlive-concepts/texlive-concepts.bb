SUMMARY = "Keeping track of formal 'concepts' for a particular field"
DESCRIPTION = "The package helps to keep track of formal 'concepts' for a \
specific field or document. This is particularly useful for \
scientific papers (for example, in physics, mathematics or \
computer science), which may introduce several concepts (with \
their own symbols). The package's commands allow the user to \
define a concept (typically, near its first use), and will \
ensure consistent use throughout the document. The package \
depends on several other packages; while these are fairly \
common packages, the user should check the package's README \
file for the complete list."
LICENSE = "LPPL-1.0"

PV = "2023.201.0.0.0.5_r1svn29020"

RPM_NAME = "texlive-concepts-2023.201.0.0.0.5_r1svn29020-53.1.noarch.rpm"
RPM_HASH = "ca91142ba00703b3179698739d997a8c1fed6ca6aeb01fa034c27e1acbba031ddda2c9cb7edc667420c3db080706e848bad24abf0567716dca70b743535424ed"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-concepts.sty \
texlive-concepts"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-etextools.sty \
tex-ltxkeys.sty \
tex-nth.sty \
tex-xparse.sty \
tex-xspace.sty \
tex-xstring.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
