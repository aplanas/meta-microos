SUMMARY = "Haskell yesod-static library development files"
DESCRIPTION = "This package provides the Haskell yesod-static library development files."
LICENSE = "MIT"

PV = "1.6.1.0"

RPM_NAME = "ghc-yesod-static-devel-1.6.1.0-4.10.aarch64.rpm"
RPM_HASH = "3bab561c21b52cf5f397ed82627fbd2442bc737658fbd1ee9a9ecdff628bf7a488b801cb66f23262c27796ce3fda42f9f0005dfadbe41395e6ccab40f942d576"

RPROVIDES:${PN} += "ghc-devel-yesod-static-1.6.1.0-KMUnFH476ObEVlTwTWx9Ty \
ghc-yesod-static-devel"

RDEPENDS:${PN} += "/usr/bin/sh \
ghc-compiler \
ghc-devel-async-2.2.4-Is3H7ZPNMkM5reIoCaqYrF \
ghc-devel-attoparsec-0.14.4-21v4nlnPs0qLZ5R1FIK9u3 \
ghc-devel-base-4.17.1.0 \
ghc-devel-base64-bytestring-1.2.1.0-8KbzJpmSQbYKTeew1rv0hh \
ghc-devel-blaze-builder-0.4.2.2-1GcRIc7N7YHId5Q5gRvlvW \
ghc-devel-bytestring-0.11.4.0 \
ghc-devel-conduit-1.3.5-EjJ71P6EbmSGTrvJLquwgr \
ghc-devel-containers-0.6.7 \
ghc-devel-cryptonite-0.30-cxpuRFsDaEEZnBeTxvUaJ \
ghc-devel-cryptonite-conduit-0.2.2-KLKIUqp436hDQelLp9gzMp \
ghc-devel-css-text-0.1.3.0-21S5OjTqOp19taDQmfqmQs \
ghc-devel-data-default-0.7.1.1-5iNQUD7GKkTDiLEyJaqXSy \
ghc-devel-directory-1.3.7.1 \
ghc-devel-file-embed-0.0.15.0-LJLaBgMyS4K2tBVYbzJ0uw \
ghc-devel-filepath-1.4.2.2 \
ghc-devel-hashable-1.4.2.0-FFBRhuY0w4YLmuLEs5uQAt \
ghc-devel-hjsmin-0.2.1-E05vLEwNeV76Uzm2zhD4uI \
ghc-devel-http-types-0.12.3-4BrMFwRucoT4fBt8cCVFS6 \
ghc-devel-memory-0.18.0-8CsggfkyXReDSMbRoae4Yp \
ghc-devel-mime-types-0.1.1.0-IrWGRRDe33Y1D55h7nh7fm \
ghc-devel-process-1.6.16.0 \
ghc-devel-template-haskell-2.19.0.0 \
ghc-devel-text-2.0.2 \
ghc-devel-transformers-0.5.6.2 \
ghc-devel-unix-compat-0.6-79KxxZMmklx25hsmeEnenN \
ghc-devel-unordered-containers-0.2.19.1-KblUXVJ0SvRCcK89PoBx7E \
ghc-devel-wai-3.2.3-B6oJGZed88IFIvDpwN5I7x \
ghc-devel-wai-app-static-3.1.7.4-AZD11N92jseJEftpoR1SbX \
ghc-devel-yesod-core-1.6.24.3-FuwsWoOUEyTCufqnix4g5P \
ghc-yesod-static"

inherit rpm
