SUMMARY = "Simplified Wrapper and Interface Generator"
DESCRIPTION = "SWIG is a compiler that attempts to make it easy to integrate C, C++, \
or Objective-C code with scripting languages including Perl, Tcl, and \
Python.  In a nutshell, you give it a bunch of ANSI C/C++ declarations \
and it generates an interface between C and your favorite scripting \
language.  However, this is only scratching the surface of what SWIG \
can do--some of its more advanced features include automatic \
documentation generation, module and library management, extensive \
customization options, and more."
LICENSE = "BSD-3-Clause & GPL-3.0-or-later"

PV = "4.1.1"

RPM_NAME = "swig-4.1.1-2.4.aarch64.rpm"
RPM_HASH = "1c6b1ac5d0a69971398892c903771512a9d683b15183be8c94214623b5df2a59b8baa8d48f625cafff63366950ccf3452b9c15f24a4ca86f4fd2532599b5fdc0"

RPROVIDES:${PN} += "swig"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libgcc-s.so.1 \
libpcre2-8.so.0 \
libstdc++.so.6"

inherit rpm
