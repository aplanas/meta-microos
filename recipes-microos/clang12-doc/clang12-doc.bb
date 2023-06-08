SUMMARY = "Documentation for Clang"
DESCRIPTION = "This package contains documentation for the Clang compiler."
LICENSE = "Apache-2.0-WITH-LLVM-exception | NCSA"

PV = "12.0.1"

RPM_NAME = "clang12-doc-12.0.1-11.1.noarch.rpm"
RPM_HASH = "3b6117bbeb5de3edd301ffd9f4f8c239fac01e6bb2c7a20e6538fdf74fb4927c8693c2437a5456a842c843f4606b3cdd54f99b9c06f41a5b39afa62acc6d4312"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "clang-doc-provider clang12-doc"
RDEPENDS:${PN} += ""

inherit rpm
