SUMMARY = "Development files for sispmctl"
DESCRIPTION = "Development files for the GEMBIRD Silver Shield PM device."
LICENSE = "GPL-2.0-only"

PV = "4.11"

RPM_NAME = "sispmctl-devel-4.11-1.1.aarch64.rpm"
RPM_HASH = "08130efedc6d8f324356cbc3b4e68b5622c535c82de48124ec5a9e35237bb10db2367f9bd332d9f7c0213de4c429d24bf75e18f95105db4d3abc0b81c88783ee"

RPROVIDES:${PN} += "sispmctl-devel"

RDEPENDS:${PN} += "libsispmctl0"

inherit rpm
