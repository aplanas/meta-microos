SUMMARY = "Files for targetd array support for libstoragemgmt"
DESCRIPTION = "The libstoragemgmt-targetd-plugin package contains plug-in for targetd \
array support."
LICENSE = "GPL-2.0-or-later & LGPL-2.1-or-later"

PV = "1.9.8"

RPM_NAME = "libstoragemgmt-targetd-plugin-1.9.8-1.2.noarch.rpm"
RPM_HASH = "d6ababf9ec2c46ff641429eae3dd08637449032fe257c06ef47c3d2805e0d7ce9cb3d22b984993c391316046749779d3bd55474ae322443ad051e0fd5f6cf09a"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "libstoragemgmt-targetd-plugin"

RDEPENDS:${PN} += "/usr/bin/python3 \
/usr/bin/sh \
python-abi \
python3-libstoragemgmt"

inherit rpm
