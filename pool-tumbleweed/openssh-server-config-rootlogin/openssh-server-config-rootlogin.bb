SUMMARY = "Config to permit root logins to sshd"
DESCRIPTION = "The openssh-server package by default disallows password based \
root logins. This package provides a config that does. It's useful \
to temporarily have a password based login to be able to use \
ssh-copy-id(1)."
LICENSE = "BSD-2-Clause & MIT"

PV = "9.3p1"

RPM_NAME = "openssh-server-config-rootlogin-9.3p1-1.2.aarch64.rpm"
RPM_HASH = "6008bbcec363ff4d9b054177595ba0ab24573dabe70b22c359e983aa217360c180509377b51deb8af0b770441f885441d031b2d6a681f2ac7c7dff7154ce8c40"

RPROVIDES:${PN} += "openssh-server-config-rootlogin"

RDEPENDS:${PN} += "openssh-server"

inherit rpm
