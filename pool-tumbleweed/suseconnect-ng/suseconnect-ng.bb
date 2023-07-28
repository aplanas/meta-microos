SUMMARY = "Utility to register a system with the SUSE Customer Center"
DESCRIPTION = "This package provides a command line tool for connecting a \
client system to the SUSE Customer Center. It will connect the system to your \
product subscriptions and enable the product repositories/services locally. \
suseconnect-ng reduces the size of its runtime dependencies compared to the \
replaced SUSEConnect."
LICENSE = "LGPL-2.1-or-later"

PV = "1.2.0~git0.abd0fec"

RPM_NAME = "suseconnect-ng-1.2.0~git0.abd0fec-1.1.aarch64.rpm"
RPM_HASH = "ba0f98c64a971ae2b4694d2cd893a6a53b5f75d9f27eb80bc9b2914dbdc7c543a0162c52c8ce7cd037634a76a0db1fb570e09d6514965e809bee56b48702aa16"

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
