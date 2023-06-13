SUMMARY = "Haskell dbus library development files"
DESCRIPTION = "This package provides the Haskell dbus library development files."
LICENSE = "Apache-2.0"

PV = "1.2.28"

RPM_NAME = "ghc-dbus-devel-1.2.28-1.3.aarch64.rpm"
RPM_HASH = "f4f6a7ff33d1965ffb0fed7a8b7149423598193745d12a9b33f9355d9e6b1994d0fa5ac757795d6b4735003d8ad0cb167ef98da299e1cebde7c342238bbcfd60"

RPROVIDES:${PN} += "ghc-dbus-devel \
ghc-dbus-devel(aarch-64) \
ghc-devel(dbus-1.2.28-27GbkRPSCRwKgi0yxoNYFh)"

RDEPENDS:${PN} += "/bin/sh \
ghc-compiler \
ghc-dbus \
ghc-devel(base-4.17.1.0) \
ghc-devel(bytestring-0.11.4.0) \
ghc-devel(cereal-0.5.8.3-LNsxCTyOF85AKtb4iLTs8f) \
ghc-devel(conduit-1.3.4.3-dAZVHPSYjL2zQ4RzAuWi2) \
ghc-devel(containers-0.6.7) \
ghc-devel(deepseq-1.4.8.0) \
ghc-devel(exceptions-0.10.5) \
ghc-devel(filepath-1.4.2.2) \
ghc-devel(lens-5.2.2-2MO0prnPqCQBRfua8fH2Ea) \
ghc-devel(network-3.1.2.8-HNDBp0HF6t0D1fzE2MDtPd) \
ghc-devel(parsec-3.1.16.1) \
ghc-devel(random-1.2.1.1-I0wUgAAbf0g3qHR3e8uT0o) \
ghc-devel(split-0.2.3.5-u3oGLAiW7JJbxIffWSCWf) \
ghc-devel(template-haskell-2.19.0.0) \
ghc-devel(text-2.0.2) \
ghc-devel(th-lift-0.8.3-BVnK9vFPlpnBx7d6MzGvJN) \
ghc-devel(transformers-0.5.6.2) \
ghc-devel(unix-2.7.3) \
ghc-devel(vector-0.13.0.0-AbjrQrWxuFpAjIHk3G7xsp) \
ghc-devel(xml-conduit-1.9.1.2-EG4w0oWu477B6XYo8w0Zz4) \
ghc-devel(xml-types-0.3.8-7guWdy0cJxZLf8pjB1j9Fb)"

inherit rpm
