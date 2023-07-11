SUMMARY = "Library for cross-platform detection of special directories"
DESCRIPTION = "C++ library to look for directories like My Documents, \
~/.config, etc. so that you do not need to write \
platform-specific code."
LICENSE = "MIT"

PV = "4.2.0"

RPM_NAME = "PlatformFolders-4.2.0-1.4.aarch64.rpm"
RPM_HASH = "f9814e22489dbb09f3419e9e7b546754952eeba2fabd5dcad6b5b544bf7af093d989c51ea58229b5aebd39f1b6bb58e7ed9336e5d39b670addff24373a57442b"

RPROVIDES:${PN} += "PlatformFolders \
libplatform-folders.so"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libgcc-s.so.1 \
libstdc++.so.6"

inherit rpm
