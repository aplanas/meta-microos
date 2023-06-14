SUMMARY = "Conformance test suite for diagnosing a Kubernetes cluster"
DESCRIPTION = "Sonobuoy is a diagnostic tool for understanding the state of a \
Kubernetes cluster by running a set of Kubernetes conformance tests \
in an accessible and non-destructive manner."
LICENSE = "Apache-2.0"

PV = "0.20.0"

RPM_NAME = "sonobuoy-0.20.0-1.8.aarch64.rpm"
RPM_HASH = "39743b4c3abb66c8933f0e6ebe735dfe9584223a34a2371ab4a735967375129ef0612ac21d31f02dea1d6b708a73d4d34a0b136e2b0035394f7e320cb4ad6f2d"

RPROVIDES:${PN} += "sonobuoy"

RDEPENDS:${PN} += ""

inherit rpm
