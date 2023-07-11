SUMMARY = "Development files for dictd"
DESCRIPTION = "This package contains two programs. dict gives access to \
electronic dictionaries on the Internet. With dictd, one can \
set up a custom dictionary. To look up, for example, the word 'grunt', \
execute `dict grunt` at a command line. See the man pages of dict and \
dictd for details. \
 \
This package contains development files for the dictd package."
LICENSE = "GPL-1.0-or-later & Zlib & MIT"

PV = "1.13.1"

RPM_NAME = "dictd-devel-1.13.1-1.9.aarch64.rpm"
RPM_HASH = "e2f5c8d865e70aae0e1020c5289bef6c427854d81c1088bb3893549e881367c6a0786a74a4b82a0afffea31658c349948c8866b2b6146caef7b251fe3fc16465"

RPROVIDES:${PN} += "dictd-devel"

RDEPENDS:${PN} += "dictd"

inherit rpm
