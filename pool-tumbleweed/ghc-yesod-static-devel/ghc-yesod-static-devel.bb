SUMMARY = "Haskell yesod-static library development files"
DESCRIPTION = "This package provides the Haskell yesod-static library development files."
LICENSE = "MIT"

PV = "1.6.1.0"

RPM_NAME = "ghc-yesod-static-devel-1.6.1.0-4.16.aarch64.rpm"
RPM_HASH = "7e43016264897d4faa72d90de86bf1726b8be02b880104ae20b7405602492abcb194caa6736f8aa25f4e1c0f6512f4279cfee3a00cc0ec44dc50ce812c40eae4"

RPROVIDES:${PN} += "ghc-devel-yesod-static-1.6.1.0-8HSSkZYeRvLJRhVmJ2W7Tf \
ghc-yesod-static-devel"

RDEPENDS:${PN} += "/usr/bin/sh \
ghc-compiler \
ghc-devel-async-2.2.4-LcXCzTmy8C6G7Wa774EctI \
ghc-devel-attoparsec-0.14.4-54ZoOcYS6qmLoV5VBUocW3 \
ghc-devel-base-4.17.2.0 \
ghc-devel-base64-bytestring-1.2.1.0-JQ4JRrw3cTgQfbCEB1eM \
ghc-devel-blaze-builder-0.4.2.2-8UxXzIHQH0dLJoWXyTpU1h \
ghc-devel-bytestring-0.11.5.1 \
ghc-devel-conduit-1.3.5-3TRUhNB8WbY2vxuXe2VjBX \
ghc-devel-containers-0.6.7 \
ghc-devel-cryptonite-0.30-LSC76M64GQaFgLGwFfgIgW \
ghc-devel-cryptonite-conduit-0.2.2-4rYVqGhYqU58GDqiFoVTUX \
ghc-devel-css-text-0.1.3.0-8klVmv0TGJS6WEADR2StQO \
ghc-devel-data-default-0.7.1.1-4TeAZDN81Uu1IorgFaPMOc \
ghc-devel-directory-1.3.7.1 \
ghc-devel-file-embed-0.0.15.0-DAhwsrlSNND3ZIPejkHOUv \
ghc-devel-filepath-1.4.2.2 \
ghc-devel-hashable-1.4.3.0-IAiFPPoB7KF1SaZ2CDcpeP \
ghc-devel-hjsmin-0.2.1-1Nqa77EAma94x2VWIbRoKX \
ghc-devel-http-types-0.12.3-FlcnRjG0fwC5p06cSFRT1p \
ghc-devel-memory-0.18.0-6jbQrbksm9m3FIftlSlmf1 \
ghc-devel-mime-types-0.1.1.0-oV8uh4Pssd1mRIrSbk6Ab \
ghc-devel-process-1.6.17.0 \
ghc-devel-template-haskell-2.19.0.0 \
ghc-devel-text-2.0.2 \
ghc-devel-transformers-0.5.6.2 \
ghc-devel-unix-compat-0.6-IJaiJvo5DQ6Elf7LVlEGei \
ghc-devel-unordered-containers-0.2.19.1-BD6cH0OVlFU7YsFVVfZeZn \
ghc-devel-wai-3.2.3-JhFX1996sswH7nU4MZQSow \
ghc-devel-wai-app-static-3.1.7.4-4gPGtaPPrElL5voDUXdKV2 \
ghc-devel-yesod-core-1.6.24.4-cvcp8TZ1QYG0IH58f6f1F \
ghc-yesod-static"

inherit rpm
