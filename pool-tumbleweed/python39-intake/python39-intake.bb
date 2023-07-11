SUMMARY = "Data loading and cataloging system"
DESCRIPTION = "A plugin system for loading your data and making data catalogs."
LICENSE = "BSD-2-Clause"

PV = "0.7.0"

RPM_NAME = "python39-intake-0.7.0-1.1.noarch.rpm"
RPM_HASH = "d5153fd2d275f6ff29fd4ecf675892d473b3c0b647d62a5ff8ec3220d2246347c300e776d82ea8b62e526be2ea8f15c22881a35571c41270b571e58026579f36"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-intake \
python39-intake \
python3dist-intake"

RDEPENDS:${PN} += "/usr/bin/python3.9 \
/usr/bin/sh \
python-abi \
python39-Jinja2 \
python39-PyYAML \
python39-appdirs \
python39-dask \
python39-entrypoints \
python39-fsspec \
python39-msgpack \
python39-requests \
update-alternatives"

inherit rpm
