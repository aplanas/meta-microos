SUMMARY = "A configurable email client"
DESCRIPTION = "Claws Mail (previously known as Sylpheed-Claws) is a \
configurable email client and news reader based on the GTK+ GUI \
toolkit, and it runs on the X Window System. \
 \
When claws-mail is executed for the first time, a configuration 'wizard' \
(dialog) will appear prompting you for the minimum information necessary to \
create a new account."
LICENSE = "GPL-3.0-or-later"

PV = "4.1.1"

RPM_NAME = "claws-mail-4.1.1-2.3.aarch64.rpm"
RPM_HASH = "aa53a3b87e54b59c93de7dc928f32d3f85a085cd65b03b8d7e17303997655b98f7e4563208f16ee86167a2458b547d3f3d4436a700ff851e784915b32dccea32"

RPROVIDES:${PN} += "application() \
application(claws-mail.desktop) \
claws-mail \
claws-mail(aarch-64) \
claws-mail-extra-plugins \
claws-mail-extra-plugins-lang \
config(claws-mail) \
libravatar.so()(64bit) \
mimehandler(x-scheme-handler/mailto) \
sylpheed-claws"

RDEPENDS:${PN} += "/bin/bash \
/bin/sh \
/usr/bin/perl \
/usr/bin/python3 \
ld-linux-aarch64.so.1()(64bit) \
libICE.so.6()(64bit) \
libSM.so.6()(64bit) \
libX11.so.6()(64bit) \
libarchive.so.13()(64bit) \
libc.so.6()(64bit) \
libcairo.so.2()(64bit) \
libcanberra-gtk3.so.0()(64bit) \
libcanberra.so.0()(64bit) \
libcompface.so.1()(64bit) \
libcurl.so.4()(64bit) \
libdbus-glib-1.so.2()(64bit) \
libenchant-2.so.2()(64bit) \
libetpan \
libetpan.so.20()(64bit) \
libexpat.so.1()(64bit) \
libgdata.so.22()(64bit) \
libgdk-3.so.0()(64bit) \
libgdk_pixbuf-2.0.so.0()(64bit) \
libgio-2.0.so.0()(64bit) \
libglib-2.0.so.0()(64bit) \
libgmodule-2.0.so.0()(64bit) \
libgnutls.so.30()(64bit) \
libgnutls.so.30(GNUTLS_3_4)(64bit) \
libgobject-2.0.so.0()(64bit) \
libgpg-error.so.0()(64bit) \
libgpgme.so.11()(64bit) \
libgtk-3.so.0()(64bit) \
libical.so.3()(64bit) \
liblber.so.2()(64bit) \
libldap.so.2()(64bit) \
libnettle.so.8()(64bit) \
libnettle.so.8(NETTLE_8)(64bit) \
libnotify.so.4()(64bit) \
libpango-1.0.so.0()(64bit) \
libpangocairo-1.0.so.0()(64bit) \
libperl.so()(64bit) \
libpoppler-glib.so.8()(64bit) \
libpython3.10.so.1.0()(64bit) \
librsvg-2.so.2()(64bit) \
libstartup-notification-1.so.0()(64bit) \
libwebkit2gtk-4.0.so.37()(64bit) \
libz.so.1()(64bit) \
perl \
pinentry-dialog \
python3-gobject"

inherit rpm
