SUMMARY = "Private PyPI caching server"
DESCRIPTION = "A private PyPI caching server, providing user or team based indices which can \
inherit packages from each other or from the pypi.org site."
LICENSE = "MIT"

PV = "6.8.0"

RPM_NAME = "python311-devpi-server-6.8.0-3.3.noarch.rpm"
RPM_HASH = "e87650746c36a1a53de053e6ed026c45c397eee523e1f2cdc4f40b20d62b14dc7f01e58781ad63cb791b03e96fe19738f43cb18e9b422b6a60dac5b12c83be38"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-devpi-server \
python3.11dist-devpi-server \
python311-devpi-server \
python3dist-devpi-server"

RDEPENDS:${PN} += "/usr/bin/python3.11 \
/usr/bin/sh \
python-abi \
python311-aiohttp \
python311-appdirs \
python311-argon2-cffi \
python311-attrs \
python311-defusedxml \
python311-devpi-common \
python311-execnet \
python311-itsdangerous \
python311-lazy \
python311-passlib \
python311-platformdirs \
python311-pluggy \
python311-py \
python311-pyramid \
python311-repoze.lru \
python311-ruamel.yaml \
python311-strictyaml \
python311-waitress \
update-alternatives"

inherit rpm
