SUMMARY = "Private PyPI caching server"
DESCRIPTION = "A private PyPI caching server, providing user or team based indices which can \
inherit packages from each other or from the pypi.org site."
LICENSE = "MIT"

PV = "6.8.0"

RPM_NAME = "python310-devpi-server-6.8.0-2.1.noarch.rpm"
RPM_HASH = "efac1b362cac10accc729a73531137be22ffd4b57ab8ccb3bc631ddeb702b1e558bee9aa13750f70511602d08f0f57957c0a19475a8bc5489954300b07770d7a"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-devpi-server \
python3.10dist-devpi-server \
python310-devpi-server \
python3dist-devpi-server"

RDEPENDS:${PN} += "/bin/sh \
/usr/bin/python3.10 \
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
