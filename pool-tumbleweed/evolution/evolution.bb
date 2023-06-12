SUMMARY = "The Integrated GNOME Mail, Calendar, and Address Book Suite"
DESCRIPTION = "Evolution consists of modular components (at the moment: mailer, \
calendar, and address book) that should make daily life easier. Because \
of the modular design, it is possible to plug new components into \
Evolution or embed the existing ones in other applications."
LICENSE = "CC-BY-SA-3.0 & LGPL-2.0-only & LGPL-3.0-only & OLDAP-2.8 & GFDL-1.1-only & GFDL-1.3-only"

PV = "3.48.2"

RPM_NAME = "evolution-3.48.2-1.1.aarch64.rpm"
RPM_HASH = "8e7a94898eb308709b2b16d0e9c5eb487987aee84de801ea54c8f25bd2a754eae705cc77cc7c0f69967ba386c1ca866d915560c9069ebb004560ed1b0b101ab2"

RPROVIDES:${PN} += "application() \
application(org.gnome.Evolution.desktop) \
evolution \
evolution(aarch-64) \
libcamelrss.so()(64bit) \
libeabutil.so()(64bit) \
libeabwidgets.so()(64bit) \
libecontacteditor.so()(64bit) \
libecontactlisteditor.so()(64bit) \
libecontactprint.so()(64bit) \
libemail-engine.so()(64bit) \
libessmime.so()(64bit) \
libevolution-addressbook-importers.so()(64bit) \
libevolution-calendar-importers.so()(64bit) \
libevolution-calendar.so()(64bit) \
libevolution-mail-composer.so()(64bit) \
libevolution-mail-formatter.so()(64bit) \
libevolution-mail-importers.so()(64bit) \
libevolution-mail.so()(64bit) \
libevolution-shell.so()(64bit) \
libevolution-smime.so()(64bit) \
libevolution-util.so()(64bit) \
libewebextension.so()(64bit) \
libgnomecanvas.so()(64bit) \
liborg-gnome-dbx-import.so()(64bit) \
liborg-gnome-email-custom-header.so()(64bit) \
liborg-gnome-evolution-attachment-reminder.so()(64bit) \
liborg-gnome-evolution-bbdb.so()(64bit) \
liborg-gnome-evolution-sender-validation.so()(64bit) \
liborg-gnome-external-editor.so()(64bit) \
liborg-gnome-face.so()(64bit) \
liborg-gnome-mail-notification.so()(64bit) \
liborg-gnome-mail-to-task.so()(64bit) \
liborg-gnome-mailing-list-actions.so()(64bit) \
liborg-gnome-prefer-plain.so()(64bit) \
liborg-gnome-publish-calendar.so()(64bit) \
liborg-gnome-save-calendar.so()(64bit) \
liborg-gnome-templates.so()(64bit) \
metainfo() \
metainfo(org.gnome.Evolution.appdata.xml) \
mimehandler(application/mbox) \
mimehandler(message/rfc822) \
mimehandler(text/calendar) \
mimehandler(text/directory) \
mimehandler(text/x-vcard) \
mimehandler(x-scheme-handler/calendar) \
mimehandler(x-scheme-handler/mailto) \
mimehandler(x-scheme-handler/memo) \
mimehandler(x-scheme-handler/task) \
mimehandler(x-scheme-handler/webcal)"
RDEPENDS:${PN} += "evolution-data-server \
ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libatk-1.0.so.0()(64bit) \
libc.so.6(GLIBC_2.34)(64bit) \
libcairo-gobject.so.2()(64bit) \
libcairo.so.2()(64bit) \
libcamel-1.2.so.64()(64bit) \
libcanberra.so.0()(64bit) \
libcmark.so.0.30.3()(64bit) \
libebook-1.2.so.21()(64bit) \
libebook-contacts-1.2.so.4()(64bit) \
libecal-2.0.so.2()(64bit) \
libedataserver-1.2.so.27()(64bit) \
libedataserverui-1.2.so.4()(64bit) \
libenchant-2.so.2()(64bit) \
libgailutil-3.so.0()(64bit) \
libgdk-3.so.0()(64bit) \
libgdk_pixbuf-2.0.so.0()(64bit) \
libgeocode-glib-2.so.0()(64bit) \
libgio-2.0.so.0()(64bit) \
libglib-2.0.so.0()(64bit) \
libgmodule-2.0.so.0()(64bit) \
libgnome-autoar-0.so.0()(64bit) \
libgnome-autoar-gtk-0.so.0()(64bit) \
libgnome-desktop-3.so.20()(64bit) \
libgobject-2.0.so.0()(64bit) \
libgspell-1.so.2()(64bit) \
libgtk-3.so.0()(64bit) \
libgweather-4.so.0()(64bit) \
libical-glib.so.3()(64bit) \
libical.so.3()(64bit) \
libicalvcal.so.3()(64bit) \
libjavascriptcoregtk-4.1.so.0()(64bit) \
libldap.so.2()(64bit) \
libldap.so.2(OPENLDAP_2.200)(64bit) \
libm.so.6()(64bit) \
libm.so.6(GLIBC_2.17)(64bit) \
libm.so.6(GLIBC_2.29)(64bit) \
libm.so.6(GLIBC_2.35)(64bit) \
libnotify.so.4()(64bit) \
libnspr4.so()(64bit) \
libnss3.so()(64bit) \
libnss3.so(NSS_3.2)(64bit) \
libnss3.so(NSS_3.3)(64bit) \
libnss3.so(NSS_3.4)(64bit) \
libnss3.so(NSS_3.5)(64bit) \
libnss3.so(NSS_3.6)(64bit) \
libpango-1.0.so.0()(64bit) \
libpangocairo-1.0.so.0()(64bit) \
libsecret-1.so.0()(64bit) \
libsmime3.so()(64bit) \
libsmime3.so(NSS_3.12.2)(64bit) \
libsmime3.so(NSS_3.2)(64bit) \
libsmime3.so(NSS_3.4)(64bit) \
libsoup-3.0.so.0()(64bit) \
libsqlite3.so.0()(64bit) \
libwebkit2gtk-4.1.so.0()(64bit) \
libxml2.so.2()(64bit) \
libxml2.so.2(LIBXML2_2.4.30)(64bit) \
libxml2.so.2(LIBXML2_2.6.0)(64bit) \
libxml2.so.2(LIBXML2_2.7.3)(64bit)"

inherit rpm
