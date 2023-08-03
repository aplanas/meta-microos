SUMMARY = "Haskell pandoc profiling library"
DESCRIPTION = "This package provides the Haskell pandoc profiling library."
LICENSE = "GPL-2.0-or-later"

PV = "3.1.3"

RPM_NAME = "ghc-pandoc-prof-3.1.3-2.2.aarch64.rpm"
RPM_HASH = "1ec444f84e8839476aec8977b81dc92203a43a12f44a4eff51a50329b114108147bc6cd140aa5ecf79f93f46b3d2d2c2cc6da32bd8726508fe6d7f40fa48f10f"

RPROVIDES:${PN} += "ghc-pandoc-prof \
ghc-prof-pandoc-3.1.3-55OY79jb6yp7kweb38lcUZ"

RDEPENDS:${PN} += "ghc-pandoc-devel \
ghc-prof-Glob-0.10.2-5tAj3lHfg0h9Pb5bOpMg4R \
ghc-prof-JuicyPixels-3.3.8-BQPF2mBCFFj3rGPaZ8nrGS \
ghc-prof-SHA-1.6.4.4-CTRZ9m1gmyY35Z2xnCckJW \
ghc-prof-aeson-2.1.2.1-HkN6OtqTngQ9De3CKBnfov \
ghc-prof-aeson-pretty-0.8.10-8JRVLG9BqWz7B95FOCRy0B \
ghc-prof-array-0.5.4.0 \
ghc-prof-attoparsec-0.14.4-21v4nlnPs0qLZ5R1FIK9u3 \
ghc-prof-base-4.17.1.0 \
ghc-prof-base64-0.4.2.4-A6ZHULO0U6jEqaRLwqb1vV \
ghc-prof-binary-0.8.9.1 \
ghc-prof-blaze-html-0.9.1.2-38lyFDueaN76YOL6QIMVAR \
ghc-prof-blaze-markup-0.8.2.8-1rqnOPcdOmIw0iYwB3Kqc \
ghc-prof-bytestring-0.11.4.0 \
ghc-prof-case-insensitive-1.2.1.0-AumZoR4Lds63HJj8OQwHY3 \
ghc-prof-citeproc-0.8.1-IdWRS5bkx4mHz8SxZquXUQ \
ghc-prof-commonmark-0.2.3-I1mjDgOYrWfJTVx5dvVv0G \
ghc-prof-commonmark-extensions-0.2.3.5-GeNUJwJZ0WZ7BXjQ8SYvXo \
ghc-prof-commonmark-pandoc-0.2.1.3-5icm69shxRz6xfjspkSdL7 \
ghc-prof-connection-0.3.1-E1TQ2BFmXua7xK5tzqGZX7 \
ghc-prof-containers-0.6.7 \
ghc-prof-data-default-0.7.1.1-5iNQUD7GKkTDiLEyJaqXSy \
ghc-prof-deepseq-1.4.8.0 \
ghc-prof-directory-1.3.7.1 \
ghc-prof-doclayout-0.4.0.1-9Y8Rw4EdBjz2IhzjzOiBy0 \
ghc-prof-doctemplates-0.11-JIB0NPJebEE1gzCrfsk8Xp \
ghc-prof-emojis-0.1.2-Gz9J6Rv977iEZp4TYp7wAm \
ghc-prof-exceptions-0.10.5 \
ghc-prof-file-embed-0.0.15.0-LJLaBgMyS4K2tBVYbzJ0uw \
ghc-prof-filepath-1.4.2.2 \
ghc-prof-gridtables-0.1.0.0-I8M3kz7LaeTJ8iEjDWUjrS \
ghc-prof-haddock-library-1.11.0-3IU1wl1Mct8946s210c9Hs \
ghc-prof-http-client-0.7.13.1-LvoiBjsIce7LUIKGveF6IJ \
ghc-prof-http-client-tls-0.3.6.1-JGexjE6a1aDBtZfhjHdqL7 \
ghc-prof-http-types-0.12.3-4BrMFwRucoT4fBt8cCVFS6 \
ghc-prof-ipynb-0.2-L0fucXiR4UEfjFQwta2fV \
ghc-prof-jira-wiki-markup-1.5.1-7ePG3tP2CY82wODfjMZ5nH \
ghc-prof-mime-types-0.1.1.0-IrWGRRDe33Y1D55h7nh7fm \
ghc-prof-mtl-2.2.2 \
ghc-prof-network-3.1.4.0-FvtFepOtuCUH79FCWyNxIc \
ghc-prof-network-uri-2.6.4.2-4kNQnaE9heqEL1mH8FE5xH \
ghc-prof-pandoc-types-1.23.0.1-EcvZluXpPb0J10kJC4UfRg \
ghc-prof-parsec-3.1.16.1 \
ghc-prof-pretty-1.1.3.6 \
ghc-prof-pretty-show-1.10-IA5YnfAP5DqIvEIFfcZVdd \
ghc-prof-process-1.6.16.0 \
ghc-prof-random-1.2.1.1-I0wUgAAbf0g3qHR3e8uT0o \
ghc-prof-safe-0.3.19-3Ab0OpSRliCKMhc0t4Nhds \
ghc-prof-scientific-0.3.7.0-D5F2vql7x79Dy9hx72OES1 \
ghc-prof-skylighting-0.13.4.1-CU1AlEko5yK2gCD1OmtnCm \
ghc-prof-skylighting-core-0.13.4.1-6Bsu3Qo0E1u1DqUSYo1bSc \
ghc-prof-split-0.2.3.5-u3oGLAiW7JJbxIffWSCWf \
ghc-prof-syb-0.7.2.3-J0Qw7O8gTR0DSXObDhEt8i \
ghc-prof-tagsoup-0.14.8-KqOLe3dJpuA4KsHZJW2cTn \
ghc-prof-temporary-1.3-9rLWZg49Shk3gKExST32p \
ghc-prof-texmath-0.12.8-2ewx8lB0RHk1Ql4916ePbT \
ghc-prof-text-2.0.2 \
ghc-prof-text-conversions-0.3.1.1-CkkBRqT3R5g4PO0QywmUQS \
ghc-prof-time-1.12.2 \
ghc-prof-typst-0.1.0.0-KYQhPlbAv2KGc3iiEDbU9A \
ghc-prof-unicode-collation-0.1.3.4-LMKRbY0RRBBKxwMiir45sP \
ghc-prof-unicode-transforms-0.4.0.1-EKt5KzAvdneBwqiDZWg9HO \
ghc-prof-unix-2.7.3 \
ghc-prof-vector-0.13.0.0-AbjrQrWxuFpAjIHk3G7xsp \
ghc-prof-xml-1.3.14-BBPDUWQuUpt3QYOr4h6J5g \
ghc-prof-yaml-0.11.11.2-4GYYolDKkXn5x4zdb9DA59 \
ghc-prof-zip-archive-0.4.3-DcfDtoW5uCpFhVU7PDyRvn \
ghc-prof-zlib-0.6.3.0-GaFaUl6t8QzEoHIQXsottk"

inherit rpm
