SUMMARY = "Haskell http-api-data library development files"
DESCRIPTION = "This package provides the Haskell http-api-data library development files."
LICENSE = "BSD-2-Clause"

PV = "0.5"

RPM_NAME = "ghc-http-api-data-devel-0.5-4.4.aarch64.rpm"
RPM_HASH = "5cc31062a12e286a7866d412491a16f7a2967fac7920bc66d66efaca5e42950245792b8b2a414f8907fa911f9dbe9b7021edeb49c2ac9e15a7bd1a2ae81e04c1"

RPROVIDES:${PN} += "ghc-devel-http-api-data-0.5-9CvKaE1JZO8KjKgwdog9dy \
ghc-http-api-data-devel"

RDEPENDS:${PN} += "/usr/bin/sh \
ghc-compiler \
ghc-devel-attoparsec-0.14.4-54ZoOcYS6qmLoV5VBUocW3 \
ghc-devel-attoparsec-iso8601-1.1.0.0-1OFsQ5gAnygIPmkbstF7Ta \
ghc-devel-base-4.17.2.0 \
ghc-devel-base-compat-0.13.0-ASw4phAd2I0LrTJ4o8lXb1 \
ghc-devel-bytestring-0.11.5.1 \
ghc-devel-containers-0.6.7 \
ghc-devel-cookie-0.4.6-7v2XoXnZEAdFFWtj85fg3L \
ghc-devel-hashable-1.4.3.0-IAiFPPoB7KF1SaZ2CDcpeP \
ghc-devel-http-types-0.12.3-FlcnRjG0fwC5p06cSFRT1p \
ghc-devel-tagged-0.8.8-F8tUU1VLXnpEnuQm0aKvax \
ghc-devel-text-2.0.2 \
ghc-devel-time-compat-1.9.6.1-J6qzCGPCWqPGQqFFbCQAYM \
ghc-devel-transformers-0.5.6.2 \
ghc-devel-unordered-containers-0.2.19.1-BD6cH0OVlFU7YsFVVfZeZn \
ghc-devel-uuid-types-1.0.5-34Qd5N8tYIyGW5LtrFWnkV \
ghc-http-api-data"

inherit rpm
