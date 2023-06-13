SUMMARY = "Batteries included conduit: adapters for common libraries"
DESCRIPTION = "The conduit package itself maintains relative small dependencies. The purpose \
of this package is to collect commonly used utility functions wrapping other \
library dependencies, without depending on heavier-weight dependencies. \
The basic idea is that this package should only depend on haskell-platform \
packages and conduit."
LICENSE = "MIT"

PV = "1.3.6"

RPM_NAME = "ghc-conduit-extra-1.3.6-2.5.aarch64.rpm"
RPM_HASH = "7b032da86d49cc93574d7dda11a1a4085c936ed227b050320d083c1e0e698c39460b271b86e92cd5888de1a63bafb3b300ad056799c96f9ba320945c00eb0ed4"

RPROVIDES:${PN} += "ghc-conduit-extra \
ghc-conduit-extra(aarch-64) \
libHSconduit-extra-1.3.6-F6u9UYzIZvy2L2764Izuhr-ghc9.4.5.so()(64bit)"

RDEPENDS:${PN} += "libHSarray-0.5.4.0-ghc9.4.5.so()(64bit) \
libHSasync-2.2.4-Is3H7ZPNMkM5reIoCaqYrF-ghc9.4.5.so()(64bit) \
libHSattoparsec-0.14.4-21v4nlnPs0qLZ5R1FIK9u3-ghc9.4.5.so()(64bit) \
libHSattoparsec-0.14.4-JfIUPSNLtNQH9xUGOplWef-attoparsec-internal-ghc9.4.5.so()(64bit) \
libHSbase-4.17.1.0-ghc9.4.5.so()(64bit) \
libHSbinary-0.8.9.1-ghc9.4.5.so()(64bit) \
libHSbitvec-1.1.4.0-FzBtDnbj1qCBVRHTrZUOXy-ghc9.4.5.so()(64bit) \
libHSbytestring-0.11.4.0-ghc9.4.5.so()(64bit) \
libHSconduit-1.3.4.3-dAZVHPSYjL2zQ4RzAuWi2-ghc9.4.5.so()(64bit) \
libHScontainers-0.6.7-ghc9.4.5.so()(64bit) \
libHSdeepseq-1.4.8.0-ghc9.4.5.so()(64bit) \
libHSdirectory-1.3.7.1-ghc9.4.5.so()(64bit) \
libHSexceptions-0.10.5-ghc9.4.5.so()(64bit) \
libHSfilepath-1.4.2.2-ghc9.4.5.so()(64bit) \
libHSghc-bignum-1.3-ghc9.4.5.so()(64bit) \
libHSghc-boot-th-9.4.5-ghc9.4.5.so()(64bit) \
libHSghc-prim-0.9.0-ghc9.4.5.so()(64bit) \
libHShashable-1.4.2.0-FFBRhuY0w4YLmuLEs5uQAt-ghc9.4.5.so()(64bit) \
libHSinteger-logarithms-1.0.3.1-Hm9v2fsfG1DA5soPSLssZu-ghc9.4.5.so()(64bit) \
libHSmono-traversable-1.0.15.3-IT8tyCr3vQLKgjlccagv2S-ghc9.4.5.so()(64bit) \
libHSmtl-2.2.2-ghc9.4.5.so()(64bit) \
libHSnetwork-3.1.2.8-HNDBp0HF6t0D1fzE2MDtPd-ghc9.4.5.so()(64bit) \
libHSpretty-1.1.3.6-ghc9.4.5.so()(64bit) \
libHSprimitive-0.7.4.0-AeB0oysC3TAJw9tDpuX8hq-ghc9.4.5.so()(64bit) \
libHSprocess-1.6.16.0-ghc9.4.5.so()(64bit) \
libHSrandom-1.2.1.1-I0wUgAAbf0g3qHR3e8uT0o-ghc9.4.5.so()(64bit) \
libHSresourcet-1.2.6-69eF6Rrz9wX13sOJF59GPv-ghc9.4.5.so()(64bit) \
libHSscientific-0.3.7.0-D5F2vql7x79Dy9hx72OES1-ghc9.4.5.so()(64bit) \
libHSsplit-0.2.3.5-u3oGLAiW7JJbxIffWSCWf-ghc9.4.5.so()(64bit) \
libHSsplitmix-0.1.0.4-7e8CibdlMRLAGh7KO5VlFe-ghc9.4.5.so()(64bit) \
libHSstm-2.5.1.0-ghc9.4.5.so()(64bit) \
libHSstreaming-commons-0.2.2.6-DrPeIbd2d2c3jQtctttO4G-ghc9.4.5.so()(64bit) \
libHStemplate-haskell-2.19.0.0-ghc9.4.5.so()(64bit) \
libHStext-2.0.2-ghc9.4.5.so()(64bit) \
libHStime-1.12.2-ghc9.4.5.so()(64bit) \
libHStransformers-0.5.6.2-ghc9.4.5.so()(64bit) \
libHStyped-process-0.2.11.0-AJYHFlIHznQBMeAWc6SvCO-ghc9.4.5.so()(64bit) \
libHSunix-2.7.3-ghc9.4.5.so()(64bit) \
libHSunliftio-core-0.2.1.0-AEtYfdyUWlJCLfz2d4hPbj-ghc9.4.5.so()(64bit) \
libHSunordered-containers-0.2.19.1-KblUXVJ0SvRCcK89PoBx7E-ghc9.4.5.so()(64bit) \
libHSvector-0.13.0.0-AbjrQrWxuFpAjIHk3G7xsp-ghc9.4.5.so()(64bit) \
libHSvector-algorithms-0.9.0.1-BIFHuMvuTIO1lWGrhqtqm6-ghc9.4.5.so()(64bit) \
libHSvector-stream-0.1.0.0-C5Yyq3DPEhXAQSqkM8V92s-ghc9.4.5.so()(64bit) \
libHSzlib-0.6.3.0-GaFaUl6t8QzEoHIQXsottk-ghc9.4.5.so()(64bit) \
libc.so.6()(64bit) \
libgmp.so.10()(64bit) \
libm.so.6()(64bit) \
libz.so.1()(64bit)"

inherit rpm
