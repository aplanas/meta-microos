SUMMARY = "Documentation for libircclient"
DESCRIPTION = "It is designed to be small, fast, portable and compatible to RFC standards and most IRC clients."
LICENSE = "LGPL-2.0-or-later"

PV = "1.10"

RPM_NAME = "libircclient-doc-1.10-1.14.aarch64.rpm"
RPM_HASH = "57702aaf3151756d6faa35a173e97a61c5980aeaae73e950ba959e29f2e93d8faf3a97968f3cad594e56875a42c54b68d409e3a3ace95ebc3f7f4c31f6c53731"

RPROVIDES:${PN} += "libircclient-doc"

RDEPENDS:${PN} += ""

inherit rpm
