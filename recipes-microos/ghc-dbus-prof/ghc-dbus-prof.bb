SUMMARY = "Haskell dbus profiling library"
DESCRIPTION = "This package provides the Haskell dbus profiling library."
LICENSE = "Apache-2.0"

PV = "1.2.28"

RPM_NAME = "ghc-dbus-prof-1.2.28-1.3.aarch64.rpm"
RPM_HASH = "e4d62017fd8bce0898d231f52905b7714b07cc25702b6802b7a3b0729e77788a3c8cda484090e57bbcfc2651f3720ec74cc7b006f85afcb0aedceeb6c77a930d"

RPROVIDES:${PN} += "ghc-dbus-prof ghc-dbus-prof(aarch-64) ghc-prof(dbus-1.2.28-27GbkRPSCRwKgi0yxoNYFh)"
RDEPENDS:${PN} += "ghc-dbus-devel ghc-prof(base-4.17.1.0) ghc-prof(bytestring-0.11.4.0) ghc-prof(cereal-0.5.8.3-LNsxCTyOF85AKtb4iLTs8f) ghc-prof(conduit-1.3.4.3-dAZVHPSYjL2zQ4RzAuWi2) ghc-prof(containers-0.6.7) ghc-prof(deepseq-1.4.8.0) ghc-prof(exceptions-0.10.5) ghc-prof(filepath-1.4.2.2) ghc-prof(lens-5.2.2-2MO0prnPqCQBRfua8fH2Ea) ghc-prof(network-3.1.2.8-HNDBp0HF6t0D1fzE2MDtPd) ghc-prof(parsec-3.1.16.1) ghc-prof(random-1.2.1.1-I0wUgAAbf0g3qHR3e8uT0o) ghc-prof(split-0.2.3.5-u3oGLAiW7JJbxIffWSCWf) ghc-prof(template-haskell-2.19.0.0) ghc-prof(text-2.0.2) ghc-prof(th-lift-0.8.3-BVnK9vFPlpnBx7d6MzGvJN) ghc-prof(transformers-0.5.6.2) ghc-prof(unix-2.7.3) ghc-prof(vector-0.13.0.0-AbjrQrWxuFpAjIHk3G7xsp) ghc-prof(xml-conduit-1.9.1.2-EG4w0oWu477B6XYo8w0Zz4) ghc-prof(xml-types-0.3.8-7guWdy0cJxZLf8pjB1j9Fb)"

inherit rpm
