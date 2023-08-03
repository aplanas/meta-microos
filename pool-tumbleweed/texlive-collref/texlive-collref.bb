SUMMARY = "Collect blocks of references into a single reference"
DESCRIPTION = "The package automatically collects multiple \\bibitem \
references, which always appear in the same sequence in \\cite, \
into a single \\bibitem block."
LICENSE = "LPPL-1.0"

PV = "2023.209.2.0csvn46358"

RPM_NAME = "texlive-collref-2023.209.2.0csvn46358-54.1.noarch.rpm"
RPM_HASH = "74164dc801f4d0e8e3db0ae509a3df8b9f63c18a796a9475ea41175272505ec2e0a912ed89f334105fc70a4b7dff8b570e26a76a52ddd3722e42a6782b7ec7fa"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-collref.sty \
texlive-collref"

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
