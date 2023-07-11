SUMMARY = "A tool to locate Python on the system"
DESCRIPTION = "A Python discovery tool to locate Python on the system."
LICENSE = "MIT"

PV = "1.3.1"

RPM_NAME = "python311-pythonfinder-1.3.1-3.6.noarch.rpm"
RPM_HASH = "bf9e73e402d3226834b99992ed292cb71a683d5f22ff8e800d948e0530c4e8dccb22cfa9ce483d24aa1fa9eeb1a4cdd9b65b2101214ac97c24e1e9eb41c42d08"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-pythonfinder \
python3.11dist-pythonfinder \
python311-pythonfinder \
python3dist-pythonfinder"

RDEPENDS:${PN} += "/usr/bin/python3.11 \
/usr/bin/sh \
python-abi \
python311-attrs \
python311-cached-property \
python311-click \
python311-packaging \
python311-vistir \
update-alternatives"

inherit rpm
