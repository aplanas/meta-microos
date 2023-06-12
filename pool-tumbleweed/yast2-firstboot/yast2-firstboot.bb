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

PV = "4.6.0"

RPM_NAME = "yast2-firstboot-4.6.0-1.1.noarch.rpm"
RPM_HASH = "c105af719809a7d0864cd1dc3a0389b849aa377befc25875ef4c0ad5254e18863cd2e30f1b806efba8b178e8c4887b94e0a87ad5e7b036b936c8d1c045d4624c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "yast2-firstboot"
RDEPENDS:${PN} += "/bin/bash \
/bin/sh \
/usr/bin/mkdir \
/usr/bin/touch \
fillup \
yast2 \
yast2-configuration-management \
yast2-country \
yast2-installation \
yast2-network \
yast2-ruby-bindings"

inherit rpm
