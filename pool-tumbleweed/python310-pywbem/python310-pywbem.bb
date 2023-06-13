SUMMARY = "Python module for making CIM operation calls using the WBEM protocol"
DESCRIPTION = "PyWBEM is a Python module for making CIM operation calls using the WBEM \
protocol to query and update managed objects."
LICENSE = "LGPL-2.1-or-later"

PV = "1.4.1"

RPM_NAME = "python310-pywbem-1.4.1-1.9.noarch.rpm"
RPM_HASH = "e20bccb0cf732875663a748a8b52eac4b4c997402ff3fbfc70f443a3ea660e664e2eec55b541774eded19e94c5006a3c2a63b024e9b799cc0564eee6ec79e94b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-pywbem \
python3.10dist(pywbem) \
python310-pywbem \
python3dist(pywbem)"

RDEPENDS:${PN} += "/bin/sh \
/usr/bin/python3.10 \
python(abi) \
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
