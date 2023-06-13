SUMMARY = "Javadoc for liblayout"
DESCRIPTION = "Javadoc for liblayout."
LICENSE = "LGPL-2.1-or-later & Unicode"

PV = "0.2.10"

RPM_NAME = "liblayout-javadoc-0.2.10-6.6.noarch.rpm"
RPM_HASH = "6e1e2024820a4bcd4db1b550ab5500e61bcb9768b6eb60a2ef6d05bb863e30b62150e69e2e0a0b70d375320173c8a961557db1e6d4119eb6c053f6b4290a4814"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "liblayout-javadoc"

RDEPENDS:${PN} += ""

inherit rpm
