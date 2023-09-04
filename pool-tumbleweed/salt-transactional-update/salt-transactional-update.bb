SUMMARY = "Transactional update executor configuration"
DESCRIPTION = "For transactional systems, like MicroOS, Salt can operate \
transparently if the executor 'transactional-update' is registered in \
list of active executors.  This package add the configuration file."
LICENSE = "Apache-2.0"

PV = "3006.0"

RPM_NAME = "salt-transactional-update-3006.0-2.1.aarch64.rpm"
RPM_HASH = "88b0b5664fa8793cddf0e3d04120091a5a59eecf0d6f27d82a225351ad09a3fcdc80edf9bc2cc0b277313bfeb14ad83ae84d7d0ae491501df85ee7308b95ca8d"

RPROVIDES:${PN} += "config-salt-transactional-update \
salt-transactional-update"

RDEPENDS:${PN} += "salt \
salt-minion \
tar"

inherit rpm
