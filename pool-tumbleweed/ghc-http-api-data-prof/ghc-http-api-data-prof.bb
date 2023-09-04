SUMMARY = "Haskell http-api-data profiling library"
DESCRIPTION = "This package provides the Haskell http-api-data profiling library."
LICENSE = "BSD-2-Clause"

PV = "0.5"

RPM_NAME = "ghc-http-api-data-prof-0.5-4.4.aarch64.rpm"
RPM_HASH = "8a1eaa3bda0deff06adf8daf3cf5cc35ea72875d6e497384503184f0b9073f82bbb9700875e3bb08b8cdf3823c7d06fe4cd0a119af510b8b30e235f40d2625c8"

RPROVIDES:${PN} += "ghc-http-api-data-prof \
ghc-prof-http-api-data-0.5-9CvKaE1JZO8KjKgwdog9dy"

RDEPENDS:${PN} += "ghc-http-api-data-devel \
ghc-prof-attoparsec-0.14.4-54ZoOcYS6qmLoV5VBUocW3 \
ghc-prof-attoparsec-iso8601-1.1.0.0-1OFsQ5gAnygIPmkbstF7Ta \
ghc-prof-base-4.17.2.0 \
ghc-prof-base-compat-0.13.0-ASw4phAd2I0LrTJ4o8lXb1 \
ghc-prof-bytestring-0.11.5.1 \
ghc-prof-containers-0.6.7 \
ghc-prof-cookie-0.4.6-7v2XoXnZEAdFFWtj85fg3L \
ghc-prof-hashable-1.4.3.0-IAiFPPoB7KF1SaZ2CDcpeP \
ghc-prof-http-types-0.12.3-FlcnRjG0fwC5p06cSFRT1p \
ghc-prof-tagged-0.8.8-F8tUU1VLXnpEnuQm0aKvax \
ghc-prof-text-2.0.2 \
ghc-prof-time-compat-1.9.6.1-J6qzCGPCWqPGQqFFbCQAYM \
ghc-prof-transformers-0.5.6.2 \
ghc-prof-unordered-containers-0.2.19.1-BD6cH0OVlFU7YsFVVfZeZn \
ghc-prof-uuid-types-1.0.5-34Qd5N8tYIyGW5LtrFWnkV"

inherit rpm
