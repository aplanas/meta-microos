SUMMARY = "Python 3 utility libraries for Ceph"
DESCRIPTION = "This package contains data structures, classes and functions used by Ceph. \
It also contains utilities used for the cephadm orchestrator."
LICENSE = "LGPL-2.1 & LGPL-3.0 & CC-BY-SA-3.0 & GPL-2.0 & BSL-1.0 & BSD-3-Clause & MIT"

PV = "16.2.13.66+g54799ee0666"

RPM_NAME = "python3-ceph-common-16.2.13.66+g54799ee0666-3.1.aarch64.rpm"
RPM_HASH = "7713f2578a237098a61409847aaf3729cb56f25020068a34bc86a8714d8a692aae098811834173a15fbe2f558546cb911b743b001a29240422ea87bc11e4ce0c"

RPROVIDES:${PN} += "python3-ceph-common \
python3.11dist-ceph \
python3dist-ceph"

RDEPENDS:${PN} += "python-abi \
python3-PyYAML"

inherit rpm
