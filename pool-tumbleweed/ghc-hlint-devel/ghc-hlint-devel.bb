SUMMARY = "Haskell hlint library development files"
DESCRIPTION = "This package provides the Haskell hlint library development files."
LICENSE = "BSD-3-Clause"

PV = "3.5"

RPM_NAME = "ghc-hlint-devel-3.5-1.11.aarch64.rpm"
RPM_HASH = "c6b4bd56f3625ab0497a8c15663bc693c0fceb35606594ad97c974736a749e2dd216deb86968ebabb8f45a93b5f46d015fe8cbd4804049e90c4f41ef6a38db3f"

RPROVIDES:${PN} += "ghc-devel-hlint-3.5-5lu6ClZadMNAojOvKUNcWt \
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
ghc-devel-extra-1.7.14-9MsHIUa0FAo4DKg07m0mTc \
ghc-devel-file-embed-0.0.15.0-LJLaBgMyS4K2tBVYbzJ0uw \
ghc-devel-filepath-1.4.2.2 \
ghc-devel-filepattern-0.1.3-3YAZmlhLkyq9JKYM4OPVoZ \
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
