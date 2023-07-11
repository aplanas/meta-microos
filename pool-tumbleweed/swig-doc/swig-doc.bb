SUMMARY = "SWIG Manual"
DESCRIPTION = "SWIG is a compiler that attempts to make it easy to integrate C, C++, \
or Objective-C code with scripting languages including Perl, Tcl, and \
Python.  In a nutshell, you give it a bunch of ANSI C/C++ declarations \
and it generates an interface between C and your favorite scripting \
language.  However, this is only scratching the surface of what SWIG \
can do--some of its more advanced features include automatic \
documentation generation, module and library management, extensive \
customization options, and more. \
 \
This package contains the SWIG manual."
LICENSE = "BSD-3-Clause"

PV = "4.1.1"

RPM_NAME = "swig-doc-4.1.1-2.4.noarch.rpm"
RPM_HASH = "a50a4eec9fbc8cecfda9927779647d018b4b7eb9ab2196e2160364f92e8dfb308465fa77e737a9c4ad914b3b07d50f46dab2a7c650d19e6555e3e0cbfe97b13f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "swig-doc"

RDEPENDS:${PN} += "swig"

inherit rpm
