SUMMARY = "Shared library for Budgie raven plugins"
DESCRIPTION = "Shared library for budgie raven plugins to link against."
LICENSE = "GPL-2.0-or-later & LGPL-2.1-or-later"

PV = "10.7.2+0"

RPM_NAME = "libbudgie-raven-plugin0-10.7.2+0-1.2.aarch64.rpm"
RPM_HASH = "e488ec2d2ba9e1ca0dc3b5d15fb68abe3a35b577af01831964fd28a4730b59b4886a6d90fff9c96c6d986125c7872336ea9f8c4d5606d88fa1d5cf19ed69a567"

RPROVIDES:${PN} += "libbudgie-raven-plugin.so.0 \
libbudgie-raven-plugin0"

RDEPENDS:${PN} += "/sbin/ldconfig \
libglib-2.0.so.0 \
libgobject-2.0.so.0 \
libgtk-3.so.0"

inherit rpm
