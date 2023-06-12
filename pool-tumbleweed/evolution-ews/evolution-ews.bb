SUMMARY = "Exchange Connector for Evolution, compatible with Exchange 2007 and later"
DESCRIPTION = "The EWS Exchange Connector for Evolution provides a Exchange \
backend from evolution-data-server as well as plugins for Evolution \
to access Exchange features. \
 \
The EWS Exchange Connector is using the Exchange Web Services \
interface and is therefore compatible with Exchange 2007 and later. \
 \
Provides exchange connectivity for exchange server 2007 and later \
using exchange web services protocol."
LICENSE = "LGPL-2.1-only"

PV = "3.48.2"

RPM_NAME = "evolution-ews-3.48.2-1.1.aarch64.rpm"
RPM_HASH = "2da1ff65c23a4a40bcffb7355f3df1e718a86769384c746e770716d36c7e8df7fece09e308e7b64bbe9f791f783fbf261055550ea169ca7737115306da453e89"

RPROVIDES:${PN} += "evolution-ews \
evolution-ews(aarch-64) \
libcamelews-priv.so()(64bit) \
libcamelews.so()(64bit) \
libcamelmicrosoft365.so()(64bit) \
libebookbackendews.so()(64bit) \
libebookbackendmicrosoft365.so()(64bit) \
libecalbackendews.so()(64bit) \
libecalbackendmicrosoft365.so()(64bit) \
libevolution-ews.so()(64bit) \
libevolution-microsoft365.so()(64bit) \
metainfo() \
metainfo(org.gnome.Evolution-ews.metainfo.xml)"
RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libc.so.6(GLIBC_2.17)(64bit) \
libcamel-1.2.so.64()(64bit) \
libebackend-1.2.so.11()(64bit) \
libebook-1.2.so.21()(64bit) \
libebook-contacts-1.2.so.4()(64bit) \
libecal-2.0.so.2()(64bit) \
libedata-book-1.2.so.27()(64bit) \
libedata-cal-2.0.so.2()(64bit) \
libedataserver-1.2.so.27()(64bit) \
libedataserverui-1.2.so.4()(64bit) \
libemail-engine.so()(64bit) \
libevolution-calendar.so()(64bit) \
libevolution-mail-composer.so()(64bit) \
libevolution-mail-formatter.so()(64bit) \
libevolution-mail.so()(64bit) \
libevolution-shell.so()(64bit) \
libevolution-util.so()(64bit) \
libgio-2.0.so.0()(64bit) \
libglib-2.0.so.0()(64bit) \
libgobject-2.0.so.0()(64bit) \
libgtk-3.so.0()(64bit) \
libical-glib.so.3()(64bit) \
libjson-glib-1.0.so.0()(64bit) \
libjson-glib-1.0.so.0(libjson-glib-1.0.so.0)(64bit) \
libmspack.so.0()(64bit) \
libpango-1.0.so.0()(64bit) \
libsoup-3.0.so.0()(64bit) \
libxml2.so.2()(64bit) \
libxml2.so.2(LIBXML2_2.4.30)(64bit) \
libxml2.so.2(LIBXML2_2.6.0)(64bit) \
libxml2.so.2(LIBXML2_2.9.0)(64bit)"

inherit rpm
