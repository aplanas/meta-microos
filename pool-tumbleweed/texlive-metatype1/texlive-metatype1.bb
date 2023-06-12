SUMMARY = "Generate Type 1 fonts from MetaPost"
DESCRIPTION = "The system employs scripts, common utility programs, and a set \
of MetaPost macros to provide a means of expressing the details \
outline fonts directly in the MetaPost language. The system was \
employed to generate the Latin Modern fonts, and the \
distribution includes an example development of Knuth's logo \
fonts."
LICENSE = "SUSE-Public-Domain"

PV = "2023.201.0.0.56svn37105"

RPM_NAME = "texlive-metatype1-2023.201.0.0.56svn37105-54.1.noarch.rpm"
RPM_HASH = "08abc30f5b99a36422eb1ff6f350e5e9071cfa3997bdf3802861149f67ce6355e680acaef4770d2b4c9cc094d854610c3446aee8e0c7ce3b4366ba3e7a744145"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-metatype1"
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
