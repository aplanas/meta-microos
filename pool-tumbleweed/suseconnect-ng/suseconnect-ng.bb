SUMMARY = "Utility to register a system with the SUSE Customer Center"
DESCRIPTION = "This package provides a command line tool for connecting a \
client system to the SUSE Customer Center. It will connect the system to your \
product subscriptions and enable the product repositories/services locally. \
suseconnect-ng reduces the size of its runtime dependencies compared to the \
replaced SUSEConnect."
LICENSE = "LGPL-2.1-or-later"

PV = "1.1.0~git0.e3c41e60892e"

RPM_NAME = "suseconnect-ng-1.1.0~git0.e3c41e60892e-1.2.aarch64.rpm"
RPM_HASH = "61fa6e71a71c3bc0d3ff5679c2692281d47727eec6c16a3f032b8a1d212e551dc9cbe1af79549bd59ce9be4a2b9b8e43eff4acdf03406e913b68d101f6fe95ed"

RPROVIDES:${PN} += "SUSEConnect \
suseconnect-ng \
zypper-migration-plugin \
zypper-search-packages-plugin"

RDEPENDS:${PN} += "/bin/sh \
ca-certificates-mozilla \
coreutils \
dmidecode \
util-linux \
zypper"

inherit rpm
