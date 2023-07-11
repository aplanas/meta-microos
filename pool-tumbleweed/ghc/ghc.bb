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

PV = "9.4.5"

RPM_NAME = "ghc-9.4.5-3.2.aarch64.rpm"
RPM_HASH = "cbbee223ac1818dd0324a6343834c0d88f2da41854d799fb60112fb87f1c7711fea043148790c031151980c430a3f373cedfdb2898038fdb6253d479ecce49e1"

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
