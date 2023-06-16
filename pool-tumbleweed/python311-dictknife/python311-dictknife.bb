SUMMARY = "Army knife of handling data"
DESCRIPTION = "Army knife of handling data, able to read and write JSON, YAML and TOML, \
and transform, merge and diff datasets. \
 \
Includes jsonknife for splitting files and dereferencing JSON using \
JSON pointer syntax."
LICENSE = "MIT"

PV = "0.13.0"

RPM_NAME = "python311-dictknife-0.13.0-4.9.noarch.rpm"
RPM_HASH = "ded500e61914c91a8e5652e9cdac41c5a7e012e6375485eefce70a1fca83b521bd520c6de461404948a5366c5838545902fcf044d9791fdadeb7dd2a2426d01a"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.11dist-dictknife \
python311-dictknife \
python3dist-dictknife"

RDEPENDS:${PN} += "/usr/bin/python3.11 \
/usr/bin/sh \
python-abi \
update-alternatives"

inherit rpm
