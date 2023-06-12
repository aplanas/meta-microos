SUMMARY = "Package for reading, writing and manipulating text-based subtitle files"
DESCRIPTION = "This is a Python package for reading, writing and manipulating \
text-based subtitle files. It is separate from the gaupol package, \
which provides a subtitle editor application with a GTK+ user \
interface."
LICENSE = "GPL-3.0-or-later"

PV = "1.12"

RPM_NAME = "python39-aeidon-1.12-1.3.noarch.rpm"
RPM_HASH = "8753a4a1062df37f9bdcf42484681cc519eba2b1e15f53a2309d8df7fe620f57b58b1cc3b83c1d09c36e211cb541fb1d9b83de3ffaef570caf37e22661a0303d"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python39-aeidon"
RDEPENDS:${PN} += "python(abi) \
typelib(Gspell)"

inherit rpm
