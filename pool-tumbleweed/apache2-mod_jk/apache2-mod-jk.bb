SUMMARY = "Connectors between Apache and Tomcat Servlet Container"
DESCRIPTION = "This package provides modules for Apache to invisibly integrate Tomcat \
capabilities into an existing Apache installation. \
 \
To load the module into Apache, run the command 'a2enmod jk' as root."
LICENSE = "Apache-2.0"

PV = "1.2.48"

RPM_NAME = "apache2-mod_jk-1.2.48-2.16.aarch64.rpm"
RPM_HASH = "ec67e5512e07d22406b08b4205f157ae83d0b55eb00d83bb682e46c398010725d146adc60bf013b5de74062b1f1a355bdaa1a42bd068c4d381398c53bf498f4e"

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
