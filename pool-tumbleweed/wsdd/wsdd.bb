SUMMARY = "A Web Service Discovery host daemon"
DESCRIPTION = "wsdd implements a Web Service Discovery host daemon. This enables (Samba) hosts, \
like your local NAS device, to be found by Web Service Discovery Clients like Windows. \
 \
Since NetBIOS discovery is not supported by Windows anymore, wsdd makes hosts to \
appear in Windows again using the Web Service Discovery method. This is beneficial \
for devices running Samba, like NAS or file sharing servers on your local network."
LICENSE = "MIT"

PV = "0.7.1"

RPM_NAME = "wsdd-0.7.1-2.2.noarch.rpm"
RPM_HASH = "7641958a79b93ede17bcd3a0845065cf0ef59d454954a252e6213c4df33c2ebfb2f74ff99f5e08716b68e2193a9e4fdd947f5469fc154d9a1158b7d8035202a9"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "group-wsdd \
user-wsdd \
wsdd"

RDEPENDS:${PN} += "/usr/bin/mkdir \
/usr/bin/python3 \
/usr/bin/sh \
/usr/bin/touch \
fillup \
sysuser-shadow"

inherit rpm
