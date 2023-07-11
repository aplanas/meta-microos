SUMMARY = "Libbraille driver for BRLTTY"
DESCRIPTION = "BRLTTY is a background process (daemon) which provides access to the \
Linux/Unix console (when in text mode) for a blind person using a \
refreshable braille display. It drives the braille display and provides \
complete screen review functionality. \
 \
This package contains the libbraille braille driver."
LICENSE = "LGPL-2.1-or-later"

PV = "6.5"

RPM_NAME = "brltty-driver-libbraille-6.5-3.1.aarch64.rpm"
RPM_HASH = "e0a29f703bd8e71cd479a519cee5237e9275e2527a70e2aff2d31b0d0fd045e924f40ab1035249a7f34475071b7da946818f9e497a44b3c283269e69aa64994b"

RPROVIDES:${PN} += "brltty-driver-libbraille \
libbrlttyblb.so"

RDEPENDS:${PN} += "brltty \
ld-linux-aarch64.so.1 \
libbraille-0.so.14 \
libc.so.6"

inherit rpm
