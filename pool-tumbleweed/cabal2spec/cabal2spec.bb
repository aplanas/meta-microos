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

RPROVIDES:${PN} += "cabal2spec"

RDEPENDS:${PN} += "libatomic.so.1 \
libc.so.6 \
libffi.so.8 \
libgmp.so.10 \
libm.so.6 \
libnuma.so.1"

inherit rpm
