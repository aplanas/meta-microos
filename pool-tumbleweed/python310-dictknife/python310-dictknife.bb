SUMMARY = "Army knife of handling data"
DESCRIPTION = "Army knife of handling data, able to read and write JSON, YAML and TOML, \
and transform, merge and diff datasets. \
 \
Includes jsonknife for splitting files and dereferencing JSON using \
JSON pointer syntax."
LICENSE = "MIT"

PV = "0.13.0"

RPM_NAME = "python310-dictknife-0.13.0-4.11.noarch.rpm"
RPM_HASH = "d34f0f2186f54a0930f92dce40187c5f5bc73e5fae6a8d2ff3a9b7296d2e91dd073bf2578ce3fca7ab3748884a710efe7ea611e09db2439e950e53da31577b74"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.10dist-dictknife \
python310-dictknife \
python3dist-dictknife"

RDEPENDS:${PN} += "/usr/bin/python3.10 \
/usr/bin/sh \
python-abi \
update-alternatives"

inherit rpm
