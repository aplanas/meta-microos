SUMMARY = "Python module for making CIM operation calls using the WBEM protocol"
DESCRIPTION = "PyWBEM is a Python module for making CIM operation calls using the WBEM \
protocol to query and update managed objects."
LICENSE = "LGPL-2.1-or-later"

PV = "1.4.1"

RPM_NAME = "python39-pywbem-1.4.1-1.9.noarch.rpm"
RPM_HASH = "6b080d7f0203a47c5919998fb3c6fdf9ac442efffebd971a47ce8bae748b5f42d39722888fe48eda94ccd45908a08b5fc7367b89809b854fcf4d9433125856f1"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-pywbem \
python39-pywbem \
python3dist-pywbem"

RDEPENDS:${PN} += "/usr/bin/python3.9 \
/usr/bin/sh \
python-abi \
python39-PyYAML \
python39-nocasedict \
python39-nocaselist \
python39-ply \
python39-requests \
python39-six \
python39-urllib3 \
python39-yamlloader \
update-alternatives"

inherit rpm
