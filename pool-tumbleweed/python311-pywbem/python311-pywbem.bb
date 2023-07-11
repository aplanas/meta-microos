SUMMARY = "Python module for making CIM operation calls using the WBEM protocol"
DESCRIPTION = "PyWBEM is a Python module for making CIM operation calls using the WBEM \
protocol to query and update managed objects."
LICENSE = "LGPL-2.1-or-later"

PV = "1.4.1"

RPM_NAME = "python311-pywbem-1.4.1-1.10.noarch.rpm"
RPM_HASH = "97343be284593d1e5fb30075408b566739f9cbe5dd7187afbfc90a7910186ce718ebb7a2a06cef7d248684448d1df183dd1da65235de3af7fce1e3c2ad837701"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-pywbem \
python3.11dist-pywbem \
python311-pywbem \
python3dist-pywbem"

RDEPENDS:${PN} += "/usr/bin/python3.11 \
/usr/bin/sh \
python-abi \
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
