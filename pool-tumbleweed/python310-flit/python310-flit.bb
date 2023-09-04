SUMMARY = "Simplified packaging of Python modules"
DESCRIPTION = "Simplified packaging of Python modules"
LICENSE = "BSD-3-Clause"

PV = "3.8.0"

RPM_NAME = "python310-flit-3.8.0-6.1.noarch.rpm"
RPM_HASH = "9d07be3200f565f00fbb07cb79fbeaabb33ab3070b6e9247d8af03c09e1878773bc079eb0fb426941db4309a2270ffdbe83dc76704c036c4139de3e1bfc4c945"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.10dist-flit \
python310-flit \
python3dist-flit"

RDEPENDS:${PN} += "/usr/bin/python3.10 \
/usr/bin/sh \
python-abi \
python310-docutils \
python310-flit-core \
python310-requests \
python310-tomli-w \
update-alternatives"

inherit rpm
