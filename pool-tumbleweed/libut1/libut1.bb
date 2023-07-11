SUMMARY = "Library for assisting in URI construction from templates"
DESCRIPTION = "This package provides the shared library libut from opendkim which \
assists in URI construction from templates."
LICENSE = "BSD-3-Clause"

PV = "2.11.0"

RPM_NAME = "libut1-2.11.0-7.16.aarch64.rpm"
RPM_HASH = "d05f3aeea176b546032e799a9f4610c0a541507ccd7203a72d2e7b9be342dbb3cf705eddb05012269d30589cb68bd36ecd48ec95accaa1488c9c6a4a2930f518"

RPROVIDES:${PN} += "config-libut1 \
libut.so.1 \
libut1"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6"

inherit rpm
