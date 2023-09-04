SUMMARY = "Haskell wai-extra profiling library"
DESCRIPTION = "This package provides the Haskell wai-extra profiling library."
LICENSE = "MIT"

PV = "3.1.13.0"

RPM_NAME = "ghc-wai-extra-prof-3.1.13.0-2.13.aarch64.rpm"
RPM_HASH = "42f5e95fc5ed1ea301e99b9400cae11c77a4e3e6c5dd25f8f09c7a88454f888c7e6aeaf866c509ba7f3320af268930b19e2a2392c3806e6e697e26aee1d68f77"

RPROVIDES:${PN} += "ghc-prof-wai-extra-3.1.13.0-7b9ndOLV0UtHl4QVen1kNF \
ghc-wai-extra-prof"

RDEPENDS:${PN} += "ghc-prof-HUnit-1.6.2.0-3fsauNNRJvI5u5lqiyApf4 \
ghc-prof-aeson-2.1.2.1-F1kFu5nx3L2A2kaYbyielc \
ghc-prof-ansi-terminal-0.11.5-69CZC4XdNryJo9zHbgfvJ3 \
ghc-prof-base-4.17.2.0 \
ghc-prof-base64-bytestring-1.2.1.0-JQ4JRrw3cTgQfbCEB1eM \
ghc-prof-bytestring-0.11.5.1 \
ghc-prof-call-stack-0.4.0-nQZfFxinEdIa1BWxMyadt \
ghc-prof-case-insensitive-1.2.1.0-1a748JZqftHHwwFVz8QP9 \
ghc-prof-containers-0.6.7 \
ghc-prof-cookie-0.4.6-7v2XoXnZEAdFFWtj85fg3L \
ghc-prof-data-default-class-0.1.2.0-HWomeRk5e2p3WGQsDTnuAN \
ghc-prof-directory-1.3.7.1 \
ghc-prof-fast-logger-3.1.2-2QS5oj3W57wGcX3QgTrERi \
ghc-prof-http-types-0.12.3-FlcnRjG0fwC5p06cSFRT1p \
ghc-prof-iproute-1.7.12-A34D1N9dJmL5ps3agDCHa7 \
ghc-prof-network-3.1.4.0-5p1NVWLTlrvDdAAI1mskSs \
ghc-prof-resourcet-1.2.6-AOipJdCu0ULL3KFWw8x9fP \
ghc-prof-streaming-commons-0.2.2.6-B2lYThdR4DPIZXSlcc8I7z \
ghc-prof-text-2.0.2 \
ghc-prof-time-1.12.2 \
ghc-prof-transformers-0.5.6.2 \
ghc-prof-unix-2.7.3 \
ghc-prof-vault-0.3.1.5-JTstBlaocLP2eokwHW0Uig \
ghc-prof-wai-3.2.3-JhFX1996sswH7nU4MZQSow \
ghc-prof-wai-logger-2.4.0-9HbB2lkmWIvBhHGAMxm4Zs \
ghc-prof-warp-3.3.25-9kawobphGNJ1pZTKG2KRtq \
ghc-prof-word8-0.1.3-DFPYFbOkkGxAoNpsP1UPBD \
ghc-wai-extra-devel"

inherit rpm
