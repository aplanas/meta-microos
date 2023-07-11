SUMMARY = "Army knife of handling data"
DESCRIPTION = "Army knife of handling data, able to read and write JSON, YAML and TOML, \
and transform, merge and diff datasets. \
 \
Includes jsonknife for splitting files and dereferencing JSON using \
JSON pointer syntax."
LICENSE = "MIT"

PV = "0.13.0"

RPM_NAME = "python39-dictknife-0.13.0-4.11.noarch.rpm"
RPM_HASH = "1bf0a555f3c304a5d5fbdf138865f6dd9b8ac5c027644f21ac3bbfca1657faffa8f3a9b0a1787f7d0e5fecd2a2ab8d5b5a3ef409c7c5958ef2e9539419f063eb"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-dictknife \
python39-dictknife \
python3dist-dictknife"

RDEPENDS:${PN} += "/usr/bin/python3.9 \
/usr/bin/sh \
python-abi \
update-alternatives"

inherit rpm
