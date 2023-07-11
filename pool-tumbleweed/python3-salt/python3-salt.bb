SUMMARY = "python3 library for salt"
DESCRIPTION = "Python3 specific files for salt"
LICENSE = "Apache-2.0"

PV = "3006.0"

RPM_NAME = "python3-salt-3006.0-1.4.aarch64.rpm"
RPM_HASH = "b687c9afcfc4b85861b08b631e00742bc9f8179d186ae2e5170d7d799c952964eb1d92f06e0f486a526e27eb8f182a8dd79dea8dc9709dd5c51ba75e8515f576"

RPROVIDES:${PN} += "bundled-python3-tornado \
python3-salt \
python3.11dist-salt \
python3dist-salt"

RDEPENDS:${PN} += "/usr/bin/env \
/usr/bin/sh \
libzypp-plugin-system \
python-abi \
python3 \
python3-Jinja2 \
python3-M2Crypto \
python3-MarkupSafe \
python3-PyYAML \
python3-contextvars \
python3-distro \
python3-jmespath \
python3-looseversion \
python3-msgpack-python \
python3-packaging \
python3-psutil \
python3-pyzmq \
python3-requests \
python3-rpm \
python3-xml \
python3-zypp-plugin \
salt"

inherit rpm
