SUMMARY = "Python library for parsing Java properties"
DESCRIPTION = "A python library for parsing Java properties files."
LICENSE = "MIT"

PV = "0.7"

RPM_NAME = "python310-pyjavaproperties-0.7-2.16.noarch.rpm"
RPM_HASH = "efae6a7efa0a2ff11708a4e5117fe8c6ebed6353e22c9763d8de6270486ac1cee8b51ff3ccaa84afc8d1eb178ea5b5e230d519213ed84802a8d5c06645d5b07d"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.10dist-pyjavaproperties \
python310-pyjavaproperties \
python3dist-pyjavaproperties"

RDEPENDS:${PN} += "python-abi \
python310-base"

inherit rpm
