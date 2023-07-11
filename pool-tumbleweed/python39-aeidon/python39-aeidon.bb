SUMMARY = "Package for reading, writing and manipulating text-based subtitle files"
DESCRIPTION = "This is a Python package for reading, writing and manipulating \
text-based subtitle files. It is separate from the gaupol package, \
which provides a subtitle editor application with a GTK+ user \
interface."
LICENSE = "GPL-3.0-or-later"

PV = "1.12"

RPM_NAME = "python39-aeidon-1.12-1.4.noarch.rpm"
RPM_HASH = "a614464618317e6990f14babd9d4c30c8b4b8a7019e79abf51a837d55daf2e4c3101af25297d76d867a38119db4e47a51650951f764156156f02839253d178d7"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python39-aeidon"

RDEPENDS:${PN} += "python-abi \
typelib-Gspell"

inherit rpm
