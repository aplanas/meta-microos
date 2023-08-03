SUMMARY = "Development files for Unified Communication X Memory Hooks"
DESCRIPTION = "libucm is a standalone non-unloadable library which installs hooks \
for virtual memory changes in the current process."
LICENSE = "BSD-3-Clause"

PV = "1.14.1"

RPM_NAME = "libucm-devel-1.14.1-1.1.aarch64.rpm"
RPM_HASH = "498a6c3336ce8dc5d5a8e54e89b0a6bba1a6077fc045f99ad4037f2f7415c070120b4d695cfa204481ef96a32413adc1c8065b61dc0a8d23b44febced1735e71"

RPROVIDES:${PN} += "libucm-devel"

RDEPENDS:${PN} += "libucm0"

inherit rpm
