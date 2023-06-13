SUMMARY = "Guile library for making charts"
DESCRIPTION = "Guile-Charting is a library to create charts and graphs in Guile. It \
is thus far a hack."
LICENSE = "LGPL-2.1-or-later"

PV = "0.2.0"

RPM_NAME = "guile-charting-0.2.0-3.11.aarch64.rpm"
RPM_HASH = "3ccbbfa6b411edf4aceb0e8015b275d95bd9934b33027ad46fa395118de28cbfadc56269709ddf2f6e9d5101b0eab6a9496236018fcab8f0262b0c9e0442bd4c"

RPROVIDES:${PN} += "guile-charting \
guile-charting(aarch-64)"

RDEPENDS:${PN} += "/bin/sh"

inherit rpm
