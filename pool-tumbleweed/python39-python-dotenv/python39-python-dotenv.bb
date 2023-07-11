SUMMARY = "Python library for .env support"
DESCRIPTION = "Add .env support to your Django/Flask apps in development and deployments."
LICENSE = "BSD-3-Clause"

PV = "1.0.0"

RPM_NAME = "python39-python-dotenv-1.0.0-1.3.noarch.rpm"
RPM_HASH = "2cb1ea7ffc1c5dfb193e7f63362cda03e3dd7721b0c1e625365566d939a46c405688a41111e635a24e11c1cffe1161893b540df2eb45ea0f5364298505e8fddb"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-python-dotenv \
python39-python-dotenv \
python3dist-python-dotenv"

RDEPENDS:${PN} += "/usr/bin/python3.9 \
/usr/bin/sh \
python-abi \
python39-click \
update-alternatives"

inherit rpm
