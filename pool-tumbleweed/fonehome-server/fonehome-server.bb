SUMMARY = "Server for fonehome SSH connections"
DESCRIPTION = "fonehome allows remote access to machines behind firewalls using SSH \
port forwarding. This package is installed on the machine that you \
want to be the fonehome server."
LICENSE = "Apache-2.0"

PV = "1.2.2"

RPM_NAME = "fonehome-server-1.2.2-1.5.noarch.rpm"
RPM_HASH = "c56110244a8260e65a12aea3ae0c619761174f7ac7bf87b0ab502f8ac24a8969fd177c1dcc9633e989723e3a82a82b97f80a3d48d8a8920f390ef8ffee74dc2c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "config-fonehome-server \
fonehome-server"

RDEPENDS:${PN} += "/usr/bin/bash \
/usr/bin/sh \
openssh \
sed \
shadow \
util-linux"

inherit rpm
