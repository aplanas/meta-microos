SUMMARY = "Transit Relay server for Magic-Wormhole"
DESCRIPTION = "Transit Relay server for Magic-Wormhole"
LICENSE = "MIT"

PV = "0.2.1"

RPM_NAME = "python39-magic-wormhole-transit-relay-0.2.1-3.5.noarch.rpm"
RPM_HASH = "2fbf1a41d902e34fac80a6c3e4671b7812ca0cedb6413e9c8c1856de183a14a0839a19289f200a11119750a97d5eed9639538a004ba3d7c488ebb054603da46c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist(magic-wormhole-transit-relay) \
python39-magic-wormhole-transit-relay \
python3dist(magic-wormhole-transit-relay)"
RDEPENDS:${PN} += "python(abi) \
python39-Twisted"

inherit rpm
