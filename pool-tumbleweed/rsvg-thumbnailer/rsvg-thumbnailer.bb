SUMMARY = "SVG thumbnailer using the GNOME Render SVG library"
DESCRIPTION = "This package contains a thumbnailer to render SVG (scalable vector \
graphics) data."
LICENSE = "LGPL-2.0-or-later"

PV = "2.56.1"

RPM_NAME = "rsvg-thumbnailer-2.56.1-3.1.noarch.rpm"
RPM_HASH = "e3d425201826a8625b0274c9a92b2b9a6945cb7e2481b03232e6f2e3cd8b998a404df083d9a5f45546a3ebedc7df1ae0d6cf38e715601b402e281801c0fef6eb"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "rsvg-thumbnailer"

RDEPENDS:${PN} += ""

inherit rpm
