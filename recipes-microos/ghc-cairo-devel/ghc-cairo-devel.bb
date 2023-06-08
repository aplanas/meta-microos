SUMMARY = "Haskell cairo library development files"
DESCRIPTION = "This package provides the Haskell cairo library development files."
LICENSE = "BSD-3-Clause"

PV = "0.13.8.2"

RPM_NAME = "ghc-cairo-devel-0.13.8.2-2.3.aarch64.rpm"
RPM_HASH = "7e91bee7ee5b2713f5e4d3aee342c15a26789c0179b5ab609f247f07dd02580f1fd7c2e2959e4dc634499896c117623314cc8de02487a2f6aba46a1bb1a029f7"

RPROVIDES:${PN} += "ghc-cairo-devel ghc-cairo-devel(aarch-64) ghc-devel(cairo-0.13.8.2-84nOBKgVLz3788JDxxB5om)"
RDEPENDS:${PN} += "/bin/sh ghc-cairo ghc-compiler ghc-devel(array-0.5.4.0) ghc-devel(base-4.17.1.0) ghc-devel(bytestring-0.11.4.0) ghc-devel(mtl-2.2.2) ghc-devel(text-2.0.2) ghc-devel(utf8-string-1.0.2-3yyxPCwARUwDt9ZNWn320Q) pkgconfig pkgconfig(cairo) pkgconfig(cairo-pdf) pkgconfig(cairo-ps) pkgconfig(cairo-svg)"

inherit rpm
