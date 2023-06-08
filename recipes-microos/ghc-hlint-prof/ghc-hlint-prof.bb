SUMMARY = "Haskell hlint profiling library"
DESCRIPTION = "This package provides the Haskell hlint profiling library."
LICENSE = "BSD-3-Clause"

PV = "3.5"

RPM_NAME = "ghc-hlint-prof-3.5-1.4.aarch64.rpm"
RPM_HASH = "e08784d8e56120e6eefab67a9523cafe5d64b1e205fda994ec973e91c6c03f923574edede578817ea854f5daf683a2bb22c130d3a5df6a8f8e7257061a44244a"

RPROVIDES:${PN} += "ghc-hlint-prof ghc-hlint-prof(aarch-64) ghc-prof(hlint-3.5-HI4GNHTiFqP5IrITiJdtMQ)"
RDEPENDS:${PN} += "ghc-hlint-devel ghc-prof(aeson-2.1.2.1-D6AdQzPi657L86q5kYUhvP) ghc-prof(ansi-terminal-0.11.5-5x0MoHxm5r6DDoyv5djCW3) ghc-prof(base-4.17.1.0) ghc-prof(bytestring-0.11.4.0) ghc-prof(cmdargs-0.10.22-JxALoPeruUH3tSM40P8Mx) ghc-prof(containers-0.6.7) ghc-prof(cpphs-1.20.9.1-FT5N79IhkR98KU1k959mgj) ghc-prof(data-default-0.7.1.1-5iNQUD7GKkTDiLEyJaqXSy) ghc-prof(deriving-aeson-0.2.9-HkCtwpD3IaS9WeJeVKU34M) ghc-prof(directory-1.3.7.1) ghc-prof(extra-1.7.13-CLIQu72ADU8JHmf7UWoQG4) ghc-prof(file-embed-0.0.15.0-LJLaBgMyS4K2tBVYbzJ0uw) ghc-prof(filepath-1.4.2.2) ghc-prof(filepattern-0.1.3-CFBsL0RN2YG3tR2tZTKdgo) ghc-prof(ghc-lib-parser-9.4.4.20221225-IYLH4ajMYTmJphnJAgaapb) ghc-prof(ghc-lib-parser-ex-9.4.0.0-70SEjDlvh6sIQjB4r4CbU7) ghc-prof(hscolour-1.24.4-B0NmEhYuPI790UQrsiXLka) ghc-prof(process-1.6.16.0) ghc-prof(refact-0.3.0.2-4ZnrxSKFCNFLIgjtpZGW26) ghc-prof(text-2.0.2) ghc-prof(transformers-0.5.6.2) ghc-prof(uniplate-1.6.13-3GboCmnxCZ4BmbYwVaL4sN) ghc-prof(unordered-containers-0.2.19.1-KblUXVJ0SvRCcK89PoBx7E) ghc-prof(utf8-string-1.0.2-3yyxPCwARUwDt9ZNWn320Q) ghc-prof(vector-0.13.0.0-AbjrQrWxuFpAjIHk3G7xsp) ghc-prof(yaml-0.11.11.0-AM27xwJeGq9DNHRH5iLzHi)"

inherit rpm
