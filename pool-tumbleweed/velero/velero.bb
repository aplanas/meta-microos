SUMMARY = "Backup program with deduplication and encryption"
DESCRIPTION = "velero is a backup program. It supports verification, encryption, \
snapshots and deduplication."
LICENSE = "Apache-2.0"

PV = "1.9.2"

RPM_NAME = "velero-1.9.2-1.3.aarch64.rpm"
RPM_HASH = "3845fb25d3b527739ec614cf94af4df6a70dc3d59530d2ed1dd19ec2b024f7fd8c09b8cb85b11c15bd43f36d3fbf373cabac1be5d250736569a14bc6d0f69f00"

RPROVIDES:${PN} += "velero"

RDEPENDS:${PN} += ""

inherit rpm
