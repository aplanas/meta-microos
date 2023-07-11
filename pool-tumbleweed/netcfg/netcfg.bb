SUMMARY = "Network Configuration Files in /etc"
DESCRIPTION = "All of the basic configuration files for the network programs including \
/etc/aliases, /etc/protocols, and /etc/services. \
 \
These are often used by network routines in the C library and therefore \
must be installed for all network programs."
LICENSE = "BSD-3-Clause"

PV = "11.6"

RPM_NAME = "netcfg-11.6-10.4.noarch.rpm"
RPM_HASH = "adb713f3e2c9ee42ffb6c33d880949cbd29fb6bb09b3a00779fd63813d0c87e4982e7543aa4dfa1b687699dd1620947375e9e63b53d3f9b108c5f5a9dc816c17"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "config-netcfg \
netcfg"

RDEPENDS:${PN} += "libnss-usrfiles2"

inherit rpm
