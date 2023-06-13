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

PV = "2023.201.3.4svn32528"

RPM_NAME = "texlive-url-2023.201.3.4svn32528-53.1.noarch.rpm"
RPM_HASH = "bd283c992813d98bd00a197630d04ba066fb0bebc83afdcd47abc1d2268f09d4a938ffc569aea5724c8e20ad2c4075958cc7158cb5b974aaf6a2cd91c0f9145a"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex(url.sty) \
texlive-url"

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
