SUMMARY = "A '\\titleref' command to cross-reference section titles"
DESCRIPTION = "Defines a command \\titleref that allows you to cross-reference \
section (and chapter, etc) titles and captions just like \\ref \
and \\pageref. The package does not interwork with hyperref; if \
you need hypertext capabilities, use nameref instead."
LICENSE = "SUSE-Public-Domain"

PV = "2023.201.3.1svn18729"

RPM_NAME = "texlive-titleref-2023.201.3.1svn18729-52.1.noarch.rpm"
RPM_HASH = "5db27da260ac7c1461049ec95bee1aa0640cccadf7600f1b946aafa50f73afc8064ce92d700a3e6125f6e0ba828dccd44ad690209572b91bc5ff6da76152cbae"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex(titleref.sty) \
texlive-titleref"

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
