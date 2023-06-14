SUMMARY = "RPKI-RTR command line tools"
DESCRIPTION = "rtrclient is command line that connects to an RPKI-RTR server and prints \
protocol information and information about the fetched ROAs to the console. \
rpki-rov is a command line tool that connects to an RPKI-RTR server and \
allows one to validate given IP prefixes and origin ASes."
LICENSE = "MIT"

PV = "0.8.0"

RPM_NAME = "rtr-tools-0.8.0-1.8.aarch64.rpm"
RPM_HASH = "02c99472c0a04cdcb85ba28f24fc8cc54112536c4ae1aaa7a9fa8b37ab2772cde6b1d4b3aad8ee8dbb61ec99fcc4f286f7d6844b6d5aa2d646fc5815ff15e4df"

RPROVIDES:${PN} += "rtr-tools"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
librtr.so.0"

inherit rpm
