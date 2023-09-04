SUMMARY = "RPM Macros for building packages for GHC"
DESCRIPTION = "A set of macros for building GHC packages following the openSUSE \
Haskell Guidelines.  ghc needs to be installed in \
order to make use of these macros."
LICENSE = "GPL-3.0-or-later"

PV = "2.5.3"

RPM_NAME = "ghc-rpm-macros-2.5.3-1.1.noarch.rpm"
RPM_HASH = "0e444027e6498a20adda6ef2bf6d1d3454cf59d53071d73338c19e3a7f57dff3c3116f5f77a271579f52a5cf143be7f903e4b9477ab1bb489741308b71270186"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "ghc-rpm-macros \
rpm-macro--ghc-doc-dir \
rpm-macro--ghcdocdir \
rpm-macro--ghclicensedir \
rpm-macro-cabal \
rpm-macro-cabal-build-options \
rpm-macro-cabal-configure \
rpm-macro-cabal-configure-options \
rpm-macro-cabal-install \
rpm-macro-cabal-install-options \
rpm-macro-cabal-pkg-conf \
rpm-macro-cabal-test \
rpm-macro-cabal-test-options \
rpm-macro-ghc-bin-build \
rpm-macro-ghc-bin-install \
rpm-macro-ghc-delete-rpaths \
rpm-macro-ghc-fix-doc-perms \
rpm-macro-ghc-fix-rpath \
rpm-macro-ghc-gen-filelists \
rpm-macro-ghc-html-dir \
rpm-macro-ghc-html-libraries-dir \
rpm-macro-ghc-html-pkg-dir \
rpm-macro-ghc-lib-build \
rpm-macro-ghc-lib-build-without-haddock \
rpm-macro-ghc-lib-install \
rpm-macro-ghc-major-version \
rpm-macro-ghc-merge-filelist \
rpm-macro-ghc-pkg-recache \
rpm-macro-ghc-pkgdocdir \
rpm-macro-ghc-prefix \
rpm-macro-ghc-quick-build \
rpm-macro-ghc-set-gcc-flags \
rpm-macro-ghc-smp-mflags \
rpm-macro-ghc-suse-disable-debug-packages \
rpm-macro-ghc-version \
rpm-macro-ghc-without-dynamic \
rpm-macro-ghcdocbasedir \
rpm-macro-ghclibdir \
rpm-macro-ghclibdocdir \
rpm-macro-ghcliblib \
rpm-macro-ghclibplatform \
rpm-macro-ghcpkgdocdir \
rpm-macro-ghcplatform \
rpm-macro-with-ghc-prof \
rpm-macro-with-haddock"

RDEPENDS:${PN} += "/usr/bin/sh \
chrpath \
rpm"

inherit rpm
