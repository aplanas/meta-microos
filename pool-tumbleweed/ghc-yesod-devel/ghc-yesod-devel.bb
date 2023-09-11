SUMMARY = "Haskell yesod library development files"
DESCRIPTION = "This package provides the Haskell yesod library development files."
LICENSE = "MIT"

PV = "1.6.2.1"

RPM_NAME = "ghc-yesod-devel-1.6.2.1-2.18.aarch64.rpm"
RPM_HASH = "6b44cb36032c6435c9887ef14eb9ff0b1892882d4e054348078e57141ba6ce29f5f60562ba5bd1c490d6d8d4e7311fd5c48fee508802dc853afaffc99ac4caf0"

RPROVIDES:${PN} += "ghc-devel-yesod-1.6.2.1-2TLIgIpkWJFUBPBh8tUBn \
ghc-yesod-devel"

RDEPENDS:${PN} += "/usr/bin/sh \
ghc-compiler \
ghc-devel-aeson-2.1.2.1-F1kFu5nx3L2A2kaYbyielc \
ghc-devel-base-4.17.2.0 \
ghc-devel-bytestring-0.11.5.1 \
ghc-devel-conduit-1.3.5-3TRUhNB8WbY2vxuXe2VjBX \
ghc-devel-data-default-class-0.1.2.0-HWomeRk5e2p3WGQsDTnuAN \
ghc-devel-directory-1.3.7.1 \
ghc-devel-fast-logger-3.1.2-2QS5oj3W57wGcX3QgTrERi \
ghc-devel-file-embed-0.0.15.0-DAhwsrlSNND3ZIPejkHOUv \
ghc-devel-monad-logger-0.3.40-7M7roko8a7PJ68wJBTUT6s \
ghc-devel-shakespeare-2.0.30-5XHeuGt8JLJENvL2Ahdhem \
ghc-devel-streaming-commons-0.2.2.6-B2lYThdR4DPIZXSlcc8I7z \
ghc-devel-template-haskell-2.19.0.0 \
ghc-devel-text-2.0.2 \
ghc-devel-unix-2.7.3 \
ghc-devel-unordered-containers-0.2.19.1-BD6cH0OVlFU7YsFVVfZeZn \
ghc-devel-wai-3.2.3-JhFX1996sswH7nU4MZQSow \
ghc-devel-wai-extra-3.1.13.0-7b9ndOLV0UtHl4QVen1kNF \
ghc-devel-wai-logger-2.4.0-9HbB2lkmWIvBhHGAMxm4Zs \
ghc-devel-warp-3.3.25-9kawobphGNJ1pZTKG2KRtq \
ghc-devel-yaml-0.11.11.2-A2RJT0EorR9GrZjUq6QELM \
ghc-devel-yesod-core-1.6.24.4-1di0EYNbRAz9TOkBiAT5Ab \
ghc-devel-yesod-form-1.7.4-9E5QlEFVjzzJ8x8HqN3QEY \
ghc-devel-yesod-persistent-1.6.0.8-2wkXYfzUlDeVV1OSzyB0l \
ghc-yesod"

inherit rpm
