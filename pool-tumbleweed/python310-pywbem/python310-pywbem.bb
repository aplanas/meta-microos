SUMMARY = "Python module for making CIM operation calls using the WBEM protocol"
DESCRIPTION = "PyWBEM is a Python module for making CIM operation calls using the WBEM \
protocol to query and update managed objects."
LICENSE = "LGPL-2.1-or-later"

PV = "1.4.1"

RPM_NAME = "python310-pywbem-1.4.1-1.10.noarch.rpm"
RPM_HASH = "45546cb91a2577222ae72ac38ece88c7e9c02af99c7c70ec6d56265740c7fa099cda108a3f244545ed9fc93d70397f4ec7d5c64eb66f3d99fa8ec8e8ee6aedac"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.10dist-pywbem \
python310-pywbem \
python3dist-pywbem"

RDEPENDS:${PN} += "/usr/bin/python3.10 \
/usr/bin/sh \
python-abi \
python310-PyYAML \
python310-nocasedict \
python310-nocaselist \
python310-ply \
python310-requests \
python310-six \
python310-urllib3 \
python310-yamlloader \
update-alternatives"

inherit rpm
