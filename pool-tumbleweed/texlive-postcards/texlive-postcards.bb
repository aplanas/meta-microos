SUMMARY = "Facilitates mass-mailing of postcards (junkmail)"
DESCRIPTION = "A modification of the standard LaTeX letter class which prints \
multiple, pre-stamped, 5.5' by 3.5' postcards (a US standard \
size) via the envlab and mailing packages. An address database \
is employed to address the front side of each postcard and a \
message is printed on the back side of all. An illustrative \
example is provided."
LICENSE = "LPPL-1.0"

PV = "2023.201.svn21641"

RPM_NAME = "texlive-postcards-2023.201.svn21641-52.1.noarch.rpm"
RPM_HASH = "39e6c2f5ea15eadd82a7db7a73be4dbd7d5ca555d99c99a3a2f9b8f3b4c748bfd8a0a0e1d1105ec9d24498511b217bfd050f2db90227dcf8950f5a76cb7d20f8"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-postcards.cls \
texlive-postcards"

RDEPENDS:${PN} += "/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-letter.cls \
tex-mailing.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
