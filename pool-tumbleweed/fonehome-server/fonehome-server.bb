SUMMARY = "Server for fonehome SSH connections"
DESCRIPTION = "fonehome allows remote access to machines behind firewalls using SSH \
port forwarding. This package is installed on the machine that you \
want to be the fonehome server."
LICENSE = "Apache-2.0"

PV = "1.2.2"

RPM_NAME = "fonehome-server-1.2.2-1.4.noarch.rpm"
RPM_HASH = "a94acd31dcd015520f7e91628e7bfe52a63dda8cabfbc38edee517bcf3a2ee471377b575947c53eb05b679d7b6c4ac2fb90b4a1a15e580af2d0306444d72fe2e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "config(fonehome-server) \
fonehome-server"

RDEPENDS:${PN} += "/bin/bash \
/bin/sh \
openssh \
sed \
shadow \
util-linux"

inherit rpm
