SUMMARY = "JSON module for Guile"
DESCRIPTION = "Guile-json is JSON module for Guile. It supports parsing and building \
JSON documents according to the http:://json.org specification. These \
are the main features: \
 \
- Strictly complies to http://json.org specification. \
- Build JSON documents programmatically via macros. \
- Unicode support for strings. \
- Allows JSON pretty printing."
LICENSE = "GPL-3.0-or-later"

PV = "4.7.3"

RPM_NAME = "guile-json-4.7.3-1.1.aarch64.rpm"
RPM_HASH = "70d6beae54c63bc96833b30d2b2f07218ef2dbc370a999d43eb0f646b58826e7cf7936e000cdbe6b67e9fbcb41ce3c36098371132bfa019b4f4f6b56d1fae4e2"

RPROVIDES:${PN} += "guile-json"

RDEPENDS:${PN} += "guile"

inherit rpm
