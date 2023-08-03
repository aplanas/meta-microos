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

PV = "2023.209.0.0.0.5_r1svn29020"

RPM_NAME = "texlive-concepts-2023.209.0.0.0.5_r1svn29020-54.1.noarch.rpm"
RPM_HASH = "84eaca51b0700bc6937d6eaaa20d9ef77525f486fab505f0dffc6e086613d0c05d78f1f6ecf5cfded2c9e5b14ba9f1a2ad289cdbd57e7c317487cce8419496ec"
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
