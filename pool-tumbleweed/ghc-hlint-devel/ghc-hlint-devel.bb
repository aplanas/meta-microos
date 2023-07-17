SUMMARY = "Haskell hlint library development files"
DESCRIPTION = "This package provides the Haskell hlint library development files."
LICENSE = "BSD-3-Clause"

PV = "3.5"

RPM_NAME = "ghc-hlint-devel-3.5-1.10.aarch64.rpm"
RPM_HASH = "6ad44de56904414e7299f74c7120026fe6f00735732c76f3e6f093613e20d05a2257c055eb95a8a1c0692a36768e156e8622bb6ca08248936d6cf0b1881a4687"

RPROVIDES:${PN} += "ghc-devel-hlint-3.5-D3vZjbXvhdOGKD9r4srBmV \
ghc-hlint-devel"

RDEPENDS:${PN} += "/usr/bin/sh \
ghc-compiler \
ghc-devel-aeson-2.1.2.1-HkN6OtqTngQ9De3CKBnfov \
ghc-devel-ansi-terminal-0.11.5-5x0MoHxm5r6DDoyv5djCW3 \
ghc-devel-base-4.17.1.0 \
ghc-devel-bytestring-0.11.4.0 \
ghc-devel-cmdargs-0.10.22-JxALoPeruUH3tSM40P8Mx \
ghc-devel-containers-0.6.7 \
ghc-devel-cpphs-1.20.9.1-FT5N79IhkR98KU1k959mgj \
ghc-devel-data-default-0.7.1.1-5iNQUD7GKkTDiLEyJaqXSy \
ghc-devel-deriving-aeson-0.2.9-H4zgwfPBYrUGAqouOy9tcC \
ghc-devel-directory-1.3.7.1 \
ghc-devel-extra-1.7.14-BoqGpItPSHp5TXSaJGSPpo \
ghc-devel-file-embed-0.0.15.0-LJLaBgMyS4K2tBVYbzJ0uw \
ghc-devel-filepath-1.4.2.2 \
ghc-devel-filepattern-0.1.3-ZuemUYkhwGA1RPuLxzdA9 \
ghc-devel-ghc-lib-parser-9.4.5.20230430-3l319oISrwg5O8XOrKFn5M \
ghc-devel-ghc-lib-parser-ex-9.4.0.0-csIofWAAh3CX4OvchqGS5 \
ghc-devel-hscolour-1.24.4-B0NmEhYuPI790UQrsiXLka \
ghc-devel-process-1.6.16.0 \
ghc-devel-refact-0.3.0.2-4ZnrxSKFCNFLIgjtpZGW26 \
ghc-devel-text-2.0.2 \
ghc-devel-transformers-0.5.6.2 \
ghc-devel-uniplate-1.6.13-3GboCmnxCZ4BmbYwVaL4sN \
ghc-devel-unordered-containers-0.2.19.1-KblUXVJ0SvRCcK89PoBx7E \
ghc-devel-utf8-string-1.0.2-3yyxPCwARUwDt9ZNWn320Q \
ghc-devel-vector-0.13.0.0-AbjrQrWxuFpAjIHk3G7xsp \
ghc-devel-yaml-0.11.11.2-4GYYolDKkXn5x4zdb9DA59 \
ghc-hlint"

inherit rpm
