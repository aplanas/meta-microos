SUMMARY = "The Integrated GNOME Mail, Calendar, and Address Book Suite"
DESCRIPTION = "Evolution consists of modular components (at the moment: mailer, \
calendar, and address book) that should make daily life easier. Because \
of the modular design, it is possible to plug new components into \
Evolution or embed the existing ones in other applications."
LICENSE = "CC-BY-SA-3.0 & LGPL-2.0-only & LGPL-3.0-only & OLDAP-2.8 & GFDL-1.1-only & GFDL-1.3-only"

PV = "3.48.4"

RPM_NAME = "evolution-3.48.4-1.1.aarch64.rpm"
RPM_HASH = "53b5c9eb804d5b01f3cd4a3284aa02b864fa133a93849d7c2827a3f53e202b858ec3eaf1dbf24ecdc81f5921dd26d8abe4c57f90abdb6c4f98f864e0ae68895e"

RPROVIDES:${PN} += "evolution \
libcamelrss.so \
libeabutil.so \
libeabwidgets.so \
libecontacteditor.so \
libecontactlisteditor.so \
libecontactprint.so \
libemail-engine.so \
libessmime.so \
libevolution-addressbook-importers.so \
libevolution-calendar-importers.so \
libevolution-calendar.so \
libevolution-mail-composer.so \
libevolution-mail-formatter.so \
libevolution-mail-importers.so \
libevolution-mail.so \
libevolution-shell.so \
libevolution-smime.so \
libevolution-util.so \
libewebextension.so \
libgnomecanvas.so \
liborg-gnome-dbx-import.so \
liborg-gnome-email-custom-header.so \
liborg-gnome-evolution-attachment-reminder.so \
liborg-gnome-evolution-bbdb.so \
liborg-gnome-evolution-sender-validation.so \
liborg-gnome-external-editor.so \
liborg-gnome-face.so \
liborg-gnome-mail-notification.so \
liborg-gnome-mail-to-task.so \
liborg-gnome-mailing-list-actions.so \
liborg-gnome-prefer-plain.so \
liborg-gnome-publish-calendar.so \
liborg-gnome-save-calendar.so \
liborg-gnome-templates.so"

RDEPENDS:${PN} += "evolution-data-server \
ld-linux-aarch64.so.1 \
libatk-1.0.so.0 \
libc.so.6 \
libcairo-gobject.so.2 \
libcairo.so.2 \
libcamel-1.2.so.64 \
libcanberra.so.0 \
libcmark.so.0.30.3 \
libebook-1.2.so.21 \
libebook-contacts-1.2.so.4 \
libecal-2.0.so.2 \
libedataserver-1.2.so.27 \
libedataserverui-1.2.so.4 \
libenchant-2.so.2 \
libgailutil-3.so.0 \
libgdk-3.so.0 \
libgdk-pixbuf-2.0.so.0 \
libgeocode-glib-2.so.0 \
libgio-2.0.so.0 \
libglib-2.0.so.0 \
libgmodule-2.0.so.0 \
libgnome-autoar-0.so.0 \
libgnome-autoar-gtk-0.so.0 \
libgnome-desktop-3.so.20 \
libgobject-2.0.so.0 \
libgspell-1.so.2 \
libgtk-3.so.0 \
libgweather-4.so.0 \
libical-glib.so.3 \
libical.so.3 \
libicalvcal.so.3 \
libjavascriptcoregtk-4.1.so.0 \
libldap.so.2 \
libm.so.6 \
libnotify.so.4 \
libnspr4.so \
libnss3.so \
libpango-1.0.so.0 \
libpangocairo-1.0.so.0 \
libsecret-1.so.0 \
libsmime3.so \
libsoup-3.0.so.0 \
libsqlite3.so.0 \
libwebkit2gtk-4.1.so.0 \
libxml2.so.2"

inherit rpm
