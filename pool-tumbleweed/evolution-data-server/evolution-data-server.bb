SUMMARY = "Evolution Data Server"
DESCRIPTION = "Evolution Data Server provides a central location for your address book \
and calendar in the GNOME Desktop."
LICENSE = "LGPL-2.0-only"

PV = "3.48.2"

RPM_NAME = "evolution-data-server-3.48.2-1.1.aarch64.rpm"
RPM_HASH = "1e0a36b1261f2e982623932ffbc75d68185239ce40df5d2122f7a302942ebf3e0dbf4072d7195fb1dff5225331ab1923b2fe7507e5a5b4367ada9de9a344229d"

RPROVIDES:${PN} += "evolution-data-server \
libcamelimapx.so \
libcamellocal.so \
libcamelnntp.so \
libcamelpop3.so \
libcamelsendmail.so \
libcamelsmtp.so \
libebookbackendcarddav.so \
libebookbackendfile.so \
libebookbackendldap.so \
libecalbackendcaldav.so \
libecalbackendcontacts.so \
libecalbackendfile.so \
libecalbackendgtasks.so \
libecalbackendhttp.so \
libecalbackendweather.so \
libecalbackendwebdavnotes.so \
libedbus-private.so"

RDEPENDS:${PN} += "/usr/bin/perl \
ld-linux-aarch64.so.1 \
libc.so.6 \
libcamel-1.2.so.64 \
libcanberra-gtk3.so.0 \
libcanberra.so.0 \
libdb-4.8.so \
libebackend-1.2.so.11 \
libebook-1.2.so.21 \
libebook-contacts-1.2.so.4 \
libecal-2.0.so.2 \
libedata-book-1.2.so.27 \
libedata-cal-2.0.so.2 \
libedataserver-1.2.so.27 \
libedataserverui-1.2.so.4 \
libgdk-3.so.0 \
libgio-2.0.so.0 \
libglib-2.0.so.0 \
libgoa-1.0.so.0 \
libgobject-2.0.so.0 \
libgtk-3.so.0 \
libgweather-4.so.0 \
libical-glib.so.3 \
libical.so.3 \
libjson-glib-1.0.so.0 \
liblber.so.2 \
libldap.so.2 \
libpango-1.0.so.0 \
libsecret-1.so.0 \
libsoup-3.0.so.0 \
libxml2.so.2 \
mozilla-nss"

inherit rpm
