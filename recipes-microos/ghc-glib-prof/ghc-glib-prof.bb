SUMMARY = "Haskell glib profiling library"
DESCRIPTION = "This package provides the Haskell glib profiling library."
LICENSE = "LGPL-2.1-only"

PV = "0.13.8.2"

RPM_NAME = "ghc-glib-prof-0.13.8.2-2.3.aarch64.rpm"
RPM_HASH = "17f0d0aac8e778737c8427f6e858ae02bd460d8ead26d238e607b99d797917b431a08bb37f494a555af3a6ca2f1896755d4a4e58847c8d2d5e9e87f98aae5b0e"

RPROVIDES:${PN} += "ghc-glib-prof ghc-glib-prof(aarch-64) ghc-prof(glib-0.13.8.2-DQyux8etmkJKUbOUWF524Z)"
RDEPENDS:${PN} += "ghc-glib-devel ghc-prof(base-4.17.1.0) ghc-prof(bytestring-0.11.4.0) ghc-prof(containers-0.6.7) ghc-prof(text-2.0.2) ghc-prof(utf8-string-1.0.2-3yyxPCwARUwDt9ZNWn320Q)"

inherit rpm
