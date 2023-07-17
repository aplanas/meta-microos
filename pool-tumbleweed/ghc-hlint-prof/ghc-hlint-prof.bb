SUMMARY = "Haskell hlint profiling library"
DESCRIPTION = "This package provides the Haskell hlint profiling library."
LICENSE = "BSD-3-Clause"

PV = "3.5"

RPM_NAME = "ghc-hlint-prof-3.5-1.10.aarch64.rpm"
RPM_HASH = "ddcd5768f2783122ac0085b8c4bdf56e3d694e8be727bf769f7cf223bff964cdcb31912ff4d45294fb98af599916c8a48053a50eda73fc6c16ea63f3f9e318d7"

RPROVIDES:${PN} += "ghc-hlint-prof \
ghc-prof-hlint-3.5-D3vZjbXvhdOGKD9r4srBmV"

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
ghc-prof-extra-1.7.14-BoqGpItPSHp5TXSaJGSPpo \
ghc-prof-file-embed-0.0.15.0-LJLaBgMyS4K2tBVYbzJ0uw \
ghc-prof-filepath-1.4.2.2 \
ghc-prof-filepattern-0.1.3-ZuemUYkhwGA1RPuLxzdA9 \
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
ghc-prof-yaml-0.11.11.2-4GYYolDKkXn5x4zdb9DA59"

inherit rpm
