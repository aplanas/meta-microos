SUMMARY = "OCaml library for common file and filename operations"
DESCRIPTION = "This library is intended to provide a basic interface to the most \
common file and filename operations.  It provides several different \
filename functions: reduce, make_absolute, make_relative...  It also \
enables you to manipulate real files: cp, mv, rm, touch... \
 \
It is separated into two modules: SysUtil and SysPath.  The first one \
manipulates real files, the second one is made for manipulating \
abstract filenames."
LICENSE = "SUSE-LGPL-2.0-with-linking-exception"

PV = "0.6.4"

RPM_NAME = "ocaml-fileutils-0.6.4-1.3.aarch64.rpm"
RPM_HASH = "2eff37715089ce1aa075cb5d8e2ba3f639dabe2ad8ac99e63057c8a3cae901e7b804f8edc1ad95dfe08639c6c50eea70bd6e3ad7faa90a74cb4ae041a19d92a8"

RPROVIDES:${PN} += "ocaml-fileutils"

RDEPENDS:${PN} += ""

inherit rpm
