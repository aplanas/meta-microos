SUMMARY = "Graphical frontend for diff"
DESCRIPTION = "This is a diff front-end with a look and feel based on Atria Clearcase \
xcleardiff. Both files are displayed in a window each and the \
differences are marked in different colors. \
 \
 \
 \
Authors: \
-------- \
    John C. Quillan <quillan@doitnow.com>"
LICENSE = "GPL-2.0+"

PV = "1.1.0"

RPM_NAME = "tkxcd-1.1.0-950.16.noarch.rpm"
RPM_HASH = "8bab6971ca0a53563fdd683a2ddf9f09712df87c49fbfc6c43b596d4a04354fd6446d134d2943996b0f7ee26f619e985b4804013c6215f1a2b80ae45759ff813"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tkxcd \
tkxcd-1.1.0"

RDEPENDS:${PN} += "/usr/bin/bash \
tk"

inherit rpm
