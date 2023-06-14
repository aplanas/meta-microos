SUMMARY = "Python 3 utility libraries for Ceph"
DESCRIPTION = "This package contains data structures, classes and functions used by Ceph. \
It also contains utilities used for the cephadm orchestrator."
LICENSE = "LGPL-2.1 & LGPL-3.0 & CC-BY-SA-3.0 & GPL-2.0 & BSL-1.0 & BSD-3-Clause & MIT"

PV = "16.2.13.66+g54799ee0666"

RPM_NAME = "python3-ceph-common-16.2.13.66+g54799ee0666-2.1.aarch64.rpm"
RPM_HASH = "8524209382f8b5c3e37260ec9dc4b9ee35001deac66a273c5d7442e8c0fb0d99466d2800b23724a9466409531d65a0b6d6a56bbf2a2369ce7feaf5c12363aca7"

RPROVIDES:${PN} += "python3-ceph-common \
python3.10dist-ceph \
python3dist-ceph"

RDEPENDS:${PN} += "python-abi \
python3-PyYAML"

inherit rpm
