SUMMARY = "Python3 bindings for OpenWSMAN client API"
DESCRIPTION = "This package provides Python3 bindings to access the OpenWSMAN client \
API."
LICENSE = "BSD-3-Clause & GPL-2.0-only"

PV = "2.7.2"

RPM_NAME = "python3-openwsman-2.7.2-2.5.aarch64.rpm"
RPM_HASH = "fbd84d699e5a16bbcac165619ba5eed3f257bb0f84587f1dcc67fa73017d2e9d9343d038951d30830be77412979598a8212d1d4ecb3b0c63620bdaf6be28496b"

RPROVIDES:${PN} += "openwsman-python \
python3-openwsman \
python3-openwsman(aarch-64)"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) \
libc.so.6()(64bit) \
libwsman.so.1()(64bit) \
libwsman_client.so.5()(64bit) \
libwsman_curl_client_transport.so.1()(64bit) \
python(abi) \
python3"

inherit rpm
