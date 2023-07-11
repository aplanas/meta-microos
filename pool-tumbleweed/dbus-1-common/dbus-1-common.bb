SUMMARY = "D-BUS message bus configuration"
DESCRIPTION = "D-Bus is a message bus system, The dbus-common package provides the configuration and setup files for D-Bus \
implementations to provide a System and User Message Bus."
LICENSE = "AFL-2.1 | GPL-2.0-or-later"

PV = "1.14.8"

RPM_NAME = "dbus-1-common-1.14.8-1.1.noarch.rpm"
RPM_HASH = "87485a900b18a04e0485d7374355dd6102aa362f689dedcf48500542ce28cc2a8cf497fbc118260ea96a18bae275875238089c6c8d4b55a936d07e23347aee01"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "config-dbus-1-common \
dbus-1-common \
group-messagebus \
user-messagebus"

RDEPENDS:${PN} += "/usr/bin/sh \
sysuser-shadow"

inherit rpm
