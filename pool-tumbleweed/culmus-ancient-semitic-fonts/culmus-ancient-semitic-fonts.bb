SUMMARY = "Ancient Semitic Fonts"
DESCRIPTION = "Collection of fonts related to the history of the Hebrew writing."
LICENSE = "GPL-2.0"

PV = "0.06.1"

RPM_NAME = "culmus-ancient-semitic-fonts-0.06.1-3.17.noarch.rpm"
RPM_HASH = "8b7827bfea84784e3a3c88751343b103613192614adeee89ddf8b3c5c7e2b6bbf6168c98bd250abfe17f815e5741fc5643f356adb6b11d7e2c95bc15e54ccb19"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "culmus-ancient-semitic-fonts"

RDEPENDS:${PN} += "/usr/bin/sh \
aaa-base \
coreutils \
perl"

inherit rpm
