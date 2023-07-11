SUMMARY = "Run kubectl commands in all/some contexts in parallel"
DESCRIPTION = "Run a kubectl command in one or more contexts (clusters) in parallel (similar to GNU parallel/xargs)."
LICENSE = "Apache-2.0"

PV = "0.2.1"

RPM_NAME = "kubectl-foreach-0.2.1-1.5.aarch64.rpm"
RPM_HASH = "9a0c40dfe4caa6be6257cfb8be70867873974d628c451aa01fc0984d01a55a810b1f34abb43c098601ae7819b771ec038703e40c0fbb71ef1d2d9ccacc58d473"

RPROVIDES:${PN} += "kubectl-foreach"

RDEPENDS:${PN} += ""

inherit rpm
