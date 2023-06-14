SUMMARY = "Connectors between Apache and Tomcat Servlet Container"
DESCRIPTION = "This package provides modules for Apache to invisibly integrate Tomcat \
capabilities into an existing Apache installation. \
 \
To load the module into Apache, run the command 'a2enmod jk' as root."
LICENSE = "Apache-2.0"

PV = "1.2.48"

RPM_NAME = "apache2-mod_jk-1.2.48-2.15.aarch64.rpm"
RPM_HASH = "bd02eda3dee2de00a7356d3e196b313a3d732e3770b809b51b391ddc9f9c1e8fd295bc7962d74cdee2ee062da47d035e0e14030ba235a57e3ffb85d379f70389"

RPROVIDES:${PN} += "apache2-mod-jk \
mod-jk \
mod-jk-ap20 \
tomcat-mod"

RDEPENDS:${PN} += "apache-mmn-20120211 \
apache2 \
ld-linux-aarch64.so.1 \
libc.so.6 \
suse-maintenance-mmn-0"

inherit rpm
