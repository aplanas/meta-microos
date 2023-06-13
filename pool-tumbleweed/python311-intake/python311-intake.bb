SUMMARY = "Data loading and cataloging system"
DESCRIPTION = "A plugin system for loading your data and making data catalogs."
LICENSE = "BSD-2-Clause"

PV = "0.6.8"

RPM_NAME = "python311-intake-0.6.8-1.1.noarch.rpm"
RPM_HASH = "02893971baac1844ab5ee814f2e497eccde48009e808dc89d55acfb3c60a51442969e5e46c528749d00e043a7a654e26117d227b9377db03d060d2c8a3ba796f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.11dist(intake) \
python311-intake \
python3dist(intake)"

RDEPENDS:${PN} += "/bin/sh \
/usr/bin/python3.11 \
python(abi) \
python311-Jinja2 \
python311-PyYAML \
python311-appdirs \
python311-dask \
python311-dask-bag \
python311-entrypoints \
python311-fsspec \
python311-msgpack \
update-alternatives"

inherit rpm
