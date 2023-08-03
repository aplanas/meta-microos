SUMMARY = "SIL Yi Font"
DESCRIPTION = "The Nuosu SIL Font is a single Unicode font for the standardized \
Yi script used by a large ethnic group in southwestern China."
LICENSE = "OFL-1.1"

PV = "2.300"

RPM_NAME = "nuosu-fonts-2.300-1.1.noarch.rpm"
RPM_HASH = "4be9a610a1c20fbf76c8d020e7a928403254497220915ed1e1aa8c441c2b3dbfd0828b589bef78024771159737d300e47e4c3ee4866e62054a8baeac9f3ca18d"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "nuosu-fonts"

RDEPENDS:${PN} += "/usr/bin/sh \
aaa-base \
coreutils \
perl"

inherit rpm
