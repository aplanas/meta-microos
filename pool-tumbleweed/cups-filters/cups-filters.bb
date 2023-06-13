SUMMARY = "OpenPrinting CUPS filters, backends, and cups-browsed"
DESCRIPTION = "Contains backends, filters, and other software \
that was once part of the core CUPS distribution \
but is no longer maintained by Apple Inc. \
In addition it contains additional filters \
and software developed independently of Apple, \
especially filters for the PDF-centric printing \
workflow introduced by OpenPrinting and a daemon \
to browse broadcasts of remote CUPS printers \
and makes these printers available locally. \
Since Ghostscript version 9.10 the CUPS filters \
gstoraster and gstopxl are removed from Ghostscript. \
Those filters are now provided by cups-filters. \
Since cups-filters version 1.0.42 foomatic-rip \
is also provided by cups-filters. \
Since CUPS >= 1.6 the CUPS Browsing functionality \
is dropped in CUPS. The OpenPrinting cups-browsed \
is a daemon running in parallel to the CUPS daemon \
to provide again basic CUPS Browsing functionality. \
This way basic CUPS Browsing works on clients \
with CUPS >= 1.6 when there are remote CUPS servers \
of CUPS version 1.5 and older in the network. \
Load-balancing (what CUPS <= 1.5 did via implicit classes) \
is not supported with cups-browsed."
LICENSE = "GPL-2.0-only & GPL-2.0-or-later & GPL-3.0-only & MIT"

PV = "1.28.15"

RPM_NAME = "cups-filters-1.28.15-3.1.aarch64.rpm"
RPM_HASH = "b319c2905e4b0b54caac2462c34bea5629bb8ebc4cf3f0b5b328a1dd293c4047b4416368626f70f0925f67302a5c87c3155b8582c98f2c27924682e56eaec5d4"

RPROVIDES:${PN} += "config(cups-filters) \
cups-browsed \
cups-filters \
cups-filters(aarch-64) \
cups-filters-cups-browsed \
cups-filters-foomatic-rip \
cups-filters-ghostscript \
foomatic-filters \
foomatic-rip \
gstoraster \
libcupsfilters.so.1()(64bit) \
libfontembed.so.1()(64bit) \
postscriptdriver(fuji_xerox;docuprint_cm305_df;) \
postscriptdriver(generic;pdf_printer;) \
postscriptdriver(hewlett-packard;hp_color_laserjet_cm3530_mfp;) \
postscriptdriver(ricoh;pdf_printer;)"

RDEPENDS:${PN} += "/bin/bash \
/bin/sh \
cups \
ld-linux-aarch64.so.1()(64bit) \
libavahi-client.so.3()(64bit) \
libavahi-common.so.3()(64bit) \
libavahi-glib.so.1()(64bit) \
libc.so.6()(64bit) \
libcups.so.2()(64bit) \
libdbus-1.so.3()(64bit) \
libdbus-1.so.3(LIBDBUS_1_3)(64bit) \
libfontconfig.so.1()(64bit) \
libgcc_s.so.1()(64bit) \
libgio-2.0.so.0()(64bit) \
libglib-2.0.so.0()(64bit) \
libgobject-2.0.so.0()(64bit) \
libjpeg.so.8()(64bit) \
liblcms2.so.2()(64bit) \
libm.so.6()(64bit) \
libpng16.so.16()(64bit) \
libpng16.so.16(PNG16_0)(64bit) \
libpoppler-cpp.so.0()(64bit) \
libqpdf.so.29()(64bit) \
libqpdf.so.29(LIBQPDF_29)(64bit) \
libstdc++.so.6()(64bit) \
libtiff.so.6()(64bit) \
libz.so.1()(64bit) \
systemd"

inherit rpm
