SUMMARY = "Simplified packaging of Python modules"
DESCRIPTION = "Simplified packaging of Python modules"
LICENSE = "BSD-3-Clause"

PV = "3.8.0"

RPM_NAME = "python39-flit-3.8.0-6.1.noarch.rpm"
RPM_HASH = "fc96266926fc3017a29bb4f3022956b28dae92bf71412c2cf580fce455982d2250b1c9cce3b189f845e27c3ec4d276abf9926c337872b3285aec81ae72f41c2a"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-flit \
python39-flit \
python3dist-flit"

RDEPENDS:${PN} += "/usr/bin/python3.9 \
/usr/bin/sh \
python-abi \
python39-docutils \
python39-flit-core \
python39-requests \
python39-tomli-w \
update-alternatives"

inherit rpm
