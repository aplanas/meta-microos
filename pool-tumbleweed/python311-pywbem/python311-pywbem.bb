SUMMARY = "Python module for making CIM operation calls using the WBEM protocol"
DESCRIPTION = "PyWBEM is a Python module for making CIM operation calls using the WBEM \
protocol to query and update managed objects."
LICENSE = "LGPL-2.1-or-later"

PV = "1.4.1"

RPM_NAME = "python311-pywbem-1.4.1-1.9.noarch.rpm"
RPM_HASH = "2d8e474e578e3101e5cb87bcc03b6c2054c5ac4ceaf90afb8aa2d94fd67c0f838a9bce7640f165b604c24a6a29f9ad15f8d7a86d8e2c011950569a751e973293"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.11dist(pywbem) \
python311-pywbem \
python3dist(pywbem)"

RDEPENDS:${PN} += "/bin/sh \
/usr/bin/python3.11 \
python(abi) \
python311-PyYAML \
python311-nocasedict \
python311-nocaselist \
python311-ply \
python311-requests \
python311-six \
python311-urllib3 \
python311-yamlloader \
update-alternatives"

inherit rpm
