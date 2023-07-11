SUMMARY = "A CLI tool for sr.ht"
DESCRIPTION = "hut is a CLI companion utility to interact with sr.ht."
LICENSE = "AGPL-3.0-or-later"

PV = "0.3.0"

RPM_NAME = "hut-0.3.0-1.3.aarch64.rpm"
RPM_HASH = "19820c75d26f20211d0f203b2bf45f49da027bb45ab82949424168d8b85a7f67b97fb381696655df1cb20425e2e9f80c7062a3aa759f687f6122477a038df0b5"

RPROVIDES:${PN} += "hut"

RDEPENDS:${PN} += "libc.so.6"

inherit rpm
