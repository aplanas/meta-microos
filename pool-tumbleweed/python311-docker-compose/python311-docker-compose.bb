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

RPM_NAME = "python311-docker-compose-1.29.2-2.6.noarch.rpm"
RPM_HASH = "a1ff9c0c131223b92b8d596be90370373ec9554ee1a52ed741af906524514bc0bd08943b0a2512b6003df8dba068b1a0e55a1648f607d8519a5fdb3aba103b0d"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "docker-compose \
python3-docker-compose \
python3.11dist-docker-compose \
python311-docker-compose \
python3dist-docker-compose"

RDEPENDS:${PN} += "/usr/bin/python3.11 \
/usr/bin/sh \
python-abi \
python311-PySocks \
python311-PyYAML \
python311-cached-property \
python311-chardet \
python311-distro \
python311-docker \
python311-docker-pycreds \
python311-dockerpty \
python311-docopt \
python311-idna \
python311-jsonschema \
python311-python-dotenv \
python311-requests \
python311-texttable \
python311-websocket-client \
update-alternatives"

inherit rpm
