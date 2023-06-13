SUMMARY = "Library for cross-platform detection of special directories (development files)"
DESCRIPTION = "C++ library to look for directories like My Documents, \
~/.config, etc. so that you do not need to write \
platform-specific code. \
 \
These are Development files for the PlatformFolders library."
LICENSE = "MIT"

PV = "4.2.0"

RPM_NAME = "PlatformFolders-devel-4.2.0-1.3.aarch64.rpm"
RPM_HASH = "a31db32401ce8cd431f5035a703b52c01dbe3171b700b82615a0a66fb8b5a19c4519cdcb5991b6de165901182d2a361365c55d5b19c29c08c2a95e76e251c445"

RPROVIDES:${PN} += "PlatformFolders-devel \
PlatformFolders-devel(aarch-64) \
cmake(platform_folders)"

RDEPENDS:${PN} += "PlatformFolders"

inherit rpm
