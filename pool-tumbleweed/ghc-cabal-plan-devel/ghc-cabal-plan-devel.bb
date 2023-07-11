SUMMARY = "Haskell cabal-plan library development files"
DESCRIPTION = "This package provides the Haskell cabal-plan library development files."
LICENSE = "GPL-2.0-or-later"

PV = "0.7.3.0"

RPM_NAME = "ghc-cabal-plan-devel-0.7.3.0-1.2.aarch64.rpm"
RPM_HASH = "a6d4a9fa4c9fed0a1e703d5611099fbbd9c74764ee48846f138b65bbeb944986342ed5c3880a90e805b62ef71d161523a9ceb11e2a08890604b637c765c0ac95"

RPROVIDES:${PN} += "ghc-cabal-plan-devel \
ghc-devel-cabal-plan-0.7.3.0-6cjqkAQfbyh3TLSGEHoT4c"

RDEPENDS:${PN} += "/usr/bin/sh \
ghc-cabal-plan \
ghc-compiler \
ghc-devel-aeson-2.1.2.1-HkN6OtqTngQ9De3CKBnfov \
ghc-devel-base-4.17.1.0 \
ghc-devel-base16-bytestring-1.0.2.0-BWBHxp15W1kvZUUcQHZQU \
ghc-devel-bytestring-0.11.4.0 \
ghc-devel-containers-0.6.7 \
ghc-devel-directory-1.3.7.1 \
ghc-devel-filepath-1.4.2.2 \
ghc-devel-text-2.0.2"

inherit rpm
