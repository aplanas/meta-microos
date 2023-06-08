SUMMARY = "Dropbox command line interface"
DESCRIPTION = "Dropbox is a free service that lets you bring your photos, docs, and videos anywhere \
and share them easily. Never email yourself a file again! \
 \
This package provides a basic dropbox command line interface for desktop and downloads a proprietary dropbox client."
LICENSE = "GPL-3.0-or-later & CC-BY-ND-3.0"

PV = "2020.03.04"

RPM_NAME = "dropbox-cli-2020.03.04-5.3.aarch64.rpm"
RPM_HASH = "8e588a6a0eadca0814ee63e6766b83e0cf8c0df1c7e99f5da46454bb1d079ea943515881a583d2a545c2ad2f2db6c38efacc701f101aea9849404f2e3bd4b1fb"

RPROVIDES:${PN} += "application() application(dropbox.desktop) dropbox dropbox-cli dropbox-cli(aarch-64)"
RDEPENDS:${PN} += "/usr/bin/python3 python3-gobject-Gdk python3-gpg typelib(GLib) typelib(Gdk) typelib(GdkPixbuf) typelib(Gtk) typelib(Pango)"

inherit rpm
