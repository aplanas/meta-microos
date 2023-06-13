SUMMARY = "Development files for parlatype"
DESCRIPTION = "Parlatype ships its own library, libparlatype, which provides a GStreamer backend (PtPlayer) and a waveviewer widget (PtWaveviewer) which is a GtkWidget."
LICENSE = "GPL-3.0-or-later"

PV = "3.1"

RPM_NAME = "libparlatype-devel-3.1-1.7.aarch64.rpm"
RPM_HASH = "0b90ab9f07cf0997e32a24970a3785294fc1ad66ed15aace75353467565b3ac0a71fe107fd3c573755815ddd64bbc4f76cbe74ed03f2bdef0213e5b942910bd9"

RPROVIDES:${PN} += "libparlatype-devel \
libparlatype-devel(aarch-64) \
pkgconfig(parlatype)"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libparlatype5 \
pkgconfig(gstreamer-1.0) \
pkgconfig(gtk+-3.0)"

inherit rpm
