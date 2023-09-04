SUMMARY = "Haskell wai-extra library development files"
DESCRIPTION = "This package provides the Haskell wai-extra library development files."
LICENSE = "MIT"

PV = "3.1.13.0"

RPM_NAME = "ghc-wai-extra-devel-3.1.13.0-2.13.aarch64.rpm"
RPM_HASH = "9dd0f67c763f1468e46b72a77eff33e52ec0c39d61f21886ef490dbdd0274f8581208300c7ad759ad9dfc376b726e586c8881bb66d4668d5c64dbe3cb0fea04d"

RPROVIDES:${PN} += "ghc-devel-wai-extra-3.1.13.0-7b9ndOLV0UtHl4QVen1kNF \
ghc-wai-extra-devel"

RDEPENDS:${PN} += "/usr/bin/sh \
ghc-compiler \
ghc-devel-HUnit-1.6.2.0-3fsauNNRJvI5u5lqiyApf4 \
ghc-devel-aeson-2.1.2.1-F1kFu5nx3L2A2kaYbyielc \
ghc-devel-ansi-terminal-0.11.5-69CZC4XdNryJo9zHbgfvJ3 \
ghc-devel-base-4.17.2.0 \
ghc-devel-base64-bytestring-1.2.1.0-JQ4JRrw3cTgQfbCEB1eM \
ghc-devel-bytestring-0.11.5.1 \
ghc-devel-call-stack-0.4.0-nQZfFxinEdIa1BWxMyadt \
ghc-devel-case-insensitive-1.2.1.0-1a748JZqftHHwwFVz8QP9 \
ghc-devel-containers-0.6.7 \
ghc-devel-cookie-0.4.6-7v2XoXnZEAdFFWtj85fg3L \
ghc-devel-data-default-class-0.1.2.0-HWomeRk5e2p3WGQsDTnuAN \
ghc-devel-directory-1.3.7.1 \
ghc-devel-fast-logger-3.1.2-2QS5oj3W57wGcX3QgTrERi \
ghc-devel-http-types-0.12.3-FlcnRjG0fwC5p06cSFRT1p \
ghc-devel-iproute-1.7.12-A34D1N9dJmL5ps3agDCHa7 \
ghc-devel-network-3.1.4.0-5p1NVWLTlrvDdAAI1mskSs \
ghc-devel-resourcet-1.2.6-AOipJdCu0ULL3KFWw8x9fP \
ghc-devel-streaming-commons-0.2.2.6-B2lYThdR4DPIZXSlcc8I7z \
ghc-devel-text-2.0.2 \
ghc-devel-time-1.12.2 \
ghc-devel-transformers-0.5.6.2 \
ghc-devel-unix-2.7.3 \
ghc-devel-vault-0.3.1.5-JTstBlaocLP2eokwHW0Uig \
ghc-devel-wai-3.2.3-JhFX1996sswH7nU4MZQSow \
ghc-devel-wai-logger-2.4.0-9HbB2lkmWIvBhHGAMxm4Zs \
ghc-devel-warp-3.3.25-9kawobphGNJ1pZTKG2KRtq \
ghc-devel-word8-0.1.3-DFPYFbOkkGxAoNpsP1UPBD \
ghc-wai-extra"

inherit rpm
