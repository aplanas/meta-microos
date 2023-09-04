SUMMARY = "python3 library for salt"
DESCRIPTION = "Python3 specific files for salt"
LICENSE = "Apache-2.0"

PV = "3006.0"

RPM_NAME = "python3-salt-3006.0-2.1.aarch64.rpm"
RPM_HASH = "4a5604668c2017cda65ed46be659a95ff744bdcbdac166d7f190013e961d360cd7bb812d13c30f084316b11c3d285ea24694148faa7e82424a51466eb8cb1f57"

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
