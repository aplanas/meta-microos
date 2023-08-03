SUMMARY = "Hyperlinks for a wide range of URIs"
DESCRIPTION = "The package provides automatic hyperlinks for URIs of type \
arXiv, ASIN, DOI, HDL, NBN, OCLC, OID, PubMed, TINY, TINY with \
preview, and WebCite and provides commands \\citeurl, \\mailto, \
\\ukoeln, and \\uref."
LICENSE = "LPPL-1.0"

PV = "2023.209.2.0bsvn48602"

RPM_NAME = "texlive-uri-2023.209.2.0bsvn48602-54.1.noarch.rpm"
RPM_HASH = "80affcfbb7a405d79ac7f13a58a2915e1f641bf5904c3fab843246535f4b80c86587563cf774d01aa47e14993b48a8c51178151cbf666187b518a19ba8a58953"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-uri.sty \
texlive-uri"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-kvoptions.sty \
tex-url.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
