SUMMARY = "Tools for tracing OpenGL"
DESCRIPTION = "This package contains libs that are preloaded into traced programs."
LICENSE = "MIT"

PV = "10.0"

RPM_NAME = "apitrace-wrappers-10.0-2.11.aarch64.rpm"
RPM_HASH = "d9b285423aadf1ed01a561b8ff0d8f6e4093c862b7eecb0f3ae0b1c7df1918ffa97fab1d8e48ceee5d79ba47666ffec547aeb37793b4318e9aaad8cf1042b60e"

RPROVIDES:${PN} += "apitrace-wrappers"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6"

inherit rpm
