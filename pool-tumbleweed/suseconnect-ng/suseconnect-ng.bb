SUMMARY = "Utility to register a system with the SUSE Customer Center"
DESCRIPTION = "This package provides a command line tool for connecting a \
client system to the SUSE Customer Center. It will connect the system to your \
product subscriptions and enable the product repositories/services locally. \
suseconnect-ng reduces the size of its runtime dependencies compared to the \
replaced SUSEConnect."
LICENSE = "LGPL-2.1-or-later"

PV = "1.3.0~git0.ae8ba1e"

RPM_NAME = "suseconnect-ng-1.3.0~git0.ae8ba1e-1.1.aarch64.rpm"
RPM_HASH = "348fee7c309cc79ff28cbeb9010cc1d42e9990afaeaa5fe7add28ed2f283a71f67a5bb3d0731c0768924b8d2ed9071aed944b8930d5d79a150fbda125cb0e9e1"

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
