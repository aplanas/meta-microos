SUMMARY = "Examples for python311-PyQt6"
DESCRIPTION = "PyQt is a set of Python bindings for the Qt framework. \
 \
This package contains programming examples for PyQt6."
LICENSE = "GPL-3.0-only | SUSE-GPL-2.0-with-FLOSS-exception | NonFree"

PV = "6.5.1"

RPM_NAME = "python311-PyQt6-doc-6.5.1-1.2.noarch.rpm"
RPM_HASH = "2be3d788fc394bf1173adb29116fbe14a642479acd8f03aebb7870913eebd84bedb1181c26031410c4aed81e7faf486025f04c1c4b27984dfe12a788ce34104b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-PyQt6-doc \
python3-qt6-doc \
python311-PyQt6-doc \
python311-qt6-doc"

RDEPENDS:${PN} += ""

inherit rpm
