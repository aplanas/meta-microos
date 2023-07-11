SUMMARY = "Utility to register a system with the SUSE Customer Center"
DESCRIPTION = "This package provides a command line tool for connecting a \
client system to the SUSE Customer Center. It will connect the system to your \
product subscriptions and enable the product repositories/services locally. \
suseconnect-ng reduces the size of its runtime dependencies compared to the \
replaced SUSEConnect."
LICENSE = "LGPL-2.1-or-later"

PV = "1.1.0~git2.f42b4b2a060e"

RPM_NAME = "suseconnect-ng-1.1.0~git2.f42b4b2a060e-1.1.aarch64.rpm"
RPM_HASH = "6d7f5aca2dda7c497dbe4df775f801406c47af2ed0c9f29523e7b8bbe13d5bae635915a76b3e670b3a2e9b4d3455449592d98ec8a31b5fc8a3e2380ab98b1df4"

RPROVIDES:${PN} += "SUSEConnect \
suseconnect-ng \
zypper-migration-plugin \
zypper-search-packages-plugin"

RDEPENDS:${PN} += "/usr/bin/sh \
ca-certificates-mozilla \
coreutils \
dmidecode \
util-linux \
zypper"

inherit rpm
