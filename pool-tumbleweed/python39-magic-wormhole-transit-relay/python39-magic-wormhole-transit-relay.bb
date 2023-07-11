SUMMARY = "Transit Relay server for Magic-Wormhole"
DESCRIPTION = "Transit Relay server for Magic-Wormhole"
LICENSE = "MIT"

PV = "0.2.1"

RPM_NAME = "python39-magic-wormhole-transit-relay-0.2.1-3.7.noarch.rpm"
RPM_HASH = "11db8e7637b0eef18531f4f631ade3c6706cbdadbd7f40450b3d5c162e89dba56a69d4feee7a3617564fae7bd02b8d39dd079cdacb2df75a2cb4aaa857af9d21"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-magic-wormhole-transit-relay \
python39-magic-wormhole-transit-relay \
python3dist-magic-wormhole-transit-relay"

RDEPENDS:${PN} += "python-abi \
python39-Twisted"

inherit rpm
