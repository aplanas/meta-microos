SUMMARY = "Evolution Data Server"
DESCRIPTION = "Evolution Data Server provides a central location for your address book \
and calendar in the GNOME Desktop."
LICENSE = "LGPL-2.0-only"

PV = "3.48.1"

RPM_NAME = "evolution-data-server-3.48.1-1.1.aarch64.rpm"
RPM_HASH = "02cb15b963325ee3af5078db1f130cbeee23214b8f748c4a432416c45b50d34e10e2f3c4df46ae8242266d3027a3a735b05db89a9477c6622cadff1199152254"

RPROVIDES:${PN} += "application() application(org.gnome.Evolution-alarm-notify.desktop) evolution-data-server evolution-data-server(aarch-64) libcamelimapx.so()(64bit) libcamellocal.so()(64bit) libcamelnntp.so()(64bit) libcamelpop3.so()(64bit) libcamelsendmail.so()(64bit) libcamelsmtp.so()(64bit) libebookbackendcarddav.so()(64bit) libebookbackendfile.so()(64bit) libebookbackendldap.so()(64bit) libecalbackendcaldav.so()(64bit) libecalbackendcontacts.so()(64bit) libecalbackendfile.so()(64bit) libecalbackendgtasks.so()(64bit) libecalbackendhttp.so()(64bit) libecalbackendweather.so()(64bit) libecalbackendwebdavnotes.so()(64bit) libedbus-private.so()(64bit)"
RDEPENDS:${PN} += "/usr/bin/perl ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libc.so.6(GLIBC_2.34)(64bit) libcamel-1.2.so.64()(64bit) libcanberra-gtk3.so.0()(64bit) libcanberra.so.0()(64bit) libdb-4.8.so()(64bit) libebackend-1.2.so.11()(64bit) libebook-1.2.so.21()(64bit) libebook-contacts-1.2.so.4()(64bit) libecal-2.0.so.2()(64bit) libedata-book-1.2.so.27()(64bit) libedata-cal-2.0.so.2()(64bit) libedataserver-1.2.so.27()(64bit) libedataserverui-1.2.so.4()(64bit) libgdk-3.so.0()(64bit) libgio-2.0.so.0()(64bit) libglib-2.0.so.0()(64bit) libgoa-1.0.so.0()(64bit) libgobject-2.0.so.0()(64bit) libgtk-3.so.0()(64bit) libgweather-4.so.0()(64bit) libical-glib.so.3()(64bit) libical.so.3()(64bit) libjson-glib-1.0.so.0()(64bit) libjson-glib-1.0.so.0(libjson-glib-1.0.so.0)(64bit) liblber.so.2()(64bit) liblber.so.2(OPENLDAP_2.200)(64bit) libldap.so.2()(64bit) libldap.so.2(OPENLDAP_2.200)(64bit) libpango-1.0.so.0()(64bit) libsecret-1.so.0()(64bit) libsoup-3.0.so.0()(64bit) libxml2.so.2()(64bit) libxml2.so.2(LIBXML2_2.4.30)(64bit) libxml2.so.2(LIBXML2_2.6.0)(64bit) libxml2.so.2(LIBXML2_2.9.0)(64bit) mozilla-nss"

inherit rpm
