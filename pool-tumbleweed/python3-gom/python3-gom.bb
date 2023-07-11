SUMMARY = "Python3 binding for the GObject Dara Mapper"
DESCRIPTION = "This is a DataMapper for GObject. \
 \
With this package you can glue gom to python3."
LICENSE = "LGPL-2.1-or-later"

PV = "0.4"

RPM_NAME = "python3-gom-0.4-1.16.aarch64.rpm"
RPM_HASH = "47ea9120d520441857055e091efc0ed76a736ac8847bedc01a9f116b3d82c0cf08e5e331db39292266e9f8366e5a46873e870a840cf0bd7a2d7115200442b0b1"

RPROVIDES:${PN} += "python3-gom"

RDEPENDS:${PN} += "python-abi \
typelib-Gom"

inherit rpm
