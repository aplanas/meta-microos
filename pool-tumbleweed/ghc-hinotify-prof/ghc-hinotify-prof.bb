SUMMARY = "Haskell hinotify profiling library"
DESCRIPTION = "This package provides the Haskell hinotify profiling library."
LICENSE = "BSD-3-Clause"

PV = "0.4.1"

RPM_NAME = "ghc-hinotify-prof-0.4.1-3.4.aarch64.rpm"
RPM_HASH = "5e4f4d9698e25969c697cbfa5a1c6e39aa3a35b425e6dd97341c7766326dca6f96c124663733e695fccce6bd177279614e36a52af77e0cb824dbd84e4599b775"

RPROVIDES:${PN} += "ghc-hinotify-prof \
ghc-prof-hinotify-0.4.1-JFQ6DOM0mgyCikOfj8YmfP"

RDEPENDS:${PN} += "ghc-hinotify-devel \
ghc-prof-async-2.2.4-LcXCzTmy8C6G7Wa774EctI \
ghc-prof-base-4.17.2.0 \
ghc-prof-bytestring-0.11.5.1 \
ghc-prof-containers-0.6.7 \
ghc-prof-unix-2.7.3"

inherit rpm
