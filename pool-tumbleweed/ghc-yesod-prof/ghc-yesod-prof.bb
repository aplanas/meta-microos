SUMMARY = "Haskell yesod profiling library"
DESCRIPTION = "This package provides the Haskell yesod profiling library."
LICENSE = "MIT"

PV = "1.6.2.1"

RPM_NAME = "ghc-yesod-prof-1.6.2.1-2.18.aarch64.rpm"
RPM_HASH = "9a3df8bd0a82ee0982e490a14c7f99f53c060d5532a289e93ad9662a421bdd33484a0dfef5ed185568a6ca3a15bbcd78a8744a32cf83d84475e87f325efd7126"

RPROVIDES:${PN} += "ghc-prof-yesod-1.6.2.1-2TLIgIpkWJFUBPBh8tUBn \
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
ghc-prof-shakespeare-2.0.30-5XHeuGt8JLJENvL2Ahdhem \
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
ghc-prof-yesod-core-1.6.24.4-1di0EYNbRAz9TOkBiAT5Ab \
ghc-prof-yesod-form-1.7.4-9E5QlEFVjzzJ8x8HqN3QEY \
ghc-prof-yesod-persistent-1.6.0.8-2wkXYfzUlDeVV1OSzyB0l \
ghc-yesod-devel"

inherit rpm
