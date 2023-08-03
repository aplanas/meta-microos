SUMMARY = "Facilitates mass-mailing of postcards (junkmail)"
DESCRIPTION = "A modification of the standard LaTeX letter class which prints \
multiple, pre-stamped, 5.5' by 3.5' postcards (a US standard \
size) via the envlab and mailing packages. An address database \
is employed to address the front side of each postcard and a \
message is printed on the back side of all. An illustrative \
example is provided."
LICENSE = "LPPL-1.0"

PV = "2023.209.svn21641"

RPM_NAME = "texlive-postcards-2023.209.svn21641-53.1.noarch.rpm"
RPM_HASH = "4261010c9a0ad04280f9d96e4b1fcd4fbca3cff2949dc39213aababc9d9ca549975f57a0f07b84eaf8dce35fdc19e084b63aa24f6d1c62773f47791e4cb57ca6"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-postcards.cls \
texlive-postcards"

RDEPENDS:${PN} += "/usr/bin/sh \
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
