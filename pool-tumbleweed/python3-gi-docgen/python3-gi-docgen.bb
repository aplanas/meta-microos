SUMMARY = "A documentation generator for GObject-based libraries"
DESCRIPTION = "GI-DocGen is a document generator for GObject-based libraries. \
GObject is the base type system of the GNOME project. GI-Docgen \
reuses the introspection data generated by GObject-based libraries \
to generate the API reference of these libraries, as well as other \
ancillary documentation."
LICENSE = "(Apache-2.0 | GPL-3.0-or-later) & CC0-1.0 & MIT & OFL-1.1"

PV = "2023.1"

RPM_NAME = "python3-gi-docgen-2023.1-2.1.noarch.rpm"
RPM_HASH = "86869bdbf30a6ffee9f64b6e866bb920b43b0efea131a3bc0c577ee8d02088b8c0349d334a1491fcc9e6c941bb6bb769efd2849bf41770f0c6eb530fb921db1b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "pkgconfig-gi-docgen \
python3-gi-docgen \
python3.11dist-gi-docgen \
python3dist-gi-docgen"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
/usr/bin/python3 \
python-abi \
python3-Jinja2 \
python3-Markdown \
python3-MarkupSafe \
python3-Pygments \
python3-typogrify"

inherit rpm
