SUMMARY = "Transactional update executor configuration"
DESCRIPTION = "For transactional systems, like MicroOS, Salt can operate \
transparently if the executor 'transactional-update' is registered in \
list of active executors.  This package add the configuration file."
LICENSE = "Apache-2.0"

PV = "3006.0"

RPM_NAME = "salt-transactional-update-3006.0-4.1.aarch64.rpm"
RPM_HASH = "6f628056bc7e09c103c4cb4e4406ecc70322254e772973f5905fb0a740b6cdb467e488c4e8b32014d6c2924a86fccf25ffbbe9b18d43816866d1503df33e9f34"

RPROVIDES:${PN} += "config-salt-transactional-update \
salt-transactional-update"

RDEPENDS:${PN} += "salt \
salt-minion \
tar"

inherit rpm
