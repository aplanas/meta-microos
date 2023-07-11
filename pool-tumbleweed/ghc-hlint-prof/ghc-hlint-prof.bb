SUMMARY = "Haskell hlint profiling library"
DESCRIPTION = "This package provides the Haskell hlint profiling library."
LICENSE = "BSD-3-Clause"

PV = "3.5"

RPM_NAME = "ghc-hlint-prof-3.5-1.7.aarch64.rpm"
RPM_HASH = "ae3d102c2ceb2c81131baad8bb93130dc30007da39249c2a41a1c77f78ca691a18795ffc87c29aa41bd61cb4cc71116e1b2cb1aa01216f6f16df3675d4b0acf7"

RPROVIDES:${PN} += "ghc-hlint-prof \
ghc-prof-hlint-3.5-6P3DyV4yxDzirbNOiekZM"

RDEPENDS:${PN} += "ghc-hlint-devel \
ghc-prof-aeson-2.1.2.1-HkN6OtqTngQ9De3CKBnfov \
ghc-prof-ansi-terminal-0.11.5-5x0MoHxm5r6DDoyv5djCW3 \
ghc-prof-base-4.17.1.0 \
ghc-prof-bytestring-0.11.4.0 \
ghc-prof-cmdargs-0.10.22-JxALoPeruUH3tSM40P8Mx \
ghc-prof-containers-0.6.7 \
ghc-prof-cpphs-1.20.9.1-FT5N79IhkR98KU1k959mgj \
ghc-prof-data-default-0.7.1.1-5iNQUD7GKkTDiLEyJaqXSy \
ghc-prof-deriving-aeson-0.2.9-H4zgwfPBYrUGAqouOy9tcC \
ghc-prof-directory-1.3.7.1 \
ghc-prof-extra-1.7.13-CLIQu72ADU8JHmf7UWoQG4 \
ghc-prof-file-embed-0.0.15.0-LJLaBgMyS4K2tBVYbzJ0uw \
ghc-prof-filepath-1.4.2.2 \
ghc-prof-filepattern-0.1.3-CFBsL0RN2YG3tR2tZTKdgo \
ghc-prof-ghc-lib-parser-9.4.5.20230430-3l319oISrwg5O8XOrKFn5M \
ghc-prof-ghc-lib-parser-ex-9.4.0.0-csIofWAAh3CX4OvchqGS5 \
ghc-prof-hscolour-1.24.4-B0NmEhYuPI790UQrsiXLka \
ghc-prof-process-1.6.16.0 \
ghc-prof-refact-0.3.0.2-4ZnrxSKFCNFLIgjtpZGW26 \
ghc-prof-text-2.0.2 \
ghc-prof-transformers-0.5.6.2 \
ghc-prof-uniplate-1.6.13-3GboCmnxCZ4BmbYwVaL4sN \
ghc-prof-unordered-containers-0.2.19.1-KblUXVJ0SvRCcK89PoBx7E \
ghc-prof-utf8-string-1.0.2-3yyxPCwARUwDt9ZNWn320Q \
ghc-prof-vector-0.13.0.0-AbjrQrWxuFpAjIHk3G7xsp \
ghc-prof-yaml-0.11.11.1-3T1xu4983kFHb1qERRZhqW"

inherit rpm
