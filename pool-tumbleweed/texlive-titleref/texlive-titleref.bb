SUMMARY = "A '\\titleref' command to cross-reference section titles"
DESCRIPTION = "Defines a command \\titleref that allows you to cross-reference \
section (and chapter, etc) titles and captions just like \\ref \
and \\pageref. The package does not interwork with hyperref; if \
you need hypertext capabilities, use nameref instead."
LICENSE = "SUSE-Public-Domain"

PV = "2023.209.3.1svn18729"

RPM_NAME = "texlive-titleref-2023.209.3.1svn18729-53.1.noarch.rpm"
RPM_HASH = "7074a1f2d7f7a0386ec84c73cc5435c3224f1edf7c7d11f052be52d69bdc0c84d970f6a996ebd9fee995fa7c7156df1f54e4283f8aa68c069224e9f8b197cf36"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-titleref.sty \
texlive-titleref"

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
