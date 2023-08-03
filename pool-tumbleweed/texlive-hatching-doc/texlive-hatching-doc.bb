SUMMARY = "Documentation for texlive-hatching"
DESCRIPTION = "This package includes the documentation for texlive-hatching"
LICENSE = "SUSE-Public-Domain"

PV = "2023.209.0.0.11svn23818"

RPM_NAME = "texlive-hatching-doc-2023.209.0.0.11svn23818-54.1.noarch.rpm"
RPM_HASH = "7b9e4f9292a04613cbc0800019820f40f9505bc190b229ac8e6b2f2d1c4d14313e8f69a7c21839759622fef173ac67e2b1bfdce1767e1007bf89d631e222bc25"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-hatching-doc"

RDEPENDS:${PN} += ""

inherit rpm
