SUMMARY = "Python socket mock framework"
DESCRIPTION = "Socket Mock Framework - for all kinds of socket animals, web-clients \
included, with gevent/asyncio/SSL support."
LICENSE = "BSD-3-Clause"

PV = "3.11.1"

RPM_NAME = "python310-mocket-3.11.1-1.1.noarch.rpm"
RPM_HASH = "3fb68adfc84f001f3a09c9e22ee07d61b38219591734e1b3f7a8b26ef10e9f98ff8204b46db62bae51df2d9070205c64256a19d8633c17a4b91b18db181580ff"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-mocket \
python3.10dist-mocket \
python310-mocket \
python3dist-mocket"

RDEPENDS:${PN} += "python-abi \
python310-decorator \
python310-httptools \
python310-python-magic \
python310-urllib3"

inherit rpm
