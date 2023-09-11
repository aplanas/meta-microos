SUMMARY = "Haskell hledger-lib profiling library"
DESCRIPTION = "This package provides the Haskell hledger-lib profiling library."
LICENSE = "GPL-3.0-or-later"

PV = "1.28"

RPM_NAME = "ghc-hledger-lib-prof-1.28-3.8.aarch64.rpm"
RPM_HASH = "9a36828969d12d3c8cd9eca43e9c942917a101edc865d1f492d849ce84d84f355eb8bf19daf7c65903eee6e18770970833534cad70e25782ac960166b24d4d67"

RPROVIDES:${PN} += "ghc-hledger-lib-prof \
ghc-prof-hledger-lib-1.28-Bb3X1scVuGZKsjeiDSJIAh"

RDEPENDS:${PN} += "ghc-hledger-lib-devel \
ghc-prof-Decimal-0.5.2-7hu5LwisxJT2rqtwM7eQhT \
ghc-prof-Glob-0.10.2-96NxBWCYICFFsqKvc9eqpc \
ghc-prof-aeson-2.1.2.1-F1kFu5nx3L2A2kaYbyielc \
ghc-prof-aeson-pretty-0.8.10-BAp1RojEa5O2Gd1gxmbgJk \
ghc-prof-ansi-terminal-0.11.5-69CZC4XdNryJo9zHbgfvJ3 \
ghc-prof-array-0.5.4.0 \
ghc-prof-base-4.17.2.0 \
ghc-prof-blaze-markup-0.8.2.8-BmGeri7A4mfLP1PbPCfNFP \
ghc-prof-bytestring-0.11.5.1 \
ghc-prof-call-stack-0.4.0-nQZfFxinEdIa1BWxMyadt \
ghc-prof-cassava-0.5.3.0-3BxMB2hl3TbBsSJkTsXVLP \
ghc-prof-cassava-megaparsec-2.0.4-C7KekE0MHcyFXF3lsApNgX \
ghc-prof-cmdargs-0.10.22-J6270EPuJIGHu8u4tLBuYx \
ghc-prof-containers-0.6.7 \
ghc-prof-data-default-0.7.1.1-4TeAZDN81Uu1IorgFaPMOc \
ghc-prof-deepseq-1.4.8.0 \
ghc-prof-directory-1.3.7.1 \
ghc-prof-doclayout-0.4.0.1-4D8TPYFDHuI6AadIlSPotc \
ghc-prof-extra-1.7.14-DfcUn0kURmM7zhMG6RTp91 \
ghc-prof-file-embed-0.0.15.0-DAhwsrlSNND3ZIPejkHOUv \
ghc-prof-filepath-1.4.2.2 \
ghc-prof-hashtables-1.3.1-1KAEkULYvDmJLM8wOJL96T \
ghc-prof-megaparsec-9.3.1-Jdwz39dpTDz8anub3eLd49 \
ghc-prof-microlens-0.4.13.1-4XtL5z7DHHC7UZaR6xNDY3 \
ghc-prof-microlens-th-0.4.3.13-K3KDbjSa5xkBUVjBxtDTLF \
ghc-prof-mtl-2.2.2 \
ghc-prof-parser-combinators-1.3.0-9EAIYkVxwfT3bR6YOGtMtZ \
ghc-prof-pretty-simple-4.1.2.0-I6NsimDP7f2Fl43nYTpHWu \
ghc-prof-regex-tdfa-1.3.2.2-EFtJwrhEkMb99DdZ6mBzLM \
ghc-prof-safe-0.3.19-9uHvZjuyLiR13wOGSONZxX \
ghc-prof-tabular-0.2.2.8-6UpIsHxi6ag26Q8LzRReTM \
ghc-prof-tasty-1.4.3-EvDBAB3nA5D6U1ANfXkHR \
ghc-prof-tasty-hunit-0.10.0.3-2hefb6clI09Drjkc6dw6d8 \
ghc-prof-template-haskell-2.19.0.0 \
ghc-prof-text-2.0.2 \
ghc-prof-time-1.12.2 \
ghc-prof-timeit-2.0-4alyyqlO7m4DFFkjYuUzq9 \
ghc-prof-transformers-0.5.6.2 \
ghc-prof-uglymemo-0.1.0.1-FaxrSjBe3XhIHSfEZHhJ9C \
ghc-prof-unordered-containers-0.2.19.1-BD6cH0OVlFU7YsFVVfZeZn \
ghc-prof-utf8-string-1.0.2-26mnfHz4IgtDU2rLQciXDs"

inherit rpm
