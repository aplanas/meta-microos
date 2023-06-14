SUMMARY = "D-BUS message bus configuration"
DESCRIPTION = "D-Bus is a message bus system, The dbus-common package provides the configuration and setup files for D-Bus \
implementations to provide a System and User Message Bus."
LICENSE = "AFL-2.1 | GPL-2.0-or-later"

PV = "1.14.6"

RPM_NAME = "dbus-1-common-1.14.6-2.3.noarch.rpm"
RPM_HASH = "e0b7e6fdaf5e69b09252b4295636cf75530f655899b1d093941049a1877872120106bd1d910b701d1ab966d2fee2e0c22be48f57db2bf89bd5c990f68582e121"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "config-dbus-1-common \
dbus-1-common \
group-messagebus \
user-messagebus"

RDEPENDS:${PN} += "/bin/sh \
sysuser-shadow"

inherit rpm
