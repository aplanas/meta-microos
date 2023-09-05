SUMMARY = "python3 library for salt"
DESCRIPTION = "Python3 specific files for salt"
LICENSE = "Apache-2.0"

PV = "3006.0"

RPM_NAME = "python3-salt-3006.0-4.1.aarch64.rpm"
RPM_HASH = "b166aebc6c109d89dfa8c8162ccff76edda23cb00b82e2bee1fc736cb827b30e8b394776deeab615b5273be36f292da09ed2f19a78c13bacc7cad8cfdae6c76b"

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
