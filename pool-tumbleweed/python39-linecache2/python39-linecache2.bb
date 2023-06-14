SUMMARY = "Backports of the linecache module"
DESCRIPTION = "A backport of linecache to older supported Pythons."
LICENSE = "Python-2.0"

PV = "1.0.0"

RPM_NAME = "python39-linecache2-1.0.0-6.1.noarch.rpm"
RPM_HASH = "c2fd9b698ee77fdd8cf9999bb11f4c1aefd2c0106165cb0ccd03b6aeee10c580f571b46bbeb7693cbcfb8e52ea3ed19c760b03ca4007cc963dc130e8755cb725"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-linecache2 \
python39-linecache2 \
python3dist-linecache2"

RDEPENDS:${PN} += "python-abi \
python39-pbr"

inherit rpm
