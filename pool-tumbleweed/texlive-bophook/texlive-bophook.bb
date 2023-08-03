SUMMARY = "Provides an At-Begin-Page hook"
DESCRIPTION = "Using the \\AtBeginPage hook, you can add material in the \
background of a page. \\PageLayout can be used to give page \
makeup commands to be executed on every page (e.g., depending \
on the page style)."
LICENSE = "LPPL-1.0"

PV = "2023.209.0.0.02svn17062"

RPM_NAME = "texlive-bophook-2023.209.0.0.02svn17062-53.1.noarch.rpm"
RPM_HASH = "d1fc1862b52003facf6e5072455936373d08188dc5e55f617ff97bcf60b28b514143d7fc02f9d711a80bc8a33ae975bc99212640d8b8efeb1f27ce29550d33aa"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-bophook.sty \
texlive-bophook"

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
