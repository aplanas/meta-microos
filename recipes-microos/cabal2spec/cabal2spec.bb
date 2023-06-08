SUMMARY = "Convert Cabal files into rpm spec files"
DESCRIPTION = "Convert Cabal files into a \
<http://ftp.rpm.org/max-rpm/s1-rpm-build-creating-spec-file.html spec file> \
suitable for building the package with the RPM package manager. This tool \
primarily targets the <http://www.suse.com/ SUSE> and <http://www.opensuse.org \
openSUSE> familiy of distributions. Support for other RPM-based distributions \
is currently not available. Check out \
<http://hackage.haskell.org/package/cabal-rpm cabal-rpm> if you need this."
LICENSE = "GPL-3.0-or-later"

PV = "2.7.0"

RPM_NAME = "cabal2spec-2.7.0-1.2.aarch64.rpm"
RPM_HASH = "e955d5b5d079eec8f10bedfb0f19bae8317c5120b8ee7d79c316373813fbb84c30566b0117f8487a82b8c486f3a25b7abde37d38e6ad97817c4da441272aa564"

RPROVIDES:${PN} += "cabal2spec cabal2spec(aarch-64)"
RDEPENDS:${PN} += "libatomic.so.1()(64bit) libc.so.6(GLIBC_2.34)(64bit) libffi.so.8()(64bit) libffi.so.8(LIBFFI_BASE_8.0)(64bit) libffi.so.8(LIBFFI_CLOSURE_8.0)(64bit) libgmp.so.10()(64bit) libm.so.6()(64bit) libm.so.6(GLIBC_2.17)(64bit) libm.so.6(GLIBC_2.27)(64bit) libm.so.6(GLIBC_2.29)(64bit) libnuma.so.1()(64bit) libnuma.so.1(libnuma_1.1)(64bit) libnuma.so.1(libnuma_1.2)(64bit)"

inherit rpm
