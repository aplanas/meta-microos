SUMMARY = "Package for reading, writing and manipulating text-based subtitle files"
DESCRIPTION = "This is a Python package for reading, writing and manipulating \
text-based subtitle files. It is separate from the gaupol package, \
which provides a subtitle editor application with a GTK+ user \
interface."
LICENSE = "GPL-3.0-or-later"

PV = "1.12"

RPM_NAME = "python310-aeidon-1.12-1.4.noarch.rpm"
RPM_HASH = "e1f5c70653321a845c8636d59cae13912ef7360a176ac77eb0ad9b5fe7d460f557c31c5199f380c11ab5871913240633fdef8259b3ea4b7167914f73ad28e2c3"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python310-aeidon"

RDEPENDS:${PN} += "python-abi \
typelib-Gspell"

inherit rpm
