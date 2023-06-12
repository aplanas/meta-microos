SUMMARY = "A portable interface for writing games"
DESCRIPTION = "ClanLib delivers a platform independent interface to write games with."
LICENSE = "Zlib"

PV = "4.1.0"

RPM_NAME = "clanlib-devel-4.1.0-2.10.aarch64.rpm"
RPM_HASH = "43c1a4e62fdaaa11a78d85d42b61a46ee86005b6de4130289c41b689211c68a092df156ed9c30a24e22a94fe3f36bdd71ecd1ca6988993eab4cec86dd529b9fa"

RPROVIDES:${PN} += "clanlib-devel \
clanlib-devel(aarch-64) \
pkgconfig(clanApp-4.1) \
pkgconfig(clanCore-4.1) \
pkgconfig(clanDisplay-4.1) \
pkgconfig(clanGL-4.1) \
pkgconfig(clanNetwork-4.1) \
pkgconfig(clanSound-4.1) \
pkgconfig(clanUI-4.1) \
pkgconfig(clanXML-4.1)"
RDEPENDS:${PN} += "/usr/bin/pkg-config \
c++_compiler \
clanlib \
pkgconfig(alsa) \
pkgconfig(fontconfig) \
pkgconfig(gl) \
pkgconfig(x11)"

inherit rpm
