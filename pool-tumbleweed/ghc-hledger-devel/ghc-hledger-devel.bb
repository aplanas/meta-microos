SUMMARY = "Haskell hledger library development files"
DESCRIPTION = "This package provides the Haskell hledger library development files."
LICENSE = "GPL-3.0-or-later"

PV = "1.28"

RPM_NAME = "ghc-hledger-devel-1.28-3.9.aarch64.rpm"
RPM_HASH = "2c87a548c098ee6f548f07a09b04fba192b25372a18516ad82d598de6965d5bdc7f0cbf1a88c747498f77d56439be7a658f100ad6653e43d068b4904b34d9c57"

RPROVIDES:${PN} += "ghc-devel-hledger-1.28-BB0TqpU146rHgefpsST3hh \
ghc-hledger-devel"

RDEPENDS:${PN} += "/usr/bin/sh \
ghc-compiler \
ghc-devel-Decimal-0.5.2-7hu5LwisxJT2rqtwM7eQhT \
ghc-devel-Diff-0.4.1-LhFtxwvuVVqGkTz0Ph6iJg \
ghc-devel-aeson-2.1.2.1-F1kFu5nx3L2A2kaYbyielc \
ghc-devel-ansi-terminal-0.11.5-69CZC4XdNryJo9zHbgfvJ3 \
ghc-devel-base-4.17.2.0 \
ghc-devel-bytestring-0.11.5.1 \
ghc-devel-cmdargs-0.10.22-J6270EPuJIGHu8u4tLBuYx \
ghc-devel-containers-0.6.7 \
ghc-devel-data-default-0.7.1.1-4TeAZDN81Uu1IorgFaPMOc \
ghc-devel-directory-1.3.7.1 \
ghc-devel-extra-1.7.14-DfcUn0kURmM7zhMG6RTp91 \
ghc-devel-filepath-1.4.2.2 \
ghc-devel-githash-0.1.7.0-AdGnnqehkm8HwhDMWfn4qF \
ghc-devel-hashable-1.4.3.0-IAiFPPoB7KF1SaZ2CDcpeP \
ghc-devel-haskeline-0.8.2 \
ghc-devel-hledger-lib-1.28-Bb3X1scVuGZKsjeiDSJIAh \
ghc-devel-lucid-2.11.20230408-4cKgK8hqgER6myHRF5jLTD \
ghc-devel-math-functions-0.3.4.2-Ke5dPSL1fMD1KAZhy38VGR \
ghc-devel-megaparsec-9.3.1-Jdwz39dpTDz8anub3eLd49 \
ghc-devel-microlens-0.4.13.1-4XtL5z7DHHC7UZaR6xNDY3 \
ghc-devel-mtl-2.2.2 \
ghc-devel-process-1.6.17.0 \
ghc-devel-regex-tdfa-1.3.2.2-EFtJwrhEkMb99DdZ6mBzLM \
ghc-devel-safe-0.3.19-9uHvZjuyLiR13wOGSONZxX \
ghc-devel-shakespeare-2.0.30-5XHeuGt8JLJENvL2Ahdhem \
ghc-devel-split-0.2.3.5-J6pekuQs6yKFxqDJQyglHu \
ghc-devel-tabular-0.2.2.8-6UpIsHxi6ag26Q8LzRReTM \
ghc-devel-tasty-1.4.3-EvDBAB3nA5D6U1ANfXkHR \
ghc-devel-temporary-1.3-Ezu2TwUgvSS2TpaVIHxXuR \
ghc-devel-terminfo-0.4.1.5 \
ghc-devel-text-2.0.2 \
ghc-devel-time-1.12.2 \
ghc-devel-timeit-2.0-4alyyqlO7m4DFFkjYuUzq9 \
ghc-devel-transformers-0.5.6.2 \
ghc-devel-unordered-containers-0.2.19.1-BD6cH0OVlFU7YsFVVfZeZn \
ghc-devel-utf8-string-1.0.2-26mnfHz4IgtDU2rLQciXDs \
ghc-devel-utility-ht-0.0.17-7cPYZhnhJbDGSMxoZBrT62 \
ghc-devel-wizards-1.0.3-4dF6xVc0i30CRerGIMRP2J \
ghc-hledger"

inherit rpm
