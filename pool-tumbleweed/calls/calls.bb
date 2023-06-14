SUMMARY = "A phone dialer and call handler"
DESCRIPTION = "A phone dialer and call handler. \
 \
Calls is also a capable sip-client."
LICENSE = "GPL-3.0-only & MIT"

PV = "44.1"

RPM_NAME = "calls-44.1-1.1.aarch64.rpm"
RPM_HASH = "ca192b276f7fe5e068792fb1e9afdbfb893320e0a61057a967de2b8f791efc6123f4e9d34b8a1909b4c1cd611e9be8d342fcbf8668e405e20f482cbe1dedba6c"

RPROVIDES:${PN} += "calls \
libdummy.so \
libmm.so \
libsip.so"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libcallaudio-0.1.so.0 \
libebook-contacts-1.2.so.4 \
libfeedback-0.0.so.0 \
libfolks.so.26 \
libgdk-3.so.0 \
libgee-0.8.so.2 \
libgio-2.0.so.0 \
libglib-2.0.so.0 \
libgobject-2.0.so.0 \
libgom-1.0.so.0 \
libgstreamer-1.0.so.0 \
libgtk-3.so.0 \
libhandy-1.so.0 \
libmm-glib.so.0 \
libpeas-1.0.so.0 \
libsecret-1.so.0 \
libsofia-sip-ua-glib.so.3 \
libsofia-sip-ua.so.0"

inherit rpm
