SUMMARY = "Haskell aeson-pretty library development files"
DESCRIPTION = "This package provides the Haskell aeson-pretty library development files."
LICENSE = "BSD-3-Clause"

PV = "0.8.9"

RPM_NAME = "ghc-aeson-pretty-devel-0.8.9-4.3.aarch64.rpm"
RPM_HASH = "020ad4679d31d525f2d32fa8247d4b981b862f24710c6b327fe1bd7018af14db8e90c1741328d43c4f45b739f030906533a7bcac2d3cdb3bd2947181dc27d8bb"

RPROVIDES:${PN} += "ghc-aeson-pretty-devel \
ghc-devel-aeson-pretty-0.8.9-ANiMUyahKok8eMC9BUYvO0"

RDEPENDS:${PN} += "/usr/bin/sh \
ghc-aeson-pretty \
ghc-compiler \
ghc-devel-aeson-2.1.2.1-HkN6OtqTngQ9De3CKBnfov \
ghc-devel-base-4.17.1.0 \
ghc-devel-base-compat-0.13.0-Cvz3167VMpo6rdOohSlum3 \
ghc-devel-bytestring-0.11.4.0 \
ghc-devel-scientific-0.3.7.0-D5F2vql7x79Dy9hx72OES1 \
ghc-devel-text-2.0.2 \
ghc-devel-unordered-containers-0.2.19.1-KblUXVJ0SvRCcK89PoBx7E \
ghc-devel-vector-0.13.0.0-AbjrQrWxuFpAjIHk3G7xsp"

inherit rpm
