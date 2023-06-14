SUMMARY = "Tool to dump ABI of an ELF object containing DWARF debug info"
DESCRIPTION = "The tool is intended to be used with ABI Compliance Checker tool for tracking \
ABI changes of a C/C++ library or kernel module."
LICENSE = "LGPL-2.1-or-later"

PV = "1.2"

RPM_NAME = "abi-dumper-1.2-1.8.noarch.rpm"
RPM_HASH = "d502bf7b3591ccfa31a51374b369a488e3dea455ae70718d74704d9c097dcb57cee0a3a0257ac206e97d009a39e760f3f9620dc1d9c099716e145330a448bb3f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "abi-dumper"

RDEPENDS:${PN} += "/usr/bin/perl \
binutils \
elfutils \
gcc-c++ \
perl-Storable \
vtable-dumper"

inherit rpm
