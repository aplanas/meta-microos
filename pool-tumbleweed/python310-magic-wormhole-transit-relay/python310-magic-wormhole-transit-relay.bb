SUMMARY = "Transit Relay server for Magic-Wormhole"
DESCRIPTION = "Transit Relay server for Magic-Wormhole"
LICENSE = "MIT"

PV = "0.2.1"

RPM_NAME = "python310-magic-wormhole-transit-relay-0.2.1-3.7.noarch.rpm"
RPM_HASH = "9f0f9b648855c056a57f2474ad02efaa8d92649e27ba15a62544945b21dd8e17754b170de2e51f4c3d5058c012448bf7392f57b2d342b4718999c9cb1eb02748"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.10dist-magic-wormhole-transit-relay \
python310-magic-wormhole-transit-relay \
python3dist-magic-wormhole-transit-relay"

RDEPENDS:${PN} += "python-abi \
python310-Twisted"

inherit rpm
