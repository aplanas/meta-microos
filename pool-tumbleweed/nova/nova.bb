SUMMARY = "Find outdated or deprecated Helm charts running in your cluster"
DESCRIPTION = "Nova scans your cluster for installed Helm charts, then cross-checks them against all known Helm repositories. If it finds an updated version of the chart you're using, or notices your current version is deprecated, it will let you know."
LICENSE = "Apache-2.0"

PV = "3.6.5"

RPM_NAME = "nova-3.6.5-1.2.aarch64.rpm"
RPM_HASH = "4e8358e3b72899f30bf9efa72699ca277465f54c769460e9ebb3050671d996ac5791f514820dd1be212c5386934798d4b456279704f557d0a740992d23574090"

RPROVIDES:${PN} += "nova"

RDEPENDS:${PN} += "libc.so.6"

inherit rpm
