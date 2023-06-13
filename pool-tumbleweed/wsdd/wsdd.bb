SUMMARY = "A Web Service Discovery host daemon"
DESCRIPTION = "wsdd implements a Web Service Discovery host daemon. This enables (Samba) hosts, \
like your local NAS device, to be found by Web Service Discovery Clients like Windows. \
 \
Since NetBIOS discovery is not supported by Windows anymore, wsdd makes hosts to \
appear in Windows again using the Web Service Discovery method. This is beneficial \
for devices running Samba, like NAS or file sharing servers on your local network."
LICENSE = "MIT"

PV = "0.7.1"

RPM_NAME = "wsdd-0.7.1-2.1.noarch.rpm"
RPM_HASH = "8d8416e840124a729be39f070201e3d4d5eab064bc57789a7702f2c085382377f29af23912e64977337fe2c12873cbafb3531cc828a4e528a571a19c4f221d33"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "group(wsdd) \
user(wsdd) \
wsdd"

RDEPENDS:${PN} += "/bin/sh \
/usr/bin/mkdir \
/usr/bin/python3 \
/usr/bin/touch \
fillup \
sysuser-shadow"

inherit rpm
