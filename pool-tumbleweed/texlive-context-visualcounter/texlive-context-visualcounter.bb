SUMMARY = "Visual display of ConTeXt counters"
DESCRIPTION = "A typical document usually contains many counters: page \
numbers, section numbers, itemizations, enumerations, theorems, \
and so on. This module provides a visual display for such \
counters."
LICENSE = "BSD-3-Clause"

PV = "2023.209.svn47085"

RPM_NAME = "texlive-context-visualcounter-2023.209.svn47085-55.1.noarch.rpm"
RPM_HASH = "c6c2f7f8683c0a08025a504a6e0434c12192e29e9665317ba65474b313a246675b5456555a85ed2cf30c77e76be49ce456cb5ea0c285112bd46e6e4f3bec3337"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-context-visualcounter"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
texlive \
texlive-context \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
