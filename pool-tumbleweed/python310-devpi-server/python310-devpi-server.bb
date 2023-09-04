SUMMARY = "Private PyPI caching server"
DESCRIPTION = "A private PyPI caching server, providing user or team based indices which can \
inherit packages from each other or from the pypi.org site."
LICENSE = "MIT"

PV = "6.9.2"

RPM_NAME = "python310-devpi-server-6.9.2-1.1.noarch.rpm"
RPM_HASH = "28c831910cd35397ea0338963d86d42b1e33b56662589d4320d4ad1df2b95c1dacdfca59021a807da752f001b6f10e0a789364504d3dc70871c5f06f058c3221"
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
