SUMMARY = "Audio Library Tools REloaded"
DESCRIPTION = "ALURE is a utility library to help manage common tasks with OpenAL \
applications. This includes device enumeration and initialization, \
file loading, and streaming."
LICENSE = "LGPL-2.0-or-later"

PV = "1.2"

RPM_NAME = "alure-1.2-4.5.aarch64.rpm"
RPM_HASH = "0b00928571113a70e93144d2c9b8c8e5f94951fb06f15f44c3e7e6f985cfeb51176bbc00379729a30597a42b7345f53441051f5fe5d48aa477a0736cac2748ad"

RPROVIDES:${PN} += "alure"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libalure.so.1 \
libc.so.6 \
libopenal.so.1"

inherit rpm
