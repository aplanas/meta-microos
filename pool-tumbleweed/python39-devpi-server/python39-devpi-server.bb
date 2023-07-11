SUMMARY = "Private PyPI caching server"
DESCRIPTION = "A private PyPI caching server, providing user or team based indices which can \
inherit packages from each other or from the pypi.org site."
LICENSE = "MIT"

PV = "6.8.0"

RPM_NAME = "python39-devpi-server-6.8.0-3.3.noarch.rpm"
RPM_HASH = "fb8975c9b3c7315d61f5ae3fe3461e10fc385ad240e9b3ad6db925d54cd2c179d4ca76028475135c342ce684242a82dcc285187dadf95619068c918e862e16b8"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-devpi-server \
python39-devpi-server \
python3dist-devpi-server"

RDEPENDS:${PN} += "/usr/bin/python3.9 \
/usr/bin/sh \
python-abi \
python39-aiohttp \
python39-appdirs \
python39-argon2-cffi \
python39-attrs \
python39-defusedxml \
python39-devpi-common \
python39-execnet \
python39-itsdangerous \
python39-lazy \
python39-passlib \
python39-platformdirs \
python39-pluggy \
python39-py \
python39-pyramid \
python39-repoze.lru \
python39-ruamel.yaml \
python39-strictyaml \
python39-waitress \
update-alternatives"

inherit rpm
