SUMMARY = "Transit Relay server for Magic-Wormhole"
DESCRIPTION = "Transit Relay server for Magic-Wormhole"
LICENSE = "MIT"

PV = "0.2.1"

RPM_NAME = "python311-magic-wormhole-transit-relay-0.2.1-3.7.noarch.rpm"
RPM_HASH = "6b9f0849a94dab7154e69de1a595a9ec57011addaecdb5478af2e520395258c28a6450a0b87a190990109f0ab4912bba26fb0828b996f0bc8808959a47b0bce2"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-magic-wormhole-transit-relay \
python3.11dist-magic-wormhole-transit-relay \
python311-magic-wormhole-transit-relay \
python3dist-magic-wormhole-transit-relay"

RDEPENDS:${PN} += "python-abi \
python311-Twisted"

inherit rpm
