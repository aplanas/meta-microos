SUMMARY = "Verbatim with URL-sensitive line breaks"
DESCRIPTION = "The command \\url is a form of verbatim command that allows \
linebreaks at certain characters or combinations of characters, \
accepts reconfiguration, and can usually be used in the \
argument to another command. (The \\urldef command provides \
robust commands that serve in cases when \\url doesn't work in \
an argument.) The command is intended for email addresses, \
hypertext links, directories/paths, etc., which normally have \
no spaces, so by default the package ignores spaces in its \
argument. However, a package option 'allows spaces', which is \
useful for operating systems where spaces are a common part of \
file names."
LICENSE = "LPPL-1.0"

PV = "2023.209.3.4svn32528"

RPM_NAME = "texlive-url-2023.209.3.4svn32528-54.1.noarch.rpm"
RPM_HASH = "2cb1febd1fc3bc7b408027546afedaf6ea6482e5d13b73d9659503ea209a99e48573bdc52fe5114ab4cb7361e4e7c6a254fe20df447fa1295bda89079fcb83b0"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-url.sty \
texlive-url"

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
