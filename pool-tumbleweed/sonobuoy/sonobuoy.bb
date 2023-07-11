SUMMARY = "Conformance test suite for diagnosing a Kubernetes cluster"
DESCRIPTION = "Sonobuoy is a diagnostic tool for understanding the state of a \
Kubernetes cluster by running a set of Kubernetes conformance tests \
in an accessible and non-destructive manner."
LICENSE = "Apache-2.0"

PV = "0.20.0"

RPM_NAME = "sonobuoy-0.20.0-1.9.aarch64.rpm"
RPM_HASH = "a1bb71174e6c2fd2d7b05cfea551be9e22e1a56ffb1b2a9b743c1761935d12dee5975311603c6e0c9fdbd71f3bfd939986d500c9c251da2a4ce8b0a26ad24e8b"

RPROVIDES:${PN} += "sonobuoy"

RDEPENDS:${PN} += ""

inherit rpm
