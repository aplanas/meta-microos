SUMMARY = "Haskell aws library development files"
DESCRIPTION = "This package provides the Haskell aws library development files."
LICENSE = "BSD-3-Clause"

PV = "0.23"

RPM_NAME = "ghc-aws-devel-0.23-1.4.aarch64.rpm"
RPM_HASH = "d77629e1d5db7122d97712e11740e708bd5f3a66563f54c4b03c3f3a951f30538a95983c257a3bd93d8eb824590ca8794da1da61ad3ef1ed250eb649526ed8aa"

RPROVIDES:${PN} += "ghc-aws-devel \
ghc-aws-devel(aarch-64) \
ghc-devel(aws-0.23-3doj4K3gEsgA7HfIcBeC8x)"

RDEPENDS:${PN} += "/bin/sh \
ghc-aws \
ghc-compiler \
ghc-devel(aeson-2.1.2.1-D6AdQzPi657L86q5kYUhvP) \
ghc-devel(attoparsec-0.14.4-21v4nlnPs0qLZ5R1FIK9u3) \
ghc-devel(base-4.17.1.0) \
ghc-devel(base16-bytestring-1.0.2.0-BWBHxp15W1kvZUUcQHZQU) \
ghc-devel(base64-bytestring-1.2.1.0-8KbzJpmSQbYKTeew1rv0hh) \
ghc-devel(blaze-builder-0.4.2.2-1GcRIc7N7YHId5Q5gRvlvW) \
ghc-devel(byteable-0.1.1-KSaZugJOm4ALb4WyX9cufg) \
ghc-devel(bytestring-0.11.4.0) \
ghc-devel(case-insensitive-1.2.1.0-AumZoR4Lds63HJj8OQwHY3) \
ghc-devel(cereal-0.5.8.3-LNsxCTyOF85AKtb4iLTs8f) \
ghc-devel(conduit-1.3.4.3-dAZVHPSYjL2zQ4RzAuWi2) \
ghc-devel(conduit-extra-1.3.6-F6u9UYzIZvy2L2764Izuhr) \
ghc-devel(containers-0.6.7) \
ghc-devel(cryptonite-0.30-AbDFzA14dNKDfU9pLpBLye) \
ghc-devel(data-default-0.7.1.1-5iNQUD7GKkTDiLEyJaqXSy) \
ghc-devel(directory-1.3.7.1) \
ghc-devel(exceptions-0.10.5) \
ghc-devel(filepath-1.4.2.2) \
ghc-devel(http-client-tls-0.3.6.1-1pQpHwWyWRWKJTeRlrZZA0) \
ghc-devel(http-conduit-2.3.8-9gcbWW2UjPVHQDceZSAOIR) \
ghc-devel(http-types-0.12.3-4BrMFwRucoT4fBt8cCVFS6) \
ghc-devel(lifted-base-0.2.3.12-2PslaVNAATq3HzvkpdIGSo) \
ghc-devel(memory-0.18.0-2DG6nqjfLMK4MSR77XYQqL) \
ghc-devel(monad-control-1.0.3.1-YXA6op7GEFFtfFxLr4pzX) \
ghc-devel(mtl-2.2.2) \
ghc-devel(network-3.1.2.8-HNDBp0HF6t0D1fzE2MDtPd) \
ghc-devel(network-bsd-2.8.1.0-D1RjTzX7Byx4U4fOdbAEll) \
ghc-devel(old-locale-1.0.0.7-B5o2Qz0CVVSCB1XGw7OfzR) \
ghc-devel(resourcet-1.2.6-69eF6Rrz9wX13sOJF59GPv) \
ghc-devel(safe-0.3.19-3Ab0OpSRliCKMhc0t4Nhds) \
ghc-devel(scientific-0.3.7.0-D5F2vql7x79Dy9hx72OES1) \
ghc-devel(tagged-0.8.7-CYOhX22Df3PFW5V1S0dOJa) \
ghc-devel(text-2.0.2) \
ghc-devel(time-1.12.2) \
ghc-devel(transformers-0.5.6.2) \
ghc-devel(unordered-containers-0.2.19.1-KblUXVJ0SvRCcK89PoBx7E) \
ghc-devel(utf8-string-1.0.2-3yyxPCwARUwDt9ZNWn320Q) \
ghc-devel(vector-0.13.0.0-AbjrQrWxuFpAjIHk3G7xsp) \
ghc-devel(xml-conduit-1.9.1.2-EG4w0oWu477B6XYo8w0Zz4)"

inherit rpm
