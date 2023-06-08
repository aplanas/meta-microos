SUMMARY = "Helper bridge between NodeJS projects and their dependencies"
DESCRIPTION = "Zero-runtime-dependency package acting as bridge between Node projects \
and their package managers."
LICENSE = "MIT"

PV = "19.9.0"

RPM_NAME = "corepack19-19.9.0-1.1.aarch64.rpm"
RPM_HASH = "a462273d19fc358aa1d5d044497e47ac84b6c77362b4f516289a733ca67d7eb75efeb6ee7b270b6575673839a808e9294df59b565436a7d6da50e75d4c01ad0b"

RPROVIDES:${PN} += "corepack19 corepack19(aarch-64)"
RDEPENDS:${PN} += "/bin/sh /usr/bin/env nodejs-common"

inherit rpm
