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

RPM_NAME = "cabal2spec-2.7.0-1.4.aarch64.rpm"
RPM_HASH = "ca5698cced384d0ad8a8f306ca20e0bcdab17755d8bffccfda0da92bbe53ac546c06d287c811fa749fe27a5f82c154f3f2857c653c8780e432122969f7dff614"

RPROVIDES:${PN} += "cabal2spec"

RDEPENDS:${PN} += "libc.so.6 \
libffi.so.8 \
libgmp.so.10 \
libm.so.6 \
libnuma.so.1"

inherit rpm
