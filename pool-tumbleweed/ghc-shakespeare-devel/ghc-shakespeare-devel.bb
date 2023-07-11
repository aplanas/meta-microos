SUMMARY = "Haskell shakespeare library development files"
DESCRIPTION = "This package provides the Haskell shakespeare library development files."
LICENSE = "MIT"

PV = "2.0.30"

RPM_NAME = "ghc-shakespeare-devel-2.0.30-2.6.aarch64.rpm"
RPM_HASH = "ef8909de82ab48a9048e02a6438bc354521eac3fbf0f7d13151a11ebf3b5d600e8be1fb822ef6c33754a47b2b86705ffc61109d05c7839f1ab0f35f655035623"

RPROVIDES:${PN} += "ghc-devel-shakespeare-2.0.30-LXYSf7m1ZbEJtMw9DSE6kj \
ghc-shakespeare-devel"

RDEPENDS:${PN} += "/usr/bin/sh \
ghc-compiler \
ghc-devel-aeson-2.1.2.1-HkN6OtqTngQ9De3CKBnfov \
ghc-devel-base-4.17.1.0 \
ghc-devel-blaze-html-0.9.1.2-38lyFDueaN76YOL6QIMVAR \
ghc-devel-blaze-markup-0.8.2.8-1rqnOPcdOmIw0iYwB3Kqc \
ghc-devel-bytestring-0.11.4.0 \
ghc-devel-containers-0.6.7 \
ghc-devel-directory-1.3.7.1 \
ghc-devel-exceptions-0.10.5 \
ghc-devel-file-embed-0.0.15.0-LJLaBgMyS4K2tBVYbzJ0uw \
ghc-devel-ghc-prim-0.9.0 \
ghc-devel-parsec-3.1.16.1 \
ghc-devel-process-1.6.16.0 \
ghc-devel-scientific-0.3.7.0-D5F2vql7x79Dy9hx72OES1 \
ghc-devel-template-haskell-2.19.0.0 \
ghc-devel-text-2.0.2 \
ghc-devel-th-lift-0.8.3-BVnK9vFPlpnBx7d6MzGvJN \
ghc-devel-time-1.12.2 \
ghc-devel-transformers-0.5.6.2 \
ghc-devel-unordered-containers-0.2.19.1-KblUXVJ0SvRCcK89PoBx7E \
ghc-devel-vector-0.13.0.0-AbjrQrWxuFpAjIHk3G7xsp \
ghc-shakespeare"

inherit rpm
