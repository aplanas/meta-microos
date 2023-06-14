SUMMARY = "Network Configuration Files in /etc"
DESCRIPTION = "All of the basic configuration files for the network programs including \
/etc/aliases, /etc/protocols, and /etc/services. \
 \
These are often used by network routines in the C library and therefore \
must be installed for all network programs."
LICENSE = "BSD-3-Clause"

PV = "11.6"

RPM_NAME = "netcfg-11.6-10.3.noarch.rpm"
RPM_HASH = "9674149cbc4fbe6c829adeba0eb0d68b04221a4f5fde550becb0081856b0a1c14eff366c1e891d125bc0e224ca67f96d66a5715732985fafa3e2496259a505a1"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "config-netcfg \
netcfg"

RDEPENDS:${PN} += "libnss-usrfiles2"

inherit rpm
