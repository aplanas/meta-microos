SUMMARY = "Bash completion for ethtool"
DESCRIPTION = "bash command line completion support for ethtool."
LICENSE = "GPL-2.0-only"

PV = "6.2"

RPM_NAME = "ethtool-bash-completion-6.2-2.3.aarch64.rpm"
RPM_HASH = "50c798f3bf48ffb4d3faf9b22827ee221d692d18f11e6ff61758c63c032495fbdcd9affb7347ab375f5ace00d34e0d571dd9ed95bdb71dbd6be9cb7a9498245f"

RPROVIDES:${PN} += "ethtool-bash-completion ethtool-bash-completion(aarch-64)"
RDEPENDS:${PN} += "bash-completion ethtool"

inherit rpm
