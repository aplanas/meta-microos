SUMMARY = "Collect blocks of references into a single reference"
DESCRIPTION = "The package automatically collects multiple \\bibitem \
references, which always appear in the same sequence in \\cite, \
into a single \\bibitem block."
LICENSE = "LPPL-1.0"

PV = "2023.201.2.0csvn46358"

RPM_NAME = "texlive-collref-2023.201.2.0csvn46358-53.1.noarch.rpm"
RPM_HASH = "c0cd115f59f066e95f55bda0b69a7dd2034422879c16dedee34936969dc85577e1ad949cd44fd8477257dc53920850b4395698b46c92e2244b49a2fb1fd371c4"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex(collref.sty) \
texlive-collref"
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
