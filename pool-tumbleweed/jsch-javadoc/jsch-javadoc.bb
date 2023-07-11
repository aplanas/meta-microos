SUMMARY = "Pure Java implementation of SSH2"
DESCRIPTION = "JSch allows you to connect to an sshd server and use port forwarding, \
X11 forwarding, file transfer, etc., and you can integrate its \
functionality into your own Java programs."
LICENSE = "BSD-3-Clause"

PV = "0.2.9"

RPM_NAME = "jsch-javadoc-0.2.9-1.2.noarch.rpm"
RPM_HASH = "594af61a01b4a0ddf6d95542f4897903d6bf18b5abdbde2321e605afef362d7064dec1a8119ca7ae7497e3f9010ae01dad9acac1dd039fd15f4931f7d6688b6f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "jsch-javadoc"

RDEPENDS:${PN} += "javapackages-filesystem"

inherit rpm
