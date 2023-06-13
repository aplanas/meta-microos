SUMMARY = "Haskell file-embed library development files"
DESCRIPTION = "This package provides the Haskell file-embed library development files."
LICENSE = "BSD-2-Clause"

PV = "0.0.15.0"

RPM_NAME = "ghc-file-embed-devel-0.0.15.0-2.2.aarch64.rpm"
RPM_HASH = "1c6fb031ad992f26da9949e5a13fe8c6bbf45bd2450bb8b9b4d19b6ea2d10586b91f35a5cee06e3cf55e6d351d1cf1da0b5729ac39a8638b20dd97f214cd3e7b"

RPROVIDES:${PN} += "ghc-devel(file-embed-0.0.15.0-LJLaBgMyS4K2tBVYbzJ0uw) \
ghc-file-embed-devel \
ghc-file-embed-devel(aarch-64)"

RDEPENDS:${PN} += "/bin/sh \
ghc-compiler \
ghc-devel(base-4.17.1.0) \
ghc-devel(bytestring-0.11.4.0) \
ghc-devel(directory-1.3.7.1) \
ghc-devel(filepath-1.4.2.2) \
ghc-devel(template-haskell-2.19.0.0) \
ghc-file-embed"

inherit rpm
