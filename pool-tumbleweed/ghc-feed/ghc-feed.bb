SUMMARY = "Interfacing with RSS (v 0.9x, 2.x, 1.0) + Atom feeds"
DESCRIPTION = "Interfacing with RSS (v 0.9x, 2.x, 1.0) + Atom feeds. \
 \
To help working with the multiple feed formats we've ended up with, this set of \
modules provides parsers, pretty printers and some utility code for querying \
and just generally working with a concrete representation of feeds in Haskell. \
 \
See here for an example of how to create an Atom feed: \
<https://github.com/haskell-party/feed/blob/master/tests/Example/CreateAtom.hs> \
 \
For basic reading and editing of feeds, consult the documentation of the \
Text.Feed.* hierarchy."
LICENSE = "BSD-3-Clause"

PV = "1.3.2.1"

RPM_NAME = "ghc-feed-1.3.2.1-2.4.aarch64.rpm"
RPM_HASH = "664c2660ab46fbbd512822e17c0dc79c56b414097bc1ccbcc396a7e752eccc4b60e89998101ff19245ddd9303f1112fd162d60bde25ad5c840cf381b7824e2fe"

RPROVIDES:${PN} += "ghc-feed \
libHSfeed-1.3.2.1-9QdnKoSJqFXKInoiUUJDkf-ghc9.4.5.so"

RDEPENDS:${PN} += "libHSarray-0.5.4.0-ghc9.4.5.so \
libHSasync-2.2.4-Is3H7ZPNMkM5reIoCaqYrF-ghc9.4.5.so \
libHSattoparsec-0.14.4-21v4nlnPs0qLZ5R1FIK9u3-ghc9.4.5.so \
libHSattoparsec-0.14.4-JfIUPSNLtNQH9xUGOplWef-attoparsec-internal-ghc9.4.5.so \
libHSbase-4.17.1.0-ghc9.4.5.so \
libHSbase-compat-0.12.2-L1DEOlMQJOdFOKsjHoWYov-ghc9.4.5.so \
libHSbinary-0.8.9.1-ghc9.4.5.so \
libHSbitvec-1.1.4.0-FzBtDnbj1qCBVRHTrZUOXy-ghc9.4.5.so \
libHSblaze-builder-0.4.2.2-1GcRIc7N7YHId5Q5gRvlvW-ghc9.4.5.so \
libHSblaze-html-0.9.1.2-38lyFDueaN76YOL6QIMVAR-ghc9.4.5.so \
libHSblaze-markup-0.8.2.8-1rqnOPcdOmIw0iYwB3Kqc-ghc9.4.5.so \
libHSbytestring-0.11.4.0-ghc9.4.5.so \
libHSconduit-1.3.4.3-dAZVHPSYjL2zQ4RzAuWi2-ghc9.4.5.so \
libHSconduit-extra-1.3.6-F6u9UYzIZvy2L2764Izuhr-ghc9.4.5.so \
libHScontainers-0.6.7-ghc9.4.5.so \
libHSdata-default-class-0.1.2.0-2LD1I8dZmn7BW4dkzEwdGZ-ghc9.4.5.so \
libHSdeepseq-1.4.8.0-ghc9.4.5.so \
libHSdirectory-1.3.7.1-ghc9.4.5.so \
libHSexceptions-0.10.5-ghc9.4.5.so \
libHSfilepath-1.4.2.2-ghc9.4.5.so \
libHSghc-bignum-1.3-ghc9.4.5.so \
libHSghc-boot-th-9.4.5-ghc9.4.5.so \
libHSghc-prim-0.9.0-ghc9.4.5.so \
libHShashable-1.4.2.0-FFBRhuY0w4YLmuLEs5uQAt-ghc9.4.5.so \
libHSinteger-logarithms-1.0.3.1-Hm9v2fsfG1DA5soPSLssZu-ghc9.4.5.so \
libHSmono-traversable-1.0.15.3-IT8tyCr3vQLKgjlccagv2S-ghc9.4.5.so \
libHSmtl-2.2.2-ghc9.4.5.so \
libHSnetwork-3.1.2.8-HNDBp0HF6t0D1fzE2MDtPd-ghc9.4.5.so \
libHSold-locale-1.0.0.7-B5o2Qz0CVVSCB1XGw7OfzR-ghc9.4.5.so \
libHSold-time-1.1.0.3-6MrxIvEBZcaI0p7TDiYNU1-ghc9.4.5.so \
libHSpretty-1.1.3.6-ghc9.4.5.so \
libHSprimitive-0.7.4.0-AeB0oysC3TAJw9tDpuX8hq-ghc9.4.5.so \
libHSprocess-1.6.16.0-ghc9.4.5.so \
libHSrandom-1.2.1.1-I0wUgAAbf0g3qHR3e8uT0o-ghc9.4.5.so \
libHSresourcet-1.2.6-69eF6Rrz9wX13sOJF59GPv-ghc9.4.5.so \
libHSsafe-0.3.19-3Ab0OpSRliCKMhc0t4Nhds-ghc9.4.5.so \
libHSscientific-0.3.7.0-D5F2vql7x79Dy9hx72OES1-ghc9.4.5.so \
libHSsplit-0.2.3.5-u3oGLAiW7JJbxIffWSCWf-ghc9.4.5.so \
libHSsplitmix-0.1.0.4-7e8CibdlMRLAGh7KO5VlFe-ghc9.4.5.so \
libHSstm-2.5.1.0-ghc9.4.5.so \
libHSstreaming-commons-0.2.2.6-DrPeIbd2d2c3jQtctttO4G-ghc9.4.5.so \
libHStemplate-haskell-2.19.0.0-ghc9.4.5.so \
libHStext-2.0.2-ghc9.4.5.so \
libHStime-1.12.2-ghc9.4.5.so \
libHStime-locale-compat-0.1.1.5-4KOdffkWEDD5CJkcMekvXY-ghc9.4.5.so \
libHStransformers-0.5.6.2-ghc9.4.5.so \
libHStyped-process-0.2.11.0-AJYHFlIHznQBMeAWc6SvCO-ghc9.4.5.so \
libHSunix-2.7.3-ghc9.4.5.so \
libHSunliftio-core-0.2.1.0-AEtYfdyUWlJCLfz2d4hPbj-ghc9.4.5.so \
libHSunordered-containers-0.2.19.1-KblUXVJ0SvRCcK89PoBx7E-ghc9.4.5.so \
libHSutf8-string-1.0.2-3yyxPCwARUwDt9ZNWn320Q-ghc9.4.5.so \
libHSvector-0.13.0.0-AbjrQrWxuFpAjIHk3G7xsp-ghc9.4.5.so \
libHSvector-algorithms-0.9.0.1-BIFHuMvuTIO1lWGrhqtqm6-ghc9.4.5.so \
libHSvector-stream-0.1.0.0-C5Yyq3DPEhXAQSqkM8V92s-ghc9.4.5.so \
libHSxml-conduit-1.9.1.2-EG4w0oWu477B6XYo8w0Zz4-ghc9.4.5.so \
libHSxml-types-0.3.8-7guWdy0cJxZLf8pjB1j9Fb-ghc9.4.5.so \
libHSzlib-0.6.3.0-GaFaUl6t8QzEoHIQXsottk-ghc9.4.5.so \
libc.so.6 \
libgmp.so.10 \
libm.so.6 \
libz.so.1"

inherit rpm
