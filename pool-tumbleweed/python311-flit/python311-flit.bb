SUMMARY = "Simplified packaging of Python modules"
DESCRIPTION = "Simplified packaging of Python modules"
LICENSE = "BSD-3-Clause"

PV = "3.9.0"

RPM_NAME = "python311-flit-3.9.0-1.1.noarch.rpm"
RPM_HASH = "1d1a984bcd5ac0587007be55f648ecb28568602a8276e15840abe6edaead0cfde849be0934a95af34339365c90eb71f7d3dff727d7162a2e4ab4cd7e6f5694b0"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-flit \
python3.11dist-flit \
python311-flit \
python3dist-flit"

RDEPENDS:${PN} += "/usr/bin/python3.11 \
/usr/bin/sh \
python-abi \
python311-docutils \
python311-flit-core \
python311-requests \
python311-tomli-w \
update-alternatives"

inherit rpm
