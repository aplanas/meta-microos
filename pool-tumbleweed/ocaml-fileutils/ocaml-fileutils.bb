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

RPM_NAME = "ocaml-fileutils-0.6.4-1.4.aarch64.rpm"
RPM_HASH = "69e20861732b5769b5a63aa2c4bc09bae001f0d350784f07bfb33355fd71ef7e7e4258373e77f41b5a3c129bb5e3dcc2849e7e8d4c24fa89a4cffb4ae764d59f"

RPROVIDES:${PN} += "ocaml-fileutils"

RDEPENDS:${PN} += ""

inherit rpm
