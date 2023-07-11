SUMMARY = "SWIG example files"
DESCRIPTION = "SWIG is a compiler that attempts to make it easy to integrate C, C++, \
or Objective-C code with scripting languages including Perl, Tcl, and \
Python.  In a nutshell, you give it a bunch of ANSI C/C++ declarations \
and it generates an interface between C and your favorite scripting \
language.  However, this is only scratching the surface of what SWIG \
can do--some of its more advanced features include automatic \
documentation generation, module and library management, extensive \
customization options, and more. \
 \
This package contains SWIG examples, useful both for testing and \
understandig SWIG usage."
LICENSE = "BSD-3-Clause"

PV = "4.1.1"

RPM_NAME = "swig-examples-4.1.1-2.4.aarch64.rpm"
RPM_HASH = "8cf8710743610c08ecd863fd4a24b09cf7ed11941e5fd61966295d916785b50c6f7ceb1197204565a05d93626a679f0954b80fced2ae98a1f4419fbebe8c0e37"

RPROVIDES:${PN} += "swig-examples"

RDEPENDS:${PN} += "swig"

inherit rpm
