SUMMARY = "Documentation for texlive-tikz-bagua"
DESCRIPTION = "This package includes the documentation for texlive-tikz-bagua"
LICENSE = "LPPL-1.0"

PV = "2023.209.1.01svn64103"

RPM_NAME = "texlive-tikz-bagua-doc-2023.209.1.01svn64103-55.1.noarch.rpm"
RPM_HASH = "d651747f41c362d93d18a00576f12c182a317d0fe6887ff5509a01b1aa5e842bc757a568c2b4c243afe321453fd4b32d80a778ca70cca8a7cb4cccbf161c791c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale-texlive-tikz-bagua-doc-zh \
texlive-tikz-bagua-doc"

RDEPENDS:${PN} += ""

inherit rpm
