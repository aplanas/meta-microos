SUMMARY = "Haskell ShellCheck library documentation"
DESCRIPTION = "This package provides the Haskell ShellCheck library documentation."
LICENSE = "GPL-3.0-or-later"

PV = "0.9.0"

RPM_NAME = "ghc-ShellCheck-doc-0.9.0-2.6.noarch.rpm"
RPM_HASH = "461fb4d5e6f8faaa122064cc4afcfdb10dc665f3860143f54f94ecf05862344aba7ef8399dbf4f552f7f3c2e12adb3a6fb62000811fa8edbe87fe680f76d0a6f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "ghc-ShellCheck-doc"

RDEPENDS:${PN} += "ghc-filesystem"

inherit rpm
