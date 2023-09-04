SUMMARY = "Private PyPI caching server"
DESCRIPTION = "A private PyPI caching server, providing user or team based indices which can \
inherit packages from each other or from the pypi.org site."
LICENSE = "MIT"

PV = "6.9.2"

RPM_NAME = "python39-devpi-server-6.9.2-1.1.noarch.rpm"
RPM_HASH = "def136f40b92182407904f22c34bdbc00a7d3cb79ad3796a964a5b3f855178e22073cc1d1f191ee3abc910cabafd865bdfe5c8eed76e92f0bf61eb9ab3e82df9"
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
