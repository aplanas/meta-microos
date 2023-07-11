SUMMARY = "Data loading and cataloging system"
DESCRIPTION = "A plugin system for loading your data and making data catalogs."
LICENSE = "BSD-2-Clause"

PV = "0.7.0"

RPM_NAME = "python311-intake-0.7.0-1.1.noarch.rpm"
RPM_HASH = "823a719254ba90d6875a2a7e5a5b1d8e0252e099073de3f2844ca9b54321faac9be854a2962bd6a56fdfb06fce209caae932fdcbdf395a07aeb47dd9c706d8f5"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-intake \
python3.11dist-intake \
python311-intake \
python3dist-intake"

RDEPENDS:${PN} += "/usr/bin/python3.11 \
/usr/bin/sh \
python-abi \
python311-Jinja2 \
python311-PyYAML \
python311-appdirs \
python311-dask \
python311-entrypoints \
python311-fsspec \
python311-msgpack \
python311-requests \
update-alternatives"

inherit rpm
