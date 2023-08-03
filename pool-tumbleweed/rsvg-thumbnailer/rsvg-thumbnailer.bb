SUMMARY = "SVG thumbnailer using the GNOME Render SVG library"
DESCRIPTION = "This package contains a thumbnailer to render SVG (scalable vector \
graphics) data."
LICENSE = "LGPL-2.0-or-later"

PV = "2.56.3"

RPM_NAME = "rsvg-thumbnailer-2.56.3-1.1.noarch.rpm"
RPM_HASH = "e95c53e1306e5d0aff915171634a2574bdca3a99c8faf3fed7ab2a6569aae55102376fb88c4a01900d14fe2f4b7020ed11958293a8b375fe1e11da3accb73654"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "rsvg-thumbnailer"

RDEPENDS:${PN} += ""

inherit rpm
