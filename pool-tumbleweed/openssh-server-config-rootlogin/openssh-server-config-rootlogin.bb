SUMMARY = "Config to permit root logins to sshd"
DESCRIPTION = "The openssh-server package by default disallows password based \
root logins. This package provides a config that does. It's useful \
to temporarily have a password based login to be able to use \
ssh-copy-id(1)."
LICENSE = "BSD-2-Clause & MIT"

PV = "8.9p1"

RPM_NAME = "openssh-server-config-rootlogin-8.9p1-9.2.aarch64.rpm"
RPM_HASH = "5e785f926c105144112c41075d68be1647e79296c6267fd95193457831e673993744ba8c6c336cc6ab7fbe04f982a54f723a0e3d0002e067d8e1cb77f512f095"

RPROVIDES:${PN} += "openssh-server-config-rootlogin"

RDEPENDS:${PN} += "openssh-server"

inherit rpm
