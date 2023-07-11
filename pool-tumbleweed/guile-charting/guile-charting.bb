SUMMARY = "Guile library for making charts"
DESCRIPTION = "Guile-Charting is a library to create charts and graphs in Guile. It \
is thus far a hack."
LICENSE = "LGPL-2.1-or-later"

PV = "0.2.0"

RPM_NAME = "guile-charting-0.2.0-3.12.aarch64.rpm"
RPM_HASH = "829ba22f3f25223086c292683ad49682c94291b80d982f614eccfcc9ab39e9d7318178f850e439f6b507ec27819fdbeb836bb1f96e3dd3b3e415c330de251294"

RPROVIDES:${PN} += "guile-charting"

RDEPENDS:${PN} += "/usr/bin/sh"

inherit rpm
