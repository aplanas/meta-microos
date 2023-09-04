SUMMARY = "Smooth-edge versions of int10h's IBM/PC fonts"
DESCRIPTION = "A modification of the int10h oldschoolpc font pack with some fonts \
redone with smooth edges."
LICENSE = "CC-BY-SA-4.0"

PV = "2.2.1"

RPM_NAME = "consoleet-oldschoolpc-fonts-2.2.1-1.1.noarch.rpm"
RPM_HASH = "5cde35d99246541fc2555899e0efe778b1ae35756d4caaf60877b6212f20c3398a8cd9c9d666fdc1994fb02e65372427ff7a4809d239020fccfca58be535c084"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "consoleet-oldschoolpc-fonts"

RDEPENDS:${PN} += "/usr/bin/sh \
aaa-base \
coreutils \
perl"

inherit rpm
