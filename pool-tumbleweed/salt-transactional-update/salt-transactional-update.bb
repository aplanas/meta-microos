SUMMARY = "Transactional update executor configuration"
DESCRIPTION = "For transactional systems, like MicroOS, Salt can operate \
transparently if the executor 'transactional-update' is registered in \
list of active executors.  This package add the configuration file."
LICENSE = "Apache-2.0"

PV = "3006.0"

RPM_NAME = "salt-transactional-update-3006.0-1.4.aarch64.rpm"
RPM_HASH = "848a3059584dca1e8c33f8efc602180abdde3499aa525b2754a9b690d0c9fe3976a107f10b1eabdc1c38e8271a12ffc00747f5a91e67a60c164df0b9490abb60"

RPROVIDES:${PN} += "config-salt-transactional-update \
salt-transactional-update"

RDEPENDS:${PN} += "salt \
salt-minion \
tar"

inherit rpm
