SUMMARY = "The Glorious Glasgow Haskell Compiler"
DESCRIPTION = "Haskell is the standard purely functional programming language; the \
current language version is Haskell 98, agreed in December 1998. \
 \
GHC is a state-of-the-art programming suite for Haskell.  Included is \
an optimising compiler generating good code for a variety of \
platforms, together with an interactive system for convenient, quick \
development.  The distribution includes space and time profiling \
facilities, a large collection of libraries, and support for various \
language extensions, including concurrency, exceptions, and foreign \
language interfaces (C, C++, etc). \
 \
A wide variety of Haskell related resources (tutorials, libraries, \
specifications, documentation, compilers, interprbeters, references, \
contact information, links to research groups) are available from the \
Haskell home page at <http://www.haskell.org/>."
LICENSE = "BSD-3-Clause"

PV = "9.4.6"

RPM_NAME = "ghc-9.4.6-1.1.aarch64.rpm"
RPM_HASH = "40ee669f49d8f0cb30c9e9cc5f3e50a714c720bbb1d104702c2d78907052f633f9c2f04d2cb22539cb6bcc7538135d329d18f6f0393984172690daceff2fcbd3"

RPROVIDES:${PN} += "ghc"

RDEPENDS:${PN} += "ghc-compiler \
ghc-devel \
ghc-ghc-boot-devel \
ghc-ghc-compact-devel \
ghc-ghc-devel \
ghc-ghc-heap-devel \
ghc-ghci-devel \
ghc-hpc-devel \
ghc-libiserv-devel"

inherit rpm
