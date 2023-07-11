SUMMARY = "Python module for making CIM operation calls using the WBEM protocol"
DESCRIPTION = "PyWBEM is a Python module for making CIM operation calls using the WBEM \
protocol to query and update managed objects."
LICENSE = "LGPL-2.1-or-later"

PV = "1.4.1"

RPM_NAME = "python39-pywbem-1.4.1-1.10.noarch.rpm"
RPM_HASH = "ad84029fecc8279ff5ec319469409932d21cf8422e98268407654221fbf44ad99ecc61c21c9077b27466a3f71d9a79cf4c695a051f679bc3c8629ce0d4ebde75"
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
