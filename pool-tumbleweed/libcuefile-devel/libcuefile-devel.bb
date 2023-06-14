SUMMARY = "Development files for libcuefile"
DESCRIPTION = "This package includes development files for libcuefile."
LICENSE = "GPL-2.0-only"

PV = "r475"

RPM_NAME = "libcuefile-devel-r475-2.15.aarch64.rpm"
RPM_HASH = "95be771f532950bb6588af381d621990279700901929ab1b86c6b72ab77afe5ba68520988998e56673031153627406b1f7b14871f5328aa1f5b58d52b261acdf"

RPROVIDES:${PN} += "libcuefile-devel"

RDEPENDS:${PN} += "libcuefile0"

inherit rpm
