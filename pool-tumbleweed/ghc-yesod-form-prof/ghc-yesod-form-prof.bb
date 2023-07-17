SUMMARY = "Haskell yesod-form profiling library"
DESCRIPTION = "This package provides the Haskell yesod-form profiling library."
LICENSE = "MIT"

PV = "1.7.4"

RPM_NAME = "ghc-yesod-form-prof-1.7.4-1.9.aarch64.rpm"
RPM_HASH = "e5bfe03e87893529104b0e7cea8ef02ba83476a32823be09da4b38c50dce924a2ef4ef02a3bc17aca7589b266073d6d1ea8ae57cd5837232bf0cbb5a31485e48"

RPROVIDES:${PN} += "ghc-prof-yesod-form-1.7.4-9SavUh7G36AKe86TvxSRtJ \
ghc-yesod-form-prof"

RDEPENDS:${PN} += "ghc-prof-aeson-2.1.2.1-HkN6OtqTngQ9De3CKBnfov \
ghc-prof-attoparsec-0.14.4-21v4nlnPs0qLZ5R1FIK9u3 \
ghc-prof-base-4.17.1.0 \
ghc-prof-blaze-builder-0.4.2.2-1GcRIc7N7YHId5Q5gRvlvW \
ghc-prof-blaze-html-0.9.1.2-38lyFDueaN76YOL6QIMVAR \
ghc-prof-blaze-markup-0.8.2.8-1rqnOPcdOmIw0iYwB3Kqc \
ghc-prof-byteable-0.1.1-KSaZugJOm4ALb4WyX9cufg \
ghc-prof-bytestring-0.11.4.0 \
ghc-prof-containers-0.6.7 \
ghc-prof-data-default-0.7.1.1-5iNQUD7GKkTDiLEyJaqXSy \
ghc-prof-email-validate-2.3.2.18-8MZFHS3GPuQLNTYP4EPLHD \
ghc-prof-network-uri-2.6.4.2-4kNQnaE9heqEL1mH8FE5xH \
ghc-prof-persistent-2.14.5.1-8aZiHAHWity6p3rqRx3MdJ \
ghc-prof-resourcet-1.2.6-69eF6Rrz9wX13sOJF59GPv \
ghc-prof-shakespeare-2.0.30-LXYSf7m1ZbEJtMw9DSE6kj \
ghc-prof-text-2.0.2 \
ghc-prof-time-1.12.2 \
ghc-prof-transformers-0.5.6.2 \
ghc-prof-wai-3.2.3-B6oJGZed88IFIvDpwN5I7x \
ghc-prof-xss-sanitize-0.3.7.2-FCgYumvpQn8Hd22tbbEcXW \
ghc-prof-yesod-core-1.6.24.2-7isfGP7hc9NLFaHQAgg8t \
ghc-prof-yesod-persistent-1.6.0.8-Jui070TDUWhEJxvpNjmjRf \
ghc-yesod-form-devel"

inherit rpm
