SUMMARY = "Python 3 utility libraries for Ceph"
DESCRIPTION = "This package contains data structures, classes and functions used by Ceph. \
It also contains utilities used for the cephadm orchestrator."
LICENSE = "LGPL-2.1 & LGPL-3.0 & CC-BY-SA-3.0 & GPL-2.0 & BSL-1.0 & BSD-3-Clause & MIT"

PV = "16.2.13.66+g54799ee0666"

RPM_NAME = "python3-ceph-common-16.2.13.66+g54799ee0666-4.1.aarch64.rpm"
RPM_HASH = "258c9fd07c0dd68f0f44393b3b331070445c08a2d4f6267eb899eaf23ffd1032f0be1a5a4b24e604573ddd7c32a957726fb36951c07686108ca787200aa12a1a"

RPROVIDES:${PN} += "python3-ceph-common \
python3.11dist-ceph \
python3dist-ceph"

RDEPENDS:${PN} += "python-abi \
python3-PyYAML"

inherit rpm
