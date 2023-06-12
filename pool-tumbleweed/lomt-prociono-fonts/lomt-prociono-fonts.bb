SUMMARY = "League Of Movable Type's 'Prociono' font"
DESCRIPTION = "('Prociono' is an Esperanto word meaning either the star Procyon or \
the animal species known as the raccoon.) It is a roman serif font \
with blackletter elements."
LICENSE = "OFL-1.1"

PV = "0.20121218"

RPM_NAME = "lomt-prociono-fonts-0.20121218-8.7.noarch.rpm"
RPM_HASH = "1f00ecae0dc61ee86babd0c443e954c80f9955827c4550230456b66987627b1591cbb480289f2dec9cc7c8aae44b8f6874dd3af650203fb3ea0f30ab3ece5b8a"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "lomt-prociono-fonts"
RDEPENDS:${PN} += "/bin/sh"

inherit rpm
