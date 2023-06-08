SUMMARY = "Haskell string-conversions profiling library"
DESCRIPTION = "This package provides the Haskell string-conversions profiling library."
LICENSE = "BSD-3-Clause"

PV = "0.4.0.1"

RPM_NAME = "ghc-string-conversions-prof-0.4.0.1-3.2.aarch64.rpm"
RPM_HASH = "20328434ff3ba4fcff9314f0cbc9667ae7553a4b504134aea472565e8d847f597f7c00bac12a86564adf3309826a4c2fdc9cb57fae8666b2d5fcd1af1e1c064e"

RPROVIDES:${PN} += "ghc-prof(string-conversions-0.4.0.1-B4OFWvpC4GeAVPq9bBfwkx) ghc-string-conversions-prof ghc-string-conversions-prof(aarch-64)"
RDEPENDS:${PN} += "ghc-prof(base-4.17.1.0) ghc-prof(bytestring-0.11.4.0) ghc-prof(text-2.0.2) ghc-prof(utf8-string-1.0.2-3yyxPCwARUwDt9ZNWn320Q) ghc-string-conversions-devel"

inherit rpm
