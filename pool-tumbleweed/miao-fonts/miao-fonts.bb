SUMMARY = "Miao Unicode Fonts"
DESCRIPTION = "Miao Unicode is an open-source, Graphite enabled font which \
supports the Miao, or ‘Pollard’, script."
LICENSE = "OFL-1.1"

PV = "20131031"

RPM_NAME = "miao-fonts-20131031-3.17.noarch.rpm"
RPM_HASH = "4a846654a9a7da17f3c1ed7d7d6466618a55b20b06aaf5fc57da87a3d67b7702dc0e087d5d8eb77979319df0a480a8dbef368729070c580c4b2db6c637d30568"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "miao-fonts"

RDEPENDS:${PN} += "/bin/sh \
aaa-base \
coreutils \
perl"

inherit rpm
