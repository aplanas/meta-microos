SUMMARY = "Documentation for LLVM"
DESCRIPTION = "This package contains documentation for the LLVM infrastructure."
LICENSE = "Apache-2.0-with-LLVM-exception & NCSA"

PV = "14.0.6"

RPM_NAME = "llvm14-doc-14.0.6-10.1.noarch.rpm"
RPM_HASH = "ebec00b88d0454ee0b41d3189cc53f937155d6706c30096aaaff80fbf69f6ae5c8c6fa1cbf63bb0ede1a88e45434edca58061cd7f045b26e3cc95d6ee1d77024"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "llvm-doc-provider \
llvm14-doc"

RDEPENDS:${PN} += "llvm14"

inherit rpm
