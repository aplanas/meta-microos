SUMMARY = "An IBus engine for users of the Cangjie and Quick input methods"
DESCRIPTION = "IBus engine for users of the Cangjie and Quick input methods. \
It is primarily intended to Hong Kong people who want to input Traditional Chinese, as they are (by far) the majority of Cangjie and Quick users. However, it should work for others as well (e.g to input Simplified Chinese)."
LICENSE = "GPL-3.0"

PV = "2.4"

RPM_NAME = "ibus-cangjie-2.4-2.15.noarch.rpm"
RPM_HASH = "f6fc51bc0c291e90d90665469c7b00a6362c986e5aa2938ac8848c490dee91f120c2ef5e42bf17f391b4d42f69e1b87e3b957a6c1fe34dd1f59062357e3f8879"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "ibus-cangjie"

RDEPENDS:${PN} += "/usr/bin/python3 \
ibus \
python-abi \
python3 \
python3-cangjie \
python3-gobject"

inherit rpm
