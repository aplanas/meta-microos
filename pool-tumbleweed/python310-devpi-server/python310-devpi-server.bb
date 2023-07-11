SUMMARY = "Private PyPI caching server"
DESCRIPTION = "A private PyPI caching server, providing user or team based indices which can \
inherit packages from each other or from the pypi.org site."
LICENSE = "MIT"

PV = "6.8.0"

RPM_NAME = "python310-devpi-server-6.8.0-3.3.noarch.rpm"
RPM_HASH = "65bb9fb29c66086c1b2dcdf39870a5a51fbbced070dd0ac1201c0bfbce7064eee6a5ec454d2be36b26a1027b36b10d12f892beda4d9fe5e21ec93825fc832d81"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.10dist-devpi-server \
python310-devpi-server \
python3dist-devpi-server"

RDEPENDS:${PN} += "/usr/bin/python3.10 \
/usr/bin/sh \
python-abi \
python310-aiohttp \
python310-appdirs \
python310-argon2-cffi \
python310-attrs \
python310-defusedxml \
python310-devpi-common \
python310-execnet \
python310-itsdangerous \
python310-lazy \
python310-passlib \
python310-platformdirs \
python310-pluggy \
python310-py \
python310-pyramid \
python310-repoze.lru \
python310-ruamel.yaml \
python310-strictyaml \
python310-waitress \
update-alternatives"

inherit rpm
