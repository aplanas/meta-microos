SUMMARY = "Lists using a single active character"
DESCRIPTION = "This package allows you to create lists of numbered items (as \
in Wittgenstein's 'Tractatus') with a single active character \
as the only command. A variety of parameters are available to \
configure the appearance of the list; lists may be nested \
(effectively to unlimited depth)."
LICENSE = "LPPL-1.0"

PV = "2023.201.1.3svn32661"

RPM_NAME = "texlive-easylist-2023.201.1.3svn32661-53.1.noarch.rpm"
RPM_HASH = "847ba655803134d9d3f06834a932ab554b4af94c0d301ee9ac69f7c05460610e4a80f8e02a58dabdf0611f11f90dbd032ebf6a6de086252a67041f2b983eaa5f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex(easylist.sty) \
texlive-easylist"

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
