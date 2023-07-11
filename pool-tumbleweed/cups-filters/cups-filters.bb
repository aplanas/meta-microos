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

RPM_NAME = "cups-filters-1.28.15-3.2.aarch64.rpm"
RPM_HASH = "453439aad387607e5893e7de60a421cbf6388c51342db8248e924092569f749b56e334b68e605ee45987852ddaab720e89777a83936073a182628df524e4cbfb"

RPROVIDES:${PN} += "config-cups-filters \
cups-browsed \
cups-filters \
cups-filters-cups-browsed \
cups-filters-foomatic-rip \
cups-filters-ghostscript \
foomatic-filters \
foomatic-rip \
gstoraster \
libcupsfilters.so.1 \
libfontembed.so.1 \
postscriptdriver-fuji-xerox;docuprint-cm305-df; \
postscriptdriver-generic;pdf-printer; \
postscriptdriver-hewlett-packard;hp-color-laserjet-cm3530-mfp; \
postscriptdriver-ricoh;pdf-printer;"

RDEPENDS:${PN} += "/usr/bin/bash \
/usr/bin/sh \
cups \
ld-linux-aarch64.so.1 \
libavahi-client.so.3 \
libavahi-common.so.3 \
libavahi-glib.so.1 \
libc.so.6 \
libcups.so.2 \
libdbus-1.so.3 \
libfontconfig.so.1 \
libgcc-s.so.1 \
libgio-2.0.so.0 \
libglib-2.0.so.0 \
libgobject-2.0.so.0 \
libjpeg.so.8 \
liblcms2.so.2 \
libm.so.6 \
libpng16.so.16 \
libpoppler-cpp.so.0 \
libqpdf.so.29 \
libstdc++.so.6 \
libtiff.so.6 \
libz.so.1 \
systemd"

inherit rpm
