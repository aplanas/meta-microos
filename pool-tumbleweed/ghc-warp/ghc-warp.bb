SUMMARY = "A fast, light-weight web server for WAI applications"
DESCRIPTION = "HTTP/1.0, HTTP/1.1 and HTTP/2 are supported. For HTTP/2, Warp supports direct \
and ALPN (in TLS) but not upgrade. API docs and the README are available at \
<http://www.stackage.org/package/warp>."
LICENSE = "MIT"

PV = "3.3.25"

RPM_NAME = "ghc-warp-3.3.25-1.4.aarch64.rpm"
RPM_HASH = "db95305ce8ec2a03681640ec8be878bb019ba730f1ed2d891c23acb583a5a14f1e8e2cd7e32c1e98a4584e41be81cc036b99349e24c91a056c43c9bd0a57e981"

RPROVIDES:${PN} += "ghc-warp \
libHSwarp-3.3.25-E7dqXF5eh0k5u5fIPKRjLZ-ghc9.4.5.so"

RDEPENDS:${PN} += "libHSappar-0.1.8-JYpyJYPkUOgKorqU8WSWRv-ghc9.4.5.so \
libHSarray-0.5.4.0-ghc9.4.5.so \
libHSasn1-encoding-0.9.6-Hputs8NTOGr9EmEd7QDXHk-ghc9.4.5.so \
libHSasn1-parse-0.9.5-EPDirjvv9Ch16KeQVAexUV-ghc9.4.5.so \
libHSasn1-types-0.3.4-GYlFjiH4jmgJII5TgUQfXm-ghc9.4.5.so \
libHSasync-2.2.4-Is3H7ZPNMkM5reIoCaqYrF-ghc9.4.5.so \
libHSattoparsec-0.14.4-21v4nlnPs0qLZ5R1FIK9u3-ghc9.4.5.so \
libHSattoparsec-0.14.4-JfIUPSNLtNQH9xUGOplWef-attoparsec-internal-ghc9.4.5.so \
libHSauto-update-0.1.6-CObek7rRQnGB5D6p02bNzQ-ghc9.4.5.so \
libHSbase-4.17.1.0-ghc9.4.5.so \
libHSbasement-0.0.15-6OmKTVi2kFpCWMoKDlsO4S-ghc9.4.5.so \
libHSbinary-0.8.9.1-ghc9.4.5.so \
libHSbsb-http-chunked-0.0.0.4-7TdDxnBU7De3tUquWdckvl-ghc9.4.5.so \
libHSbyteorder-1.0.4-3C2mbNH4DNU4EJIfEbmhBl-ghc9.4.5.so \
libHSbytestring-0.11.4.0-ghc9.4.5.so \
libHScase-insensitive-1.2.1.0-AumZoR4Lds63HJj8OQwHY3-ghc9.4.5.so \
libHScontainers-0.6.7-ghc9.4.5.so \
libHScryptonite-0.30-AbDFzA14dNKDfU9pLpBLye-ghc9.4.5.so \
libHSdeepseq-1.4.8.0-ghc9.4.5.so \
libHSdirectory-1.3.7.1-ghc9.4.5.so \
libHSexceptions-0.10.5-ghc9.4.5.so \
libHSfilepath-1.4.2.2-ghc9.4.5.so \
libHSghc-bignum-1.3-ghc9.4.5.so \
libHSghc-boot-th-9.4.5-ghc9.4.5.so \
libHSghc-prim-0.9.0-ghc9.4.5.so \
libHShashable-1.4.2.0-FFBRhuY0w4YLmuLEs5uQAt-ghc9.4.5.so \
libHShourglass-0.2.12-3PFbUFQLMNb8Ad2s9SU5p3-ghc9.4.5.so \
libHShttp-date-0.0.11-IfCBGXPFiMuIKzFtOTNgnD-ghc9.4.5.so \
libHShttp-types-0.12.3-4BrMFwRucoT4fBt8cCVFS6-ghc9.4.5.so \
libHShttp2-3.0.3-g8K2coD7lK8bFd8vR2MQJ-ghc9.4.5.so \
libHSinteger-gmp-1.1-ghc9.4.5.so \
libHSinteger-logarithms-1.0.3.1-Hm9v2fsfG1DA5soPSLssZu-ghc9.4.5.so \
libHSiproute-1.7.12-2mj2MFOMRz35bHY4Q7Jvyd-ghc9.4.5.so \
libHSmemory-0.18.0-2DG6nqjfLMK4MSR77XYQqL-ghc9.4.5.so \
libHSmtl-2.2.2-ghc9.4.5.so \
libHSnetwork-3.1.2.8-HNDBp0HF6t0D1fzE2MDtPd-ghc9.4.5.so \
libHSnetwork-byte-order-0.1.6-9jNlcwvZjC3K8A2S0a4vrO-ghc9.4.5.so \
libHSold-locale-1.0.0.7-B5o2Qz0CVVSCB1XGw7OfzR-ghc9.4.5.so \
libHSold-time-1.1.0.3-6MrxIvEBZcaI0p7TDiYNU1-ghc9.4.5.so \
libHSpem-0.2.4-GVwv4fsQYoEEDbQiUNwxns-ghc9.4.5.so \
libHSpretty-1.1.3.6-ghc9.4.5.so \
libHSprimitive-0.7.4.0-AeB0oysC3TAJw9tDpuX8hq-ghc9.4.5.so \
libHSprocess-1.6.16.0-ghc9.4.5.so \
libHSpsqueues-0.2.7.3-F3Vf47seRPn11NfFVgsy6O-ghc9.4.5.so \
libHSrandom-1.2.1.1-I0wUgAAbf0g3qHR3e8uT0o-ghc9.4.5.so \
libHSrecv-0.1.0-4koyrU2GJ4L4fpyKcXLbZR-ghc9.4.5.so \
libHSsafe-exceptions-0.1.7.3-4ydW60ruqZ4IdMpKf3b6BD-ghc9.4.5.so \
libHSscientific-0.3.7.0-D5F2vql7x79Dy9hx72OES1-ghc9.4.5.so \
libHSsimple-sendfile-0.2.31-701wssQD34oFyvrTLOblUT-ghc9.4.5.so \
libHSsplitmix-0.1.0.4-7e8CibdlMRLAGh7KO5VlFe-ghc9.4.5.so \
libHSstm-2.5.1.0-ghc9.4.5.so \
libHSstreaming-commons-0.2.2.6-DrPeIbd2d2c3jQtctttO4G-ghc9.4.5.so \
libHStemplate-haskell-2.19.0.0-ghc9.4.5.so \
libHStext-2.0.2-ghc9.4.5.so \
libHStime-1.12.2-ghc9.4.5.so \
libHStime-manager-0.0.0-49hD2RcPrUEG8anOiBePCj-ghc9.4.5.so \
libHStransformers-0.5.6.2-ghc9.4.5.so \
libHSunix-2.7.3-ghc9.4.5.so \
libHSunix-compat-0.6-79KxxZMmklx25hsmeEnenN-ghc9.4.5.so \
libHSunix-time-0.4.9-DrdwBL0FLhc5jN9Hujlou0-ghc9.4.5.so \
libHSunliftio-0.2.24.0-Dgc3Qshya29BgIaWsfBy4D-ghc9.4.5.so \
libHSunliftio-core-0.2.1.0-AEtYfdyUWlJCLfz2d4hPbj-ghc9.4.5.so \
libHSunordered-containers-0.2.19.1-KblUXVJ0SvRCcK89PoBx7E-ghc9.4.5.so \
libHSvault-0.3.1.5-1nJxIV9kR8e5L3ZIpYZHc-ghc9.4.5.so \
libHSwai-3.2.3-LsLg4DRwusRI7b3SRdjDzn-ghc9.4.5.so \
libHSword8-0.1.3-9uGjviso2af8K0EP8UmxRD-ghc9.4.5.so \
libHSx509-1.7.7-6vFRDfbnKcXIbE0ZlEHitw-ghc9.4.5.so \
libHSzlib-0.6.3.0-GaFaUl6t8QzEoHIQXsottk-ghc9.4.5.so \
libc.so.6 \
libgmp.so.10 \
libm.so.6 \
libz.so.1"

inherit rpm
