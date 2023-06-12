SUMMARY = "Smooth-edge versions of int10h's IBM/PC fonts"
DESCRIPTION = "A modification of the int10h oldschoolpc font pack with some fonts \
redone with smooth edges."
LICENSE = "CC-BY-SA-4.0"

PV = "2.2"

RPM_NAME = "consoleet-oldschoolpc-fonts-2.2-1.6.noarch.rpm"
RPM_HASH = "ee93d1c8dc581e48c5a6ffdb6e89e8456f71f00d954421e43934e9524f0be19ae818f33e02065410ebdf2c15520b735de58ef451dfeb407278d1e33eeacde1df"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "consoleet-oldschoolpc-fonts"
RDEPENDS:${PN} += "/bin/sh \
aaa_base \
coreutils \
perl"

inherit rpm
