SUMMARY = "Painless YAML configuration"
DESCRIPTION = "Painless YAML configuration."
LICENSE = "MIT"

PV = "2.0.1"

RPM_NAME = "python39-confuse-2.0.1-1.3.noarch.rpm"
RPM_HASH = "c70a57bea8dd683bd0486911674fdc87552afa58b113f2f442dc6cd25cf15ab63570a077517c76e93320b9a665961161ce5267e5b658befcdd40555f76d59348"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-confuse \
python39-confuse \
python3dist-confuse"

RDEPENDS:${PN} += "python-abi \
python39-PyYAML"

inherit rpm
