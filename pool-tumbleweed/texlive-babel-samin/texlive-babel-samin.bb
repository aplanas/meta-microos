SUMMARY = "Babel support for Samin"
DESCRIPTION = "The package provides the language definition file for support \
of North Sami in babel. (Several Sami dialects/languages are \
spoken in Finland, Norway, Sweden and on the Kola Peninsula of \
Russia). Not all use the same alphabet, and no attempt is made \
to support any other than North Sami here. Some shortcuts are \
defined, as well as translations to Norsk of standard 'LaTeX \
names'."
LICENSE = "LPPL-1.0"

PV = "2023.201.1.0csvn30288"

RPM_NAME = "texlive-babel-samin-2023.201.1.0csvn30288-53.1.noarch.rpm"
RPM_HASH = "e701156e3819b2b06747622d01b9029300e382eb6bfe97770016b6028d1b52f54119aa948fc189849ad8134d4bb6614cb3c3e2e711688a45e95ba5c6391b04a9"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-samin.ldf \
texlive-babel-samin"

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
