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

RPM_NAME = "python310-docker-compose-1.29.2-2.6.noarch.rpm"
RPM_HASH = "ed82d7a7fad0b2760e3f8ce761291d976fdcde2bf75f6d4af2af0c2ff1742dc3275c7e13860a2e4f769a6f2e135489e641892682aeb075e40ab618026471cb20"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "docker-compose \
python3.10dist-docker-compose \
python310-docker-compose \
python3dist-docker-compose"

RDEPENDS:${PN} += "/usr/bin/python3.10 \
/usr/bin/sh \
python-abi \
python310-PySocks \
python310-PyYAML \
python310-cached-property \
python310-chardet \
python310-distro \
python310-docker \
python310-docker-pycreds \
python310-dockerpty \
python310-docopt \
python310-idna \
python310-jsonschema \
python310-python-dotenv \
python310-requests \
python310-texttable \
python310-websocket-client \
update-alternatives"

inherit rpm
