SUMMARY = "LaTeX pictures 'how-to' (German)"
DESCRIPTION = "The document (in German) is a collection of 'how-to' notes \
about LaTeX and pictures. The aim of the document is to provide \
a solution, in the form of some sample code, for every problem."
LICENSE = "GFDL-1.3-or-later"

PV = "2023.201.1.50svn19601"

RPM_NAME = "texlive-l2picfaq-2023.201.1.50svn19601-55.1.noarch.rpm"
RPM_HASH = "579d02a8e9364a8b656dd3ace02f0a974c296b613d45638cbcf808cfab9d1dd9dcc648c3a61828f65f4d80cadd88b98366fdb30626b530549e9185ca0d4e8e18"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-l2picfaq"

RDEPENDS:${PN} += "/bin/sh \
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
texlive-scripts-bin"

inherit rpm
