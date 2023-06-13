SUMMARY = "Library for cross-platform detection of special directories"
DESCRIPTION = "C++ library to look for directories like My Documents, \
~/.config, etc. so that you do not need to write \
platform-specific code."
LICENSE = "MIT"

PV = "4.2.0"

RPM_NAME = "PlatformFolders-4.2.0-1.3.aarch64.rpm"
RPM_HASH = "22d1ae00e4b96a4bd82d6b7c8d425f38a575d49be51f130baf03c93a1dc29e7958be38dd6f96a65deb4d5f5fb8828f2c01813705176a9bf0c1376c5a97d1d5da"

RPROVIDES:${PN} += "PlatformFolders \
PlatformFolders(aarch-64) \
libplatform_folders.so()(64bit)"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) \
libc.so.6()(64bit) \
libgcc_s.so.1()(64bit) \
libstdc++.so.6()(64bit)"

inherit rpm
