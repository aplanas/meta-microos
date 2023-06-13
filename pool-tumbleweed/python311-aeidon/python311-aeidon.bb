SUMMARY = "Package for reading, writing and manipulating text-based subtitle files"
DESCRIPTION = "This is a Python package for reading, writing and manipulating \
text-based subtitle files. It is separate from the gaupol package, \
which provides a subtitle editor application with a GTK+ user \
interface."
LICENSE = "GPL-3.0-or-later"

PV = "1.12"

RPM_NAME = "python311-aeidon-1.12-1.3.noarch.rpm"
RPM_HASH = "43cbb2bcb777d13827851ad913eaaa5fa01a3a7e4408758336cfd608f7fee3e90dc89c3ec57beeaff497eeb41f17aaf2f8ff651f06db07bdfab8dc876b3c151f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python311-aeidon"

RDEPENDS:${PN} += "python(abi) \
typelib(Gspell)"

inherit rpm
