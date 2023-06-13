SUMMARY = "Data loading and cataloging system"
DESCRIPTION = "A plugin system for loading your data and making data catalogs."
LICENSE = "BSD-2-Clause"

PV = "0.6.8"

RPM_NAME = "python310-intake-0.6.8-1.1.noarch.rpm"
RPM_HASH = "9ec8cc7ed55dc256ad15966f145a4a4f4d40044b3dec788fd9c57c24eb1bafbf68e1bd4fac777d35f125f5b4cf6abfcf6ec90c9291062d7a24f302911bee8cfc"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-intake \
python3.10dist(intake) \
python310-intake \
python3dist(intake)"

RDEPENDS:${PN} += "/bin/sh \
/usr/bin/python3.10 \
python(abi) \
python310-Jinja2 \
python310-PyYAML \
python310-appdirs \
python310-dask \
python310-dask-bag \
python310-entrypoints \
python310-fsspec \
python310-msgpack \
update-alternatives"

inherit rpm
