SUMMARY = "Nano syntax highlighting for icinga2"
DESCRIPTION = "Provides Nano syntax highlighting for icinga2."
LICENSE = "GPL-2.0-or-later"

PV = "2.13.8"

RPM_NAME = "nano-icinga2-2.13.8-2.1.aarch64.rpm"
RPM_HASH = "f5af35b15a4f54a3be394cccad58e3901277b1283c2c73ec783ffa107b31948d0e17e2c481787f7393f91c76cf24d6db75c162c54b5dd24a82d4295b4454fcec"

RPROVIDES:${PN} += "nano-icinga2"

RDEPENDS:${PN} += "nano"

inherit rpm
