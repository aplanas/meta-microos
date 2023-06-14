SUMMARY = "An IBus engine for users of the Cangjie and Quick input methods"
DESCRIPTION = "IBus engine for users of the Cangjie and Quick input methods. \
It is primarily intended to Hong Kong people who want to input Traditional Chinese, as they are (by far) the majority of Cangjie and Quick users. However, it should work for others as well (e.g to input Simplified Chinese)."
LICENSE = "GPL-3.0"

PV = "2.4"

RPM_NAME = "ibus-cangjie-2.4-2.14.noarch.rpm"
RPM_HASH = "bfab526f99a4e92229ff01ab38ee740a71e55aac0220244eabe70d5a6941341763c1f7149bba3ba9d25dd2f44023af9382ca72aa8aae676fe42885220ab97155"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "ibus-cangjie"

RDEPENDS:${PN} += "/usr/bin/python3 \
ibus \
python-abi \
python3 \
python3-cangjie \
python3-gobject"

inherit rpm
