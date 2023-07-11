SUMMARY = "Process application arguments the same way as getopt_long"
DESCRIPTION = "lua_altgetopt is a MIT-licensed module for Lua, for processing \
application arguments in the same way as BSD/GNU getopt_long(3) \
functions do. This module is made available for lua script \
writers to have consistent command line parsing routines."
LICENSE = "LPPL-1.0"

PV = "2023.208.0.0.7.0svn56414"

RPM_NAME = "texlive-lua-alt-getopt-2023.208.0.0.7.0svn56414-53.1.noarch.rpm"
RPM_HASH = "8eb26eda7d22199b9e9ce12e02feba25763dc5db01915dd0183f48e42238b9eb68856176bc63ba88d72cdbb7bc2f354045c6b37bc2d68429df66bf17dee0f092"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-lua-alt-getopt"

RDEPENDS:${PN} += "/usr/bin/luatex \
/usr/bin/sh \
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
