SUMMARY = "Haskell hledger-lib library development files"
DESCRIPTION = "This package provides the Haskell hledger-lib library development files."
LICENSE = "GPL-3.0-or-later"

PV = "1.28"

RPM_NAME = "ghc-hledger-lib-devel-1.28-3.8.aarch64.rpm"
RPM_HASH = "d0c5e09d4a567ec52818bc0b45bac9cff63fd726c74e12a6871067f72279130df5c9e16d9cdd05f9d20ca51f8dbd7a390fccd41d643fbb42b53c5a8072bb32e8"

RPROVIDES:${PN} += "ghc-devel-hledger-lib-1.28-Bb3X1scVuGZKsjeiDSJIAh \
ghc-hledger-lib-devel"

RDEPENDS:${PN} += "/usr/bin/sh \
ghc-compiler \
ghc-devel-Decimal-0.5.2-7hu5LwisxJT2rqtwM7eQhT \
ghc-devel-Glob-0.10.2-96NxBWCYICFFsqKvc9eqpc \
ghc-devel-aeson-2.1.2.1-F1kFu5nx3L2A2kaYbyielc \
ghc-devel-aeson-pretty-0.8.10-BAp1RojEa5O2Gd1gxmbgJk \
ghc-devel-ansi-terminal-0.11.5-69CZC4XdNryJo9zHbgfvJ3 \
ghc-devel-array-0.5.4.0 \
ghc-devel-base-4.17.2.0 \
ghc-devel-blaze-markup-0.8.2.8-BmGeri7A4mfLP1PbPCfNFP \
ghc-devel-bytestring-0.11.5.1 \
ghc-devel-call-stack-0.4.0-nQZfFxinEdIa1BWxMyadt \
ghc-devel-cassava-0.5.3.0-3BxMB2hl3TbBsSJkTsXVLP \
ghc-devel-cassava-megaparsec-2.0.4-C7KekE0MHcyFXF3lsApNgX \
ghc-devel-cmdargs-0.10.22-J6270EPuJIGHu8u4tLBuYx \
ghc-devel-containers-0.6.7 \
ghc-devel-data-default-0.7.1.1-4TeAZDN81Uu1IorgFaPMOc \
ghc-devel-deepseq-1.4.8.0 \
ghc-devel-directory-1.3.7.1 \
ghc-devel-doclayout-0.4.0.1-4D8TPYFDHuI6AadIlSPotc \
ghc-devel-extra-1.7.14-DfcUn0kURmM7zhMG6RTp91 \
ghc-devel-file-embed-0.0.15.0-DAhwsrlSNND3ZIPejkHOUv \
ghc-devel-filepath-1.4.2.2 \
ghc-devel-hashtables-1.3.1-1KAEkULYvDmJLM8wOJL96T \
ghc-devel-megaparsec-9.3.1-Jdwz39dpTDz8anub3eLd49 \
ghc-devel-microlens-0.4.13.1-4XtL5z7DHHC7UZaR6xNDY3 \
ghc-devel-microlens-th-0.4.3.13-K3KDbjSa5xkBUVjBxtDTLF \
ghc-devel-mtl-2.2.2 \
ghc-devel-parser-combinators-1.3.0-9EAIYkVxwfT3bR6YOGtMtZ \
ghc-devel-pretty-simple-4.1.2.0-I6NsimDP7f2Fl43nYTpHWu \
ghc-devel-regex-tdfa-1.3.2.2-EFtJwrhEkMb99DdZ6mBzLM \
ghc-devel-safe-0.3.19-9uHvZjuyLiR13wOGSONZxX \
ghc-devel-tabular-0.2.2.8-6UpIsHxi6ag26Q8LzRReTM \
ghc-devel-tasty-1.4.3-EvDBAB3nA5D6U1ANfXkHR \
ghc-devel-tasty-hunit-0.10.0.3-2hefb6clI09Drjkc6dw6d8 \
ghc-devel-template-haskell-2.19.0.0 \
ghc-devel-text-2.0.2 \
ghc-devel-time-1.12.2 \
ghc-devel-timeit-2.0-4alyyqlO7m4DFFkjYuUzq9 \
ghc-devel-transformers-0.5.6.2 \
ghc-devel-uglymemo-0.1.0.1-FaxrSjBe3XhIHSfEZHhJ9C \
ghc-devel-unordered-containers-0.2.19.1-BD6cH0OVlFU7YsFVVfZeZn \
ghc-devel-utf8-string-1.0.2-26mnfHz4IgtDU2rLQciXDs \
ghc-hledger-lib"

inherit rpm
