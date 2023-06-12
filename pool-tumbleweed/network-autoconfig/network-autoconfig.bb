SUMMARY = "Find a connected eth interface and create an ifcfg for it"
DESCRIPTION = "All available Ethernet network interfaces will be cycled \
until one is successfully configured. \
This script should run at the first boot of a machine \
that has several interfaces."
LICENSE = "MIT"

PV = "1.0"

RPM_NAME = "network-autoconfig-1.0-4.10.noarch.rpm"
RPM_HASH = "f3fc78f59e87e238bb5527ba9e884dc9db2913851ffef8cdf51c0676116b9539e7b97810530a1411c831291e8854d41bfd6b2f1287f763fc6dfe39c272c02e77"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "network-autoconfig"
RDEPENDS:${PN} += "/bin/bash \
/bin/sh \
systemd \
wicked"

inherit rpm
