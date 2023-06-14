SUMMARY = "Haskell aws profiling library"
DESCRIPTION = "This package provides the Haskell aws profiling library."
LICENSE = "BSD-3-Clause"

PV = "0.23"

RPM_NAME = "ghc-aws-prof-0.23-1.4.aarch64.rpm"
RPM_HASH = "e5668da39c2acb9137a52870ce477d994200724c571597847d174d9bd5b07b3ca778b6e0a9f50074562b6182a553e9a581dcd1c39312eba55c400c9c7aac1edf"

RPROVIDES:${PN} += "ghc-aws-prof \
ghc-prof-aws-0.23-3doj4K3gEsgA7HfIcBeC8x"

RDEPENDS:${PN} += "ghc-aws-devel \
ghc-prof-aeson-2.1.2.1-D6AdQzPi657L86q5kYUhvP \
ghc-prof-attoparsec-0.14.4-21v4nlnPs0qLZ5R1FIK9u3 \
ghc-prof-base-4.17.1.0 \
ghc-prof-base16-bytestring-1.0.2.0-BWBHxp15W1kvZUUcQHZQU \
ghc-prof-base64-bytestring-1.2.1.0-8KbzJpmSQbYKTeew1rv0hh \
ghc-prof-blaze-builder-0.4.2.2-1GcRIc7N7YHId5Q5gRvlvW \
ghc-prof-byteable-0.1.1-KSaZugJOm4ALb4WyX9cufg \
ghc-prof-bytestring-0.11.4.0 \
ghc-prof-case-insensitive-1.2.1.0-AumZoR4Lds63HJj8OQwHY3 \
ghc-prof-cereal-0.5.8.3-LNsxCTyOF85AKtb4iLTs8f \
ghc-prof-conduit-1.3.4.3-dAZVHPSYjL2zQ4RzAuWi2 \
ghc-prof-conduit-extra-1.3.6-F6u9UYzIZvy2L2764Izuhr \
ghc-prof-containers-0.6.7 \
ghc-prof-cryptonite-0.30-AbDFzA14dNKDfU9pLpBLye \
ghc-prof-data-default-0.7.1.1-5iNQUD7GKkTDiLEyJaqXSy \
ghc-prof-directory-1.3.7.1 \
ghc-prof-exceptions-0.10.5 \
ghc-prof-filepath-1.4.2.2 \
ghc-prof-http-client-tls-0.3.6.1-1pQpHwWyWRWKJTeRlrZZA0 \
ghc-prof-http-conduit-2.3.8-9gcbWW2UjPVHQDceZSAOIR \
ghc-prof-http-types-0.12.3-4BrMFwRucoT4fBt8cCVFS6 \
ghc-prof-lifted-base-0.2.3.12-2PslaVNAATq3HzvkpdIGSo \
ghc-prof-memory-0.18.0-2DG6nqjfLMK4MSR77XYQqL \
ghc-prof-monad-control-1.0.3.1-YXA6op7GEFFtfFxLr4pzX \
ghc-prof-mtl-2.2.2 \
ghc-prof-network-3.1.2.8-HNDBp0HF6t0D1fzE2MDtPd \
ghc-prof-network-bsd-2.8.1.0-D1RjTzX7Byx4U4fOdbAEll \
ghc-prof-old-locale-1.0.0.7-B5o2Qz0CVVSCB1XGw7OfzR \
ghc-prof-resourcet-1.2.6-69eF6Rrz9wX13sOJF59GPv \
ghc-prof-safe-0.3.19-3Ab0OpSRliCKMhc0t4Nhds \
ghc-prof-scientific-0.3.7.0-D5F2vql7x79Dy9hx72OES1 \
ghc-prof-tagged-0.8.7-CYOhX22Df3PFW5V1S0dOJa \
ghc-prof-text-2.0.2 \
ghc-prof-time-1.12.2 \
ghc-prof-transformers-0.5.6.2 \
ghc-prof-unordered-containers-0.2.19.1-KblUXVJ0SvRCcK89PoBx7E \
ghc-prof-utf8-string-1.0.2-3yyxPCwARUwDt9ZNWn320Q \
ghc-prof-vector-0.13.0.0-AbjrQrWxuFpAjIHk3G7xsp \
ghc-prof-xml-conduit-1.9.1.2-EG4w0oWu477B6XYo8w0Zz4"

inherit rpm
