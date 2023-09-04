SUMMARY = "Development files for libime"
DESCRIPTION = "This package provides development files for libime."
LICENSE = "LGPL-2.1-or-later"

PV = "1.1.1"

RPM_NAME = "libime-devel-1.1.1-1.1.aarch64.rpm"
RPM_HASH = "7afc3404ecc4ebe99c80c70168acbe0ca5211e98c80d723b7fff58308131382ce0759165303293bd4e029f15b57008ce817cb9900f817f6bcfe32c262729def6"

RPROVIDES:${PN} += "cmake-LibIMECore \
cmake-LibIMEPinyin \
cmake-LibIMETable \
libime-devel"

RDEPENDS:${PN} += "libIMECore0 \
libIMEPinyin0 \
libIMETable0"

inherit rpm
