SUMMARY = "Mailman archiver plugin for HyperKitty"
DESCRIPTION = "Mailman archiver plugin for HyperKitty"
LICENSE = "GPL-3.0-only"

PV = "1.2.1"

RPM_NAME = "python311-mailman-hyperkitty-1.2.1-2.1.noarch.rpm"
RPM_HASH = "0778c839ca56f13f5baf3475f675fb68e094c1fc94bd429419218fa4af48499fe4d193bb97c1ea850469bf5a92d8dad651b9eb37d0741abd00da99ced5558f7b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-mailman-hyperkitty \
python3.11dist-mailman-hyperkitty \
python311-mailman-hyperkitty \
python3dist-mailman-hyperkitty"

RDEPENDS:${PN} += "mailman3 \
python-abi \
python311-requests \
python311-setuptools \
python311-zope.interface"

inherit rpm
