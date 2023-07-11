SUMMARY = "Data loading and cataloging system"
DESCRIPTION = "A plugin system for loading your data and making data catalogs."
LICENSE = "BSD-2-Clause"

PV = "0.7.0"

RPM_NAME = "python310-intake-0.7.0-1.1.noarch.rpm"
RPM_HASH = "85f86ea85e76eee05327d61de95ff04bf5941bdac04a6c2dfd6f9bea4b5067d975d7071a935664ec5b5015ee61a6c25af623b33e6f5393b2b3b1669662ad52cf"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.10dist-intake \
python310-intake \
python3dist-intake"

RDEPENDS:${PN} += "/usr/bin/python3.10 \
/usr/bin/sh \
python-abi \
python310-Jinja2 \
python310-PyYAML \
python310-appdirs \
python310-dask \
python310-entrypoints \
python310-fsspec \
python310-msgpack \
python310-requests \
update-alternatives"

inherit rpm
