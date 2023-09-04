SUMMARY = "Private PyPI caching server"
DESCRIPTION = "A private PyPI caching server, providing user or team based indices which can \
inherit packages from each other or from the pypi.org site."
LICENSE = "MIT"

PV = "6.9.2"

RPM_NAME = "python311-devpi-server-6.9.2-1.1.noarch.rpm"
RPM_HASH = "b3dfa9934d86e26ddaf0571eb3abe95a6c0a95c7d916ccfb58c53b2e5f680f2a2d0669d4cb20e13e3d64e5ab60d75949e2269588296d1ea5a7e05cfb717fd944"
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
