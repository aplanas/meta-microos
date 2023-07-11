SUMMARY = "Development package for chewing"
DESCRIPTION = "Development package for chewing (An Intelligent phonetic input method library for traditional Chinese)"
LICENSE = "LGPL-2.1-or-later"

PV = "0.5.1+git20200627.452f622"

RPM_NAME = "libchewing-devel-0.5.1+git20200627.452f622-1.10.aarch64.rpm"
RPM_HASH = "8c6c344c166b4190dc0f4b6ec22a04f951559991bf6c8beef22ab01048142702373bd594eaf53ddd868846107d2f7c20988f46b16637a1bdbc87e71e47b6fafe"

RPROVIDES:${PN} += "libchewing-devel \
pkgconfig-chewing"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libchewing3 \
python-chewing"

inherit rpm
