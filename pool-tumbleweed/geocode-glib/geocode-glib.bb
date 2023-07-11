SUMMARY = "Convenience library for the Yahoo! Place Finder APIs"
DESCRIPTION = "The geocode-glib library is a convenience library for the Yahoo! Place \
Finder APIs, as described at http://developer.yahoo.com/geo/placefinder/ \
 \
The Place Finder web service allows to do geocoding (finding longitude \
and latitude from an address), and reverse geocoding (finding an address \
from coordinates)."
LICENSE = "LGPL-2.0-or-later"

PV = "3.26.4"

RPM_NAME = "geocode-glib-3.26.4-1.5.aarch64.rpm"
RPM_HASH = "884df6b555bd593b3032a5c3046367119a90eb39529b7e673f4590c40b4a905108efae1b0058b687ab2f14fe095889b54fe8c9e3e12497e5a285269e6c19ec16"

RPROVIDES:${PN} += "geocode-glib"

RDEPENDS:${PN} += ""

inherit rpm
