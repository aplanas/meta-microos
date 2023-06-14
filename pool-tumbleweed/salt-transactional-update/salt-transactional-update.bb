SUMMARY = "Transactional update executor configuration"
DESCRIPTION = "For transactional systems, like MicroOS, Salt can operate \
transparently if the executor 'transactional-update' is registered in \
list of active executors.  This package add the configuration file."
LICENSE = "Apache-2.0"

PV = "3006.0"

RPM_NAME = "salt-transactional-update-3006.0-1.1.aarch64.rpm"
RPM_HASH = "20b5f5db1bbab23c492865cf4a7d008122fcbec4bc4de621904bcb0ec9483994c4ca5431cab0abab232c3715ed78cfd80b02e15a4d8ae63789bcfbd6d4f7d48f"

RPROVIDES:${PN} += "config-salt-transactional-update \
salt-transactional-update"

RDEPENDS:${PN} += "salt \
salt-minion \
tar"

inherit rpm
