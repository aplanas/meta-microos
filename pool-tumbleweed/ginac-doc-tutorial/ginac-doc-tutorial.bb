SUMMARY = "The GiNaC tutorial in PDF format"
DESCRIPTION = "GiNaC (which stands for 'GiNaC is Not a CAS (Computer Algebra System)') is an \
open framework for symbolic computation within the C++ programming language. \
 \
This package provides a tutorial file for GiNaC in PDF format."
LICENSE = "GPL-2.0-only"

PV = "1.8.6"

RPM_NAME = "ginac-doc-tutorial-1.8.6-1.1.noarch.rpm"
RPM_HASH = "22ac3c61afcfc7caed6c00e77b80b5d694b4d2f7575909055e2b943517ab4f5fdea10279fb71a295983efd2b712857cef2130d7ccfdfdf6e029d3992332c5812"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "ginac-doc-tutorial"

RDEPENDS:${PN} += ""

inherit rpm
