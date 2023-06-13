SUMMARY = "Load and dump data from json-like format into typed data structures"
DESCRIPTION = "Load and dump data from json-like format into typed data structures"
LICENSE = "GPL-3.0-only"

PV = "2.19"

RPM_NAME = "python39-typedload-2.19-1.3.noarch.rpm"
RPM_HASH = "bd68865a03b2f2b52d5efc50dd57d10622179763d544578c953674768f59eb2252eda076f4249836c329ab63df8c7bf77aade4c82af588755e0f3f4f2c543d28"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist(typedload) \
python39-typedload \
python3dist(typedload)"

RDEPENDS:${PN} += "python(abi)"

inherit rpm
