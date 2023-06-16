SUMMARY = "Test Anything Protocol (TAP) tools"
DESCRIPTION = "Test Anything Protocol (TAP) tools."
LICENSE = "BSD-2-Clause"

PV = "3.1"

RPM_NAME = "python310-tap.py-3.1-1.6.noarch.rpm"
RPM_HASH = "2e7a0ee80e07cd21e4440c52b5cf0ab510d262ad2513c54f99799e84b8db211becae9d9f439a7268fbb20b6136973249058652196be94da448f17fbb960c5c79"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-tap.py \
python3.10dist-tap.py \
python310-tap.py \
python3dist-tap.py"

RDEPENDS:${PN} += "/usr/bin/python3.10 \
/usr/bin/sh \
python-abi \
python310-setuptools \
update-alternatives"

inherit rpm
