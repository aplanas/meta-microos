SUMMARY = "Haskell hlint library development files"
DESCRIPTION = "This package provides the Haskell hlint library development files."
LICENSE = "BSD-3-Clause"

PV = "3.5"

RPM_NAME = "ghc-hlint-devel-3.5-1.4.aarch64.rpm"
RPM_HASH = "599614e83448f468bdd8f6d714e2bcef518812e9708e6fd0507084b3d492724a128d5be1116054017adcd0d2dc3269fce556543767ca30d3b85ec79da3f0615d"

RPROVIDES:${PN} += "ghc-devel(hlint-3.5-HI4GNHTiFqP5IrITiJdtMQ) \
ghc-hlint-devel \
ghc-hlint-devel(aarch-64)"
RDEPENDS:${PN} += "/bin/sh \
ghc-compiler \
ghc-devel(aeson-2.1.2.1-D6AdQzPi657L86q5kYUhvP) \
ghc-devel(ansi-terminal-0.11.5-5x0MoHxm5r6DDoyv5djCW3) \
ghc-devel(base-4.17.1.0) \
ghc-devel(bytestring-0.11.4.0) \
ghc-devel(cmdargs-0.10.22-JxALoPeruUH3tSM40P8Mx) \
ghc-devel(containers-0.6.7) \
ghc-devel(cpphs-1.20.9.1-FT5N79IhkR98KU1k959mgj) \
ghc-devel(data-default-0.7.1.1-5iNQUD7GKkTDiLEyJaqXSy) \
ghc-devel(deriving-aeson-0.2.9-HkCtwpD3IaS9WeJeVKU34M) \
ghc-devel(directory-1.3.7.1) \
ghc-devel(extra-1.7.13-CLIQu72ADU8JHmf7UWoQG4) \
ghc-devel(file-embed-0.0.15.0-LJLaBgMyS4K2tBVYbzJ0uw) \
ghc-devel(filepath-1.4.2.2) \
ghc-devel(filepattern-0.1.3-CFBsL0RN2YG3tR2tZTKdgo) \
ghc-devel(ghc-lib-parser-9.4.4.20221225-IYLH4ajMYTmJphnJAgaapb) \
ghc-devel(ghc-lib-parser-ex-9.4.0.0-70SEjDlvh6sIQjB4r4CbU7) \
ghc-devel(hscolour-1.24.4-B0NmEhYuPI790UQrsiXLka) \
ghc-devel(process-1.6.16.0) \
ghc-devel(refact-0.3.0.2-4ZnrxSKFCNFLIgjtpZGW26) \
ghc-devel(text-2.0.2) \
ghc-devel(transformers-0.5.6.2) \
ghc-devel(uniplate-1.6.13-3GboCmnxCZ4BmbYwVaL4sN) \
ghc-devel(unordered-containers-0.2.19.1-KblUXVJ0SvRCcK89PoBx7E) \
ghc-devel(utf8-string-1.0.2-3yyxPCwARUwDt9ZNWn320Q) \
ghc-devel(vector-0.13.0.0-AbjrQrWxuFpAjIHk3G7xsp) \
ghc-devel(yaml-0.11.11.0-AM27xwJeGq9DNHRH5iLzHi) \
ghc-hlint"

inherit rpm
