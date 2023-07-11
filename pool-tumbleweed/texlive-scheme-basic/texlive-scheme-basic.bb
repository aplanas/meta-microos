SUMMARY = "Basic scheme (plain and latex)"
DESCRIPTION = "This is the basic TeX Live scheme: it is a small set of files \
sufficient to typeset plain TeX or LaTeX documents in \
PostScript or PDF, using the Computer Modern fonts. This scheme \
corresponds to collection-basic and collection-latex."
LICENSE = "LPPL-1.0"

PV = "2023.208.svn54191"

RPM_NAME = "texlive-scheme-basic-2023.208.svn54191-60.1.noarch.rpm"
RPM_HASH = "8a1e7f04450b856e417b5066de291841cf47c7f32115f32508fb17fea335dc88597b93ac8d41d240c7e08102b0de598b8fbe47003bf13a564b8e91da60a984ed"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-scheme-basic"

RDEPENDS:${PN} += "texlive-collection-basic \
texlive-collection-latex"

inherit rpm
