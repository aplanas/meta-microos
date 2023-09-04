SUMMARY = "Haskell yesod-static profiling library"
DESCRIPTION = "This package provides the Haskell yesod-static profiling library."
LICENSE = "MIT"

PV = "1.6.1.0"

RPM_NAME = "ghc-yesod-static-prof-1.6.1.0-4.16.aarch64.rpm"
RPM_HASH = "9c27634c17f3489d8f8b9bbb2c12b6080ab0f7af69a18def3d14f957aa77644eb080eeddff91e234582ee2c658b03e63c2b4a3418582009f7b81c42333a6abf7"

RPROVIDES:${PN} += "ghc-prof-yesod-static-1.6.1.0-8HSSkZYeRvLJRhVmJ2W7Tf \
ghc-yesod-static-prof"

RDEPENDS:${PN} += "ghc-prof-async-2.2.4-LcXCzTmy8C6G7Wa774EctI \
ghc-prof-attoparsec-0.14.4-54ZoOcYS6qmLoV5VBUocW3 \
ghc-prof-base-4.17.2.0 \
ghc-prof-base64-bytestring-1.2.1.0-JQ4JRrw3cTgQfbCEB1eM \
ghc-prof-blaze-builder-0.4.2.2-8UxXzIHQH0dLJoWXyTpU1h \
ghc-prof-bytestring-0.11.5.1 \
ghc-prof-conduit-1.3.5-3TRUhNB8WbY2vxuXe2VjBX \
ghc-prof-containers-0.6.7 \
ghc-prof-cryptonite-0.30-LSC76M64GQaFgLGwFfgIgW \
ghc-prof-cryptonite-conduit-0.2.2-4rYVqGhYqU58GDqiFoVTUX \
ghc-prof-css-text-0.1.3.0-8klVmv0TGJS6WEADR2StQO \
ghc-prof-data-default-0.7.1.1-4TeAZDN81Uu1IorgFaPMOc \
ghc-prof-directory-1.3.7.1 \
ghc-prof-file-embed-0.0.15.0-DAhwsrlSNND3ZIPejkHOUv \
ghc-prof-filepath-1.4.2.2 \
ghc-prof-hashable-1.4.3.0-IAiFPPoB7KF1SaZ2CDcpeP \
ghc-prof-hjsmin-0.2.1-1Nqa77EAma94x2VWIbRoKX \
ghc-prof-http-types-0.12.3-FlcnRjG0fwC5p06cSFRT1p \
ghc-prof-memory-0.18.0-6jbQrbksm9m3FIftlSlmf1 \
ghc-prof-mime-types-0.1.1.0-oV8uh4Pssd1mRIrSbk6Ab \
ghc-prof-process-1.6.17.0 \
ghc-prof-template-haskell-2.19.0.0 \
ghc-prof-text-2.0.2 \
ghc-prof-transformers-0.5.6.2 \
ghc-prof-unix-compat-0.6-IJaiJvo5DQ6Elf7LVlEGei \
ghc-prof-unordered-containers-0.2.19.1-BD6cH0OVlFU7YsFVVfZeZn \
ghc-prof-wai-3.2.3-JhFX1996sswH7nU4MZQSow \
ghc-prof-wai-app-static-3.1.7.4-4gPGtaPPrElL5voDUXdKV2 \
ghc-prof-yesod-core-1.6.24.4-cvcp8TZ1QYG0IH58f6f1F \
ghc-yesod-static-devel"

inherit rpm
