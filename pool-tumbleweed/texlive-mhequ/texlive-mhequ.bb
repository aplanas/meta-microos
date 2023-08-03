SUMMARY = "Multicolumn equations, tags, labels, sub-numbering"
DESCRIPTION = "The mhequ style file simplifies creating multi-column equation \
environments and tagging equations therein. It supports \
sub-numbering of blocks of equations (like (1.2a), (1.2b), etc) \
and references to each equation individually (1.2a) or to the \
whole block (1.2). The labels can be shown in draft mode. The \
default behaviour is to show an equation number if and only if \
the equation actually has a label, which reduces visual \
clutter. Comments in the package itself describe its usage, \
which should also be self-evident from the provided example \
file."
LICENSE = "SUSE-Public-Domain"

PV = "2023.209.1.72svn64978"

RPM_NAME = "texlive-mhequ-2023.209.1.72svn64978-55.1.noarch.rpm"
RPM_HASH = "eea231f8774973b328e19884e30e1d8c1fd74d3bbcb5c6768ef8136d42e6acc32fdaf13278ec104920a35d6073a4ba55bda26fffc69d5e0af019bf82b5e3ffa6"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-mhequ.sty \
texlive-mhequ"

RDEPENDS:${PN} += "/usr/bin/sh \
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
