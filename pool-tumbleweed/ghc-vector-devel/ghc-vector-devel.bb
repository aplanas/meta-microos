SUMMARY = "Haskell vector library development files"
DESCRIPTION = "This package provides the Haskell vector library development files."
LICENSE = "BSD-3-Clause"

PV = "0.13.0.0"

RPM_NAME = "ghc-vector-devel-0.13.0.0-3.2.aarch64.rpm"
RPM_HASH = "9ad1a6cfd49fabf77edd726ebf13608c2fd6d1dabbab2f739e3682f313d96303c2f419f8fdf8b9b01e30506155664d1e066be4b0d1c558fc673b2fb244923d6d"

RPROVIDES:${PN} += "ghc-devel-vector-0.13.0.0-2UZsZW2LfoDoE4x89R5ku \
ghc-vector-devel"

RDEPENDS:${PN} += "/usr/bin/sh \
ghc-compiler \
ghc-devel-base-4.17.2.0 \
ghc-devel-deepseq-1.4.8.0 \
ghc-devel-primitive-0.7.4.0-F2Mc1OnmlS8GBXxA9I0mgx \
ghc-devel-vector-stream-0.1.0.0-8LsAqgetBjY3tBdh3HDYEB \
ghc-vector"

inherit rpm
