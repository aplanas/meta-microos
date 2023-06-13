SUMMARY = "Private PyPI caching server"
DESCRIPTION = "A private PyPI caching server, providing user or team based indices which can \
inherit packages from each other or from the pypi.org site."
LICENSE = "MIT"

PV = "6.8.0"

RPM_NAME = "python39-devpi-server-6.8.0-2.1.noarch.rpm"
RPM_HASH = "91cb9c9a93c0cd53b7c929843b940387415c557f45115e9061c96f0524ad5943fdb9851a0fe57f42cf726c982a4c255ec9d0526a96ae060a049925eea02b8b1c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist(devpi-server) \
python39-devpi-server \
python3dist(devpi-server)"

RDEPENDS:${PN} += "/bin/sh \
/usr/bin/python3.9 \
python(abi) \
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
