SUMMARY = "Config to permit root logins to sshd"
DESCRIPTION = "The openssh-server package by default disallows password based \
root logins. This package provides a config that does. It's useful \
to temporarily have a password based login to be able to use \
ssh-copy-id(1)."
LICENSE = "BSD-2-Clause & MIT"

PV = "9.3p2"

RPM_NAME = "openssh-server-config-rootlogin-9.3p2-1.1.aarch64.rpm"
RPM_HASH = "5bca258fded9209465241343fba53f0a895340fa83fc11ff4d4e5e90f477c584469defd7b3b37ac8a092bacfd550cadc5bf266f375074f6fe23e9afe19283493"

RPROVIDES:${PN} += "openssh-server-config-rootlogin"

RDEPENDS:${PN} += "openssh-server"

inherit rpm
