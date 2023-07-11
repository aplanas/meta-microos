SUMMARY = "RepRap STL plater"
DESCRIPTION = "Plater is a GUI tool to prepare printing plate from STL files for ReRap. \
It is a part of Printrun."
LICENSE = "GPL-3.0-or-later"

PV = "2.0.0~rc7.1599393390.c451359"

RPM_NAME = "plater-2.0.0~rc7.1599393390.c451359-3.13.noarch.rpm"
RPM_HASH = "90aa0c67efd5c35777f66a7797357bba836ee2c73055aef2a7408374b7ac5b6f78b0d856354b360bd7817fc62affd206b060aff62a3a5f07f8e9b85bbf2892d5"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "plater"

RDEPENDS:${PN} += "/usr/bin/python3 \
Printrun-common \
python3-wxPython"

inherit rpm
