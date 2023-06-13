SUMMARY = "A phone dialer and call handler"
DESCRIPTION = "A phone dialer and call handler. \
 \
Calls is also a capable sip-client."
LICENSE = "GPL-3.0-only & MIT"

PV = "44.1"

RPM_NAME = "calls-44.1-1.1.aarch64.rpm"
RPM_HASH = "ca192b276f7fe5e068792fb1e9afdbfb893320e0a61057a967de2b8f791efc6123f4e9d34b8a1909b4c1cd611e9be8d342fcbf8668e405e20f482cbe1dedba6c"

RPROVIDES:${PN} += "application() \
application(org.gnome.Calls.desktop) \
calls \
calls(aarch-64) \
libdummy.so()(64bit) \
libmm.so()(64bit) \
libsip.so()(64bit) \
metainfo() \
metainfo(org.gnome.Calls.metainfo.xml) \
mimehandler(x-scheme-handler/sip) \
mimehandler(x-scheme-handler/sips) \
mimehandler(x-scheme-handler/tel)"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libc.so.6(GLIBC_2.34)(64bit) \
libcallaudio-0.1.so.0()(64bit) \
libcallaudio-0.1.so.0(LIBCALLAUDIO_0_0_0)(64bit) \
libebook-contacts-1.2.so.4()(64bit) \
libfeedback-0.0.so.0()(64bit) \
libfeedback-0.0.so.0(LIBFEEDBACK_0_0_0)(64bit) \
libfolks.so.26()(64bit) \
libgdk-3.so.0()(64bit) \
libgee-0.8.so.2()(64bit) \
libgio-2.0.so.0()(64bit) \
libglib-2.0.so.0()(64bit) \
libgobject-2.0.so.0()(64bit) \
libgom-1.0.so.0()(64bit) \
libgstreamer-1.0.so.0()(64bit) \
libgtk-3.so.0()(64bit) \
libhandy-1.so.0()(64bit) \
libhandy-1.so.0(LIBHANDY_1_0)(64bit) \
libmm-glib.so.0()(64bit) \
libpeas-1.0.so.0()(64bit) \
libsecret-1.so.0()(64bit) \
libsofia-sip-ua-glib.so.3()(64bit) \
libsofia-sip-ua.so.0()(64bit)"

inherit rpm
