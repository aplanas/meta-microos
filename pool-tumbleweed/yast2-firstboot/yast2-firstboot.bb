SUMMARY = "YaST2 - Initial System Configuration"
DESCRIPTION = "The YaST firstboot utility runs after installation is completed.  It \
guides the user through a series of steps that allows for easier \
configuration of the machine. \
 \
YaST firstboot does not run by default and has	to be configured to run \
by the user or the system administrator. It is useful for image \
deployments where the system in the image is completely configured, \
however some last steps like root password and user logins have to be \
created to personalize the system."
LICENSE = "GPL-2.0-only"

PV = "4.6.1"

RPM_NAME = "yast2-firstboot-4.6.1-1.1.noarch.rpm"
RPM_HASH = "fece063121ac4cf09508cd9d9cab053a337e91c7e0ff6107a0baac63d0e2926554e9c61797af79dff31f0dab71219c5d09a95918f56c4553fdfc250975e31ce4"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "yast2-firstboot"

RDEPENDS:${PN} += "/usr/bin/bash \
/usr/bin/mkdir \
/usr/bin/sh \
/usr/bin/touch \
fillup \
yast2 \
yast2-configuration-management \
yast2-country \
yast2-installation \
yast2-network \
yast2-ruby-bindings"

inherit rpm
