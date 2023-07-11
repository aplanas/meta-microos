SUMMARY = "Haskell pandoc library development files"
DESCRIPTION = "This package provides the Haskell pandoc library development files."
LICENSE = "GPL-2.0-or-later"

PV = "3.1.3"

RPM_NAME = "ghc-pandoc-devel-3.1.3-1.3.aarch64.rpm"
RPM_HASH = "bc25b7f376d9fc0ec967fa49ab3f93e583b39d551ff0be361c314265e4ba3e3387b28282eeef4be2ff34fbd4190561ae58d9b675cf7754c56854ffa4a6431bd5"

RPROVIDES:${PN} += "ghc-devel-pandoc-3.1.3-5ecWWg0ojZ38IHcxSTWJz4 \
ghc-pandoc-devel"

RDEPENDS:${PN} += "/usr/bin/sh \
ghc-compiler \
ghc-devel-Glob-0.10.2-5tAj3lHfg0h9Pb5bOpMg4R \
ghc-devel-JuicyPixels-3.3.8-BQPF2mBCFFj3rGPaZ8nrGS \
ghc-devel-SHA-1.6.4.4-CTRZ9m1gmyY35Z2xnCckJW \
ghc-devel-aeson-2.1.2.1-HkN6OtqTngQ9De3CKBnfov \
ghc-devel-aeson-pretty-0.8.9-ANiMUyahKok8eMC9BUYvO0 \
ghc-devel-array-0.5.4.0 \
ghc-devel-attoparsec-0.14.4-21v4nlnPs0qLZ5R1FIK9u3 \
ghc-devel-base-4.17.1.0 \
ghc-devel-base64-0.4.2.4-A6ZHULO0U6jEqaRLwqb1vV \
ghc-devel-binary-0.8.9.1 \
ghc-devel-blaze-html-0.9.1.2-38lyFDueaN76YOL6QIMVAR \
ghc-devel-blaze-markup-0.8.2.8-1rqnOPcdOmIw0iYwB3Kqc \
ghc-devel-bytestring-0.11.4.0 \
ghc-devel-case-insensitive-1.2.1.0-AumZoR4Lds63HJj8OQwHY3 \
ghc-devel-citeproc-0.8.1-Ex3LMLw4y9Q5nAZv8bt8hk \
ghc-devel-commonmark-0.2.3-I1mjDgOYrWfJTVx5dvVv0G \
ghc-devel-commonmark-extensions-0.2.3.4-lgOKfz42TuIWz23FZS91J \
ghc-devel-commonmark-pandoc-0.2.1.3-HVNPkFgx18RJMldDwlSrf3 \
ghc-devel-connection-0.3.1-E1TQ2BFmXua7xK5tzqGZX7 \
ghc-devel-containers-0.6.7 \
ghc-devel-data-default-0.7.1.1-5iNQUD7GKkTDiLEyJaqXSy \
ghc-devel-deepseq-1.4.8.0 \
ghc-devel-directory-1.3.7.1 \
ghc-devel-doclayout-0.4.0.1-9Y8Rw4EdBjz2IhzjzOiBy0 \
ghc-devel-doctemplates-0.11-JIB0NPJebEE1gzCrfsk8Xp \
ghc-devel-emojis-0.1.2-Gz9J6Rv977iEZp4TYp7wAm \
ghc-devel-exceptions-0.10.5 \
ghc-devel-file-embed-0.0.15.0-LJLaBgMyS4K2tBVYbzJ0uw \
ghc-devel-filepath-1.4.2.2 \
ghc-devel-gridtables-0.1.0.0-I8M3kz7LaeTJ8iEjDWUjrS \
ghc-devel-haddock-library-1.11.0-3IU1wl1Mct8946s210c9Hs \
ghc-devel-http-client-0.7.13.1-LvoiBjsIce7LUIKGveF6IJ \
ghc-devel-http-client-tls-0.3.6.1-JGexjE6a1aDBtZfhjHdqL7 \
ghc-devel-http-types-0.12.3-4BrMFwRucoT4fBt8cCVFS6 \
ghc-devel-ipynb-0.2-L0fucXiR4UEfjFQwta2fV \
ghc-devel-jira-wiki-markup-1.5.1-7ePG3tP2CY82wODfjMZ5nH \
ghc-devel-mime-types-0.1.1.0-IrWGRRDe33Y1D55h7nh7fm \
ghc-devel-mtl-2.2.2 \
ghc-devel-network-3.1.4.0-FvtFepOtuCUH79FCWyNxIc \
ghc-devel-network-uri-2.6.4.2-4kNQnaE9heqEL1mH8FE5xH \
ghc-devel-pandoc-types-1.23-4C1nzwOnt973xRAA9sp531 \
ghc-devel-parsec-3.1.16.1 \
ghc-devel-pretty-1.1.3.6 \
ghc-devel-pretty-show-1.10-IA5YnfAP5DqIvEIFfcZVdd \
ghc-devel-process-1.6.16.0 \
ghc-devel-random-1.2.1.1-I0wUgAAbf0g3qHR3e8uT0o \
ghc-devel-safe-0.3.19-3Ab0OpSRliCKMhc0t4Nhds \
ghc-devel-scientific-0.3.7.0-D5F2vql7x79Dy9hx72OES1 \
ghc-devel-skylighting-0.13.3-KhN5DzrcPQALN95CsO2kAp \
ghc-devel-skylighting-core-0.13.3-9hBRKYwyArU4OdEqV8LbQv \
ghc-devel-split-0.2.3.5-u3oGLAiW7JJbxIffWSCWf \
ghc-devel-syb-0.7.2.3-J0Qw7O8gTR0DSXObDhEt8i \
ghc-devel-tagsoup-0.14.8-KqOLe3dJpuA4KsHZJW2cTn \
ghc-devel-temporary-1.3-9rLWZg49Shk3gKExST32p \
ghc-devel-texmath-0.12.8-JGsJwuKtD7b26p8DVW0WBw \
ghc-devel-text-2.0.2 \
ghc-devel-text-conversions-0.3.1.1-CkkBRqT3R5g4PO0QywmUQS \
ghc-devel-time-1.12.2 \
ghc-devel-typst-0.1.0.0-3VBCZ4Q02O47LMJn0K0CF8 \
ghc-devel-unicode-collation-0.1.3.4-LMKRbY0RRBBKxwMiir45sP \
ghc-devel-unicode-transforms-0.4.0.1-EKt5KzAvdneBwqiDZWg9HO \
ghc-devel-unix-2.7.3 \
ghc-devel-vector-0.13.0.0-AbjrQrWxuFpAjIHk3G7xsp \
ghc-devel-xml-1.3.14-BBPDUWQuUpt3QYOr4h6J5g \
ghc-devel-xml-conduit-1.9.1.3-JDYavYDcwLN29rDQLTOOon \
ghc-devel-xml-types-0.3.8-7guWdy0cJxZLf8pjB1j9Fb \
ghc-devel-yaml-0.11.11.1-3T1xu4983kFHb1qERRZhqW \
ghc-devel-zip-archive-0.4.3-DcfDtoW5uCpFhVU7PDyRvn \
ghc-devel-zlib-0.6.3.0-GaFaUl6t8QzEoHIQXsottk \
ghc-pandoc"

inherit rpm
