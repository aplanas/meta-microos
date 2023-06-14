SUMMARY = "Configuration for a single-node HTCondor"
DESCRIPTION = "This example configuration is good for trying out HTCondor for the first time. \
It only configures the IPv4 loopback address, turns on basic security, and \
shortens many timers to be more responsive."
LICENSE = "Apache-2.0"

PV = "9.0.16"

RPM_NAME = "minicondor-9.0.16-1.3.aarch64.rpm"
RPM_HASH = "fa37c258d3875dae1782e2e72a3ddf220bb23ef00c1abcc8df297a938d46e0adf1c7f99636c8af940832aa3163fc0d3445ac6d45bda69ec1d990eebc5adbdc0b"

RPROVIDES:${PN} += "config-minicondor \
minicondor"

RDEPENDS:${PN} += "htcondor \
htcondor-procd \
python3-condor"

inherit rpm
