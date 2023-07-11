SUMMARY = "Haskell libmpd library development files"
DESCRIPTION = "This package provides the Haskell libmpd library development files."
LICENSE = "MIT"

PV = "0.10.0.0"

RPM_NAME = "ghc-libmpd-devel-0.10.0.0-2.8.aarch64.rpm"
RPM_HASH = "f0082706ce310dba9060dd10d3c1a5a262f98431b746ade45d4b382e353fd2f3af3a03281c7d65a791e3d274cb9906949888a121ea27e004ac4da720802193e8"

RPROVIDES:${PN} += "ghc-devel-libmpd-0.10.0.0-1mRX9TQl9aY4gH6teXbpki \
ghc-libmpd-devel"

RDEPENDS:${PN} += "/usr/bin/sh \
ghc-compiler \
ghc-devel-attoparsec-0.14.4-21v4nlnPs0qLZ5R1FIK9u3 \
ghc-devel-base-4.17.1.0 \
ghc-devel-bytestring-0.11.4.0 \
ghc-devel-containers-0.6.7 \
ghc-devel-data-default-class-0.1.2.0-2LD1I8dZmn7BW4dkzEwdGZ \
ghc-devel-filepath-1.4.2.2 \
ghc-devel-mtl-2.2.2 \
ghc-devel-network-3.1.4.0-FvtFepOtuCUH79FCWyNxIc \
ghc-devel-safe-exceptions-0.1.7.4-8XVKrMBchTjCLhdcvBwBNb \
ghc-devel-text-2.0.2 \
ghc-devel-time-1.12.2 \
ghc-devel-utf8-string-1.0.2-3yyxPCwARUwDt9ZNWn320Q \
ghc-libmpd"

inherit rpm
