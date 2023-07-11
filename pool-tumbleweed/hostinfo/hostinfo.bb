SUMMARY = "Gathers basic server information"
DESCRIPTION = "A script that displays current system information to help \
identify a host and its resources."
LICENSE = "GPL-2.0-only"

PV = "1.0.7"

RPM_NAME = "hostinfo-1.0.7-1.6.noarch.rpm"
RPM_HASH = "d990483a8b1d62e2a5e252fbc6daca9aab271731297df76eac8ae4a14d5dab602b900c7956e5511ba96d8426b9f96aa9a91aef516c061f319c60d81318310d46"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "config-hostinfo \
hostinfo"

RDEPENDS:${PN} += "/usr/bin/bash \
/usr/bin/sh \
iproute2 \
issue-generator \
sed"

inherit rpm
