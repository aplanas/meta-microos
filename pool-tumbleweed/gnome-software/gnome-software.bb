SUMMARY = "GNOME Software Store"
DESCRIPTION = "AppStore like management of Applications for your GNOME Desktop."
LICENSE = "GPL-2.0-or-later"

PV = "44.3"

RPM_NAME = "gnome-software-44.3-1.1.aarch64.rpm"
RPM_HASH = "afde69863f90cfa9001460f0b62d0ed33bf0bed9be788bc09700dca26da83388e53a8caa5af562e6da0004bbca10e862ad96a2b63383407d04837092a4a4545a"

RPROVIDES:${PN} += "gnome-software \
libgnomesoftware.so.20 \
libgs-plugin-dpkg.so \
libgs-plugin-dummy.so \
libgs-plugin-epiphany.so \
libgs-plugin-fedora-langpacks.so \
libgs-plugin-fedora-pkgdb-collections.so \
libgs-plugin-flatpak.so \
libgs-plugin-fwupd.so \
libgs-plugin-generic-updates.so \
libgs-plugin-hardcoded-blocklist.so \
libgs-plugin-icons.so \
libgs-plugin-malcontent.so \
libgs-plugin-modalias.so \
libgs-plugin-os-release.so \
libgs-plugin-provenance-license.so \
libgs-plugin-provenance.so \
libgs-plugin-repos.so \
libgs-plugin-rewrite-resource.so"

RDEPENDS:${PN} += "fwupd \
iso-codes \
ld-linux-aarch64.so.1 \
libadwaita-1.so.0 \
libappstream.so.4 \
libc.so.6 \
libcairo.so.2 \
libflatpak.so.0 \
libfwupd.so.2 \
libgdk-pixbuf-2.0.so.0 \
libgio-2.0.so.0 \
libglib-2.0.so.0 \
libgmodule-2.0.so.0 \
libgobject-2.0.so.0 \
libgtk-4.so.1 \
libgudev-1.0.so.0 \
libjson-glib-1.0.so.0 \
libm.so.6 \
libmalcontent-0.so.0 \
libostree-1.so.1 \
libpackagekit-glib2.so.18 \
libpango-1.0.so.0 \
libpolkit-gobject-1.so.0 \
libsoup-3.0.so.0 \
libxmlb.so.2"

inherit rpm
