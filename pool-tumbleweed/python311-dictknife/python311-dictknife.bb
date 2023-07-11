SUMMARY = "Army knife of handling data"
DESCRIPTION = "Army knife of handling data, able to read and write JSON, YAML and TOML, \
and transform, merge and diff datasets. \
 \
Includes jsonknife for splitting files and dereferencing JSON using \
JSON pointer syntax."
LICENSE = "MIT"

PV = "0.13.0"

RPM_NAME = "python311-dictknife-0.13.0-4.11.noarch.rpm"
RPM_HASH = "99877737c1eca941fa3753e91f185d5bba6a7b941731cf21b83abb04f79df60a3835f00090a1007048558a7806124de7ecb1f0b8cca353a95e4a4bbafa5f45eb"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-dictknife \
python3.11dist-dictknife \
python311-dictknife \
python3dist-dictknife"

RDEPENDS:${PN} += "/usr/bin/python3.11 \
/usr/bin/sh \
python-abi \
update-alternatives"

inherit rpm
