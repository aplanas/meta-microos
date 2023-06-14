SUMMARY = "python3 library for salt"
DESCRIPTION = "Python3 specific files for salt"
LICENSE = "Apache-2.0"

PV = "3006.0"

RPM_NAME = "python3-salt-3006.0-1.1.aarch64.rpm"
RPM_HASH = "e5d79b78fead94c23e6656db96c6a3d488a4598fda2def7c525254b3378fe49c25a926d9da35add5a5676c3848ca018e701a51d29fdeb9c421c5878788e1a0df"

RPROVIDES:${PN} += "bundled-python3-tornado \
python3-salt \
python3.10dist-salt \
python3dist-salt"

RDEPENDS:${PN} += "/bin/sh \
/usr/bin/env \
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
