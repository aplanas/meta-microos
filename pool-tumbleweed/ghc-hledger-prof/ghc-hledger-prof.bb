SUMMARY = "Haskell hledger profiling library"
DESCRIPTION = "This package provides the Haskell hledger profiling library."
LICENSE = "GPL-3.0-or-later"

PV = "1.28"

RPM_NAME = "ghc-hledger-prof-1.28-3.9.aarch64.rpm"
RPM_HASH = "17a35bebaa3fe13c2172670098d704ae9488bed33d1405c64e388763c38493e5fd626c665e221c01618750d4a88b96910597a21db5903da89f2ce24c42df0db2"

RPROVIDES:${PN} += "ghc-hledger-prof \
ghc-prof-hledger-1.28-BB0TqpU146rHgefpsST3hh"

RDEPENDS:${PN} += "ghc-hledger-devel \
ghc-prof-Decimal-0.5.2-7hu5LwisxJT2rqtwM7eQhT \
ghc-prof-Diff-0.4.1-LhFtxwvuVVqGkTz0Ph6iJg \
ghc-prof-aeson-2.1.2.1-F1kFu5nx3L2A2kaYbyielc \
ghc-prof-ansi-terminal-0.11.5-69CZC4XdNryJo9zHbgfvJ3 \
ghc-prof-base-4.17.2.0 \
ghc-prof-bytestring-0.11.5.1 \
ghc-prof-cmdargs-0.10.22-J6270EPuJIGHu8u4tLBuYx \
ghc-prof-containers-0.6.7 \
ghc-prof-data-default-0.7.1.1-4TeAZDN81Uu1IorgFaPMOc \
ghc-prof-directory-1.3.7.1 \
ghc-prof-extra-1.7.14-DfcUn0kURmM7zhMG6RTp91 \
ghc-prof-filepath-1.4.2.2 \
ghc-prof-githash-0.1.7.0-AdGnnqehkm8HwhDMWfn4qF \
ghc-prof-hashable-1.4.3.0-IAiFPPoB7KF1SaZ2CDcpeP \
ghc-prof-haskeline-0.8.2 \
ghc-prof-hledger-lib-1.28-Bb3X1scVuGZKsjeiDSJIAh \
ghc-prof-lucid-2.11.20230408-4cKgK8hqgER6myHRF5jLTD \
ghc-prof-math-functions-0.3.4.2-Ke5dPSL1fMD1KAZhy38VGR \
ghc-prof-megaparsec-9.3.1-Jdwz39dpTDz8anub3eLd49 \
ghc-prof-microlens-0.4.13.1-4XtL5z7DHHC7UZaR6xNDY3 \
ghc-prof-mtl-2.2.2 \
ghc-prof-process-1.6.17.0 \
ghc-prof-regex-tdfa-1.3.2.2-EFtJwrhEkMb99DdZ6mBzLM \
ghc-prof-safe-0.3.19-9uHvZjuyLiR13wOGSONZxX \
ghc-prof-shakespeare-2.0.30-5XHeuGt8JLJENvL2Ahdhem \
ghc-prof-split-0.2.3.5-J6pekuQs6yKFxqDJQyglHu \
ghc-prof-tabular-0.2.2.8-6UpIsHxi6ag26Q8LzRReTM \
ghc-prof-tasty-1.4.3-EvDBAB3nA5D6U1ANfXkHR \
ghc-prof-temporary-1.3-Ezu2TwUgvSS2TpaVIHxXuR \
ghc-prof-terminfo-0.4.1.5 \
ghc-prof-text-2.0.2 \
ghc-prof-time-1.12.2 \
ghc-prof-timeit-2.0-4alyyqlO7m4DFFkjYuUzq9 \
ghc-prof-transformers-0.5.6.2 \
ghc-prof-unordered-containers-0.2.19.1-BD6cH0OVlFU7YsFVVfZeZn \
ghc-prof-utf8-string-1.0.2-26mnfHz4IgtDU2rLQciXDs \
ghc-prof-utility-ht-0.0.17-7cPYZhnhJbDGSMxoZBrT62 \
ghc-prof-wizards-1.0.3-4dF6xVc0i30CRerGIMRP2J"

inherit rpm
