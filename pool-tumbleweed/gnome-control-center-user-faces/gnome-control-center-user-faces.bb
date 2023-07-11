SUMMARY = "Login manager user avatars"
DESCRIPTION = "This package provides user avatars to be used by display managers"
LICENSE = "GPL-2.0-or-later"

PV = "44.3"

RPM_NAME = "gnome-control-center-user-faces-44.3-1.1.noarch.rpm"
RPM_HASH = "43946e1343d5cdd4714428610bdd86575257facef1805533903e1afbe326fdbedba143eb43aa8ebe3a06354d667fed9d6458e28b9f9eed56899d1ac819527d09"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "gnome-control-center-user-faces"

RDEPENDS:${PN} += ""

inherit rpm
