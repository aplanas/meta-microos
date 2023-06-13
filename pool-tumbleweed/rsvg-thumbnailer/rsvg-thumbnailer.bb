SUMMARY = "SVG thumbnailer using the GNOME Render SVG library"
DESCRIPTION = "This package contains a thumbnailer to render SVG (scalable vector \
graphics) data."
LICENSE = "LGPL-2.0-or-later"

PV = "2.56.1"

RPM_NAME = "rsvg-thumbnailer-2.56.1-1.1.noarch.rpm"
RPM_HASH = "9df6e7b62d0fa9fec033b5cdb36394c39b19f66e6abdd915267e218d5c55933d9dadfe55ea9959be7f35b7da246968cc7fbd5c0de3d53ce0c120061f9fd6ea6d"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "rsvg-thumbnailer"

RDEPENDS:${PN} += ""

inherit rpm
