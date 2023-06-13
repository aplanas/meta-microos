SUMMARY = "Python3 bindings for GEIS"
DESCRIPTION = "This package provides the python3 bindings for GEIS."
LICENSE = "GPL-3.0-only & LGPL-3.0-only"

PV = "2.2.17"

RPM_NAME = "python3-geis-2.2.17-4.9.aarch64.rpm"
RPM_HASH = "14075a44f38a56235ab369f76538e621fcc8e4ae6a35d08fea5913d16b0ed1650850100c1e6ed359337a900616c915ce27e5f219c42473c4b2178f89e5b7378a"

RPROVIDES:${PN} += "python3-geis \
python3-geis(aarch-64)"

RDEPENDS:${PN} += "/usr/bin/python3 \
python(abi)"

inherit rpm
