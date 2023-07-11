SUMMARY = "Tool to define and run complex applications using Docker"
DESCRIPTION = "Compose is a tool for defining and running complex applications with Docker. \
With Compose, you define a multi-container application in a single file, then \
spin your application up in a single command which does everything that needs \
to be done to get it running. \
 \
Compose is great for development environments, staging servers, and CI. We \
don't recommend that you use it in production yet. \
 \
Previously known as Fig."
LICENSE = "Apache-2.0"

PV = "1.29.2"

RPM_NAME = "python39-docker-compose-1.29.2-2.6.noarch.rpm"
RPM_HASH = "0c1356d11a5a39883e2b4b12a88f4087eb8232722a44acc7ccb56156cfd1ec911676432957bcea996dfc5fcac36b499cf6f1f13f85e1a3623ebb1d04885f18ba"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "docker-compose \
python3.9dist-docker-compose \
python39-docker-compose \
python3dist-docker-compose"

RDEPENDS:${PN} += "/usr/bin/python3.9 \
/usr/bin/sh \
python-abi \
python39-PySocks \
python39-PyYAML \
python39-cached-property \
python39-chardet \
python39-distro \
python39-docker \
python39-docker-pycreds \
python39-dockerpty \
python39-docopt \
python39-idna \
python39-jsonschema \
python39-python-dotenv \
python39-requests \
python39-texttable \
python39-websocket-client \
update-alternatives"

inherit rpm
