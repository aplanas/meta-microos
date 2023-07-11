SUMMARY = "Package for reading, writing and manipulating text-based subtitle files"
DESCRIPTION = "This is a Python package for reading, writing and manipulating \
text-based subtitle files. It is separate from the gaupol package, \
which provides a subtitle editor application with a GTK+ user \
interface."
LICENSE = "GPL-3.0-or-later"

PV = "1.12"

RPM_NAME = "python311-aeidon-1.12-1.4.noarch.rpm"
RPM_HASH = "d0cac5ed4eb67139457c94d56c76325593ce4edbb69a1e7ef15126ecc3159f86582c32f25d8b35130c6f5b55637978981aa51c50b81c8701ebfa16e79b9dcdb7"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-aeidon \
python311-aeidon"

RDEPENDS:${PN} += "python-abi \
typelib-Gspell"

inherit rpm
