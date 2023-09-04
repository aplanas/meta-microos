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

RPM_NAME = "cabal2spec-2.7.0-1.5.aarch64.rpm"
RPM_HASH = "f495234f04911f2a1303ccdce7cc65882ab1e03177c5c71ffb5ccfc7bf11a6bba56c6e02f025129e8e47250350ce259318e1503d205ec7117289f0e5637b7063"

RPROVIDES:${PN} += "cabal2spec"

RDEPENDS:${PN} += "libc.so.6 \
libffi.so.8 \
libgmp.so.10 \
libm.so.6 \
libnuma.so.1"

inherit rpm
