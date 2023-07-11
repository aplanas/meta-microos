SUMMARY = "Haskell dbus profiling library"
DESCRIPTION = "This package provides the Haskell dbus profiling library."
LICENSE = "Apache-2.0"

PV = "1.2.29"

RPM_NAME = "ghc-dbus-prof-1.2.29-1.2.aarch64.rpm"
RPM_HASH = "3bd8ae8de28be564d395612b3d7f1f5f5f4b405e2a79f184c91023a514b6b197c68c785700405f14befa785f88741970f4107a5d29f1443a4bad567ac1c19124"

RPROVIDES:${PN} += "ghc-dbus-prof \
ghc-prof-dbus-1.2.29-JhRn6zoUbJw4eAvR7pzqTU"

RDEPENDS:${PN} += "ghc-dbus-devel \
ghc-prof-base-4.17.1.0 \
ghc-prof-bytestring-0.11.4.0 \
ghc-prof-cereal-0.5.8.3-LNsxCTyOF85AKtb4iLTs8f \
ghc-prof-conduit-1.3.5-EjJ71P6EbmSGTrvJLquwgr \
ghc-prof-containers-0.6.7 \
ghc-prof-deepseq-1.4.8.0 \
ghc-prof-exceptions-0.10.5 \
ghc-prof-filepath-1.4.2.2 \
ghc-prof-lens-5.2.2-1olZqltPpYqDYPXthdjXjf \
ghc-prof-network-3.1.4.0-FvtFepOtuCUH79FCWyNxIc \
ghc-prof-parsec-3.1.16.1 \
ghc-prof-random-1.2.1.1-I0wUgAAbf0g3qHR3e8uT0o \
ghc-prof-split-0.2.3.5-u3oGLAiW7JJbxIffWSCWf \
ghc-prof-template-haskell-2.19.0.0 \
ghc-prof-text-2.0.2 \
ghc-prof-th-lift-0.8.3-BVnK9vFPlpnBx7d6MzGvJN \
ghc-prof-transformers-0.5.6.2 \
ghc-prof-unix-2.7.3 \
ghc-prof-vector-0.13.0.0-AbjrQrWxuFpAjIHk3G7xsp \
ghc-prof-xml-conduit-1.9.1.3-JDYavYDcwLN29rDQLTOOon \
ghc-prof-xml-types-0.3.8-7guWdy0cJxZLf8pjB1j9Fb"

inherit rpm
