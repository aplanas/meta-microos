SUMMARY = "Buginese Unicode fonts"
DESCRIPTION = "Font for the lontara script."
LICENSE = "GPL-3.0"

PV = "2.0"

RPM_NAME = "saweri-fonts-2.0-1.17.noarch.rpm"
RPM_HASH = "bd9274a2311daf92e7b1fe4914e8401cb1825c52b4fd7ca72450d4a578509283c83240afe785263eaa84dbcfc82b355e079e9bafcf177ae73b5c5c9b113af220"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "saweri-fonts"
RDEPENDS:${PN} += "/bin/sh \
aaa_base \
coreutils \
perl"

inherit rpm
