SUMMARY = "Development Libraries and Header Files for Free kWnn"
DESCRIPTION = "This package contains the header files and libraries for building \
client programs that use the Korean Input System, Free kWnn."
LICENSE = "GPL-2.0-or-later"

PV = "1.1.1a023.1"

RPM_NAME = "fkwnn-devel-1.1.1a023.1-4.3.aarch64.rpm"
RPM_HASH = "98d582f32e16279104fa50dd79ee590f6d02f772c1a9740a6aaf6d2d4396cde7a845c65b0addf10821c311538223ab0f05d58c8050d5032c746f4105c98bf698"

RPROVIDES:${PN} += "fkwnn-devel \
fwknndev"

RDEPENDS:${PN} += "fcwnn-devel \
fkwnn"

inherit rpm
