SUMMARY = "Army knife of handling data"
DESCRIPTION = "Army knife of handling data, able to read and write JSON, YAML and TOML, \
and transform, merge and diff datasets. \
 \
Includes jsonknife for splitting files and dereferencing JSON using \
JSON pointer syntax."
LICENSE = "MIT"

PV = "0.13.0"

RPM_NAME = "python39-dictknife-0.13.0-4.9.noarch.rpm"
RPM_HASH = "6aba3a712a2d21922992da48b7385e914e55d25869fc12ae5d1f0fe840e2a185137a2a517d2a1fc16a9075bb7cdf91dc0fc85c46b54fd9d9fe8a26672b117c87"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-dictknife \
python39-dictknife \
python3dist-dictknife"

RDEPENDS:${PN} += "/usr/bin/python3.9 \
/usr/bin/sh \
python-abi \
update-alternatives"

inherit rpm
