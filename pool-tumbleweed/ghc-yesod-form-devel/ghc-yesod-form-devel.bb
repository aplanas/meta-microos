SUMMARY = "Haskell yesod-form library development files"
DESCRIPTION = "This package provides the Haskell yesod-form library development files."
LICENSE = "MIT"

PV = "1.7.4"

RPM_NAME = "ghc-yesod-form-devel-1.7.4-1.11.aarch64.rpm"
RPM_HASH = "7d962dd72d1ccaea4b00fcd80b0c3215497a68e81a962a23db50801a267ac69f0ed03c0d82748512772e872df6662756c0a17abc583b27d14b3e76b669ea9d65"

RPROVIDES:${PN} += "ghc-devel-yesod-form-1.7.4-A4NJLliFfnZ1tqLIO9QkD9 \
ghc-yesod-form-devel"

RDEPENDS:${PN} += "/usr/bin/sh \
ghc-compiler \
ghc-devel-aeson-2.1.2.1-HkN6OtqTngQ9De3CKBnfov \
ghc-devel-attoparsec-0.14.4-21v4nlnPs0qLZ5R1FIK9u3 \
ghc-devel-base-4.17.1.0 \
ghc-devel-blaze-builder-0.4.2.2-1GcRIc7N7YHId5Q5gRvlvW \
ghc-devel-blaze-html-0.9.1.2-38lyFDueaN76YOL6QIMVAR \
ghc-devel-blaze-markup-0.8.2.8-1rqnOPcdOmIw0iYwB3Kqc \
ghc-devel-byteable-0.1.1-KSaZugJOm4ALb4WyX9cufg \
ghc-devel-bytestring-0.11.4.0 \
ghc-devel-containers-0.6.7 \
ghc-devel-data-default-0.7.1.1-5iNQUD7GKkTDiLEyJaqXSy \
ghc-devel-email-validate-2.3.2.18-8MZFHS3GPuQLNTYP4EPLHD \
ghc-devel-network-uri-2.6.4.2-4kNQnaE9heqEL1mH8FE5xH \
ghc-devel-persistent-2.14.5.1-8aZiHAHWity6p3rqRx3MdJ \
ghc-devel-resourcet-1.2.6-69eF6Rrz9wX13sOJF59GPv \
ghc-devel-shakespeare-2.0.30-LXYSf7m1ZbEJtMw9DSE6kj \
ghc-devel-text-2.0.2 \
ghc-devel-time-1.12.2 \
ghc-devel-transformers-0.5.6.2 \
ghc-devel-wai-3.2.3-B6oJGZed88IFIvDpwN5I7x \
ghc-devel-xss-sanitize-0.3.7.2-FCgYumvpQn8Hd22tbbEcXW \
ghc-devel-yesod-core-1.6.24.3-FuwsWoOUEyTCufqnix4g5P \
ghc-devel-yesod-persistent-1.6.0.8-A587fdCgueU2UmsZUmFzaX \
ghc-yesod-form"

inherit rpm
