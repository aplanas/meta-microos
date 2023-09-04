SUMMARY = "Haskell yesod profiling library"
DESCRIPTION = "This package provides the Haskell yesod profiling library."
LICENSE = "MIT"

PV = "1.6.2.1"

RPM_NAME = "ghc-yesod-prof-1.6.2.1-2.17.aarch64.rpm"
RPM_HASH = "166e4fad7e70e56c4354a995c3f054baa8fee3e13dc973eb1b153867d0911ed7fb378d924b914a0afe0827131c6442ab37d05737765feda263c751d3a606ff17"

RPROVIDES:${PN} += "ghc-prof-yesod-1.6.2.1-5difrQgvCOBGXdQI19mBQV \
ghc-yesod-prof"

RDEPENDS:${PN} += "ghc-prof-aeson-2.1.2.1-F1kFu5nx3L2A2kaYbyielc \
ghc-prof-base-4.17.2.0 \
ghc-prof-bytestring-0.11.5.1 \
ghc-prof-conduit-1.3.5-3TRUhNB8WbY2vxuXe2VjBX \
ghc-prof-data-default-class-0.1.2.0-HWomeRk5e2p3WGQsDTnuAN \
ghc-prof-directory-1.3.7.1 \
ghc-prof-fast-logger-3.1.2-2QS5oj3W57wGcX3QgTrERi \
ghc-prof-file-embed-0.0.15.0-DAhwsrlSNND3ZIPejkHOUv \
ghc-prof-monad-logger-0.3.40-7M7roko8a7PJ68wJBTUT6s \
ghc-prof-shakespeare-2.0.30-GrImIeltjQZ7T3c163uEiZ \
ghc-prof-streaming-commons-0.2.2.6-B2lYThdR4DPIZXSlcc8I7z \
ghc-prof-template-haskell-2.19.0.0 \
ghc-prof-text-2.0.2 \
ghc-prof-unix-2.7.3 \
ghc-prof-unordered-containers-0.2.19.1-BD6cH0OVlFU7YsFVVfZeZn \
ghc-prof-wai-3.2.3-JhFX1996sswH7nU4MZQSow \
ghc-prof-wai-extra-3.1.13.0-7b9ndOLV0UtHl4QVen1kNF \
ghc-prof-wai-logger-2.4.0-9HbB2lkmWIvBhHGAMxm4Zs \
ghc-prof-warp-3.3.25-9kawobphGNJ1pZTKG2KRtq \
ghc-prof-yaml-0.11.11.2-A2RJT0EorR9GrZjUq6QELM \
ghc-prof-yesod-core-1.6.24.4-cvcp8TZ1QYG0IH58f6f1F \
ghc-prof-yesod-form-1.7.4-DXz1LHmFAGTJSpYkY14WzB \
ghc-prof-yesod-persistent-1.6.0.8-93ozWuy4hEy3h1XQtLGAru \
ghc-yesod-devel"

inherit rpm
