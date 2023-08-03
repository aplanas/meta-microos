SUMMARY = "Generate Type 1 fonts from MetaPost"
DESCRIPTION = "The system employs scripts, common utility programs, and a set \
of MetaPost macros to provide a means of expressing the details \
outline fonts directly in the MetaPost language. The system was \
employed to generate the Latin Modern fonts, and the \
distribution includes an example development of Knuth's logo \
fonts."
LICENSE = "SUSE-Public-Domain"

PV = "2023.209.0.0.56svn37105"

RPM_NAME = "texlive-metatype1-2023.209.0.0.56svn37105-55.1.noarch.rpm"
RPM_HASH = "2673ac4ce0fa1f74acedfce38946021527955013a9ed3fef398edc7abc538b0bde9f9f60199a26e135e50af48c3264909db590c87e326f051e9e08b7773c4b83"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-metatype1"

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
