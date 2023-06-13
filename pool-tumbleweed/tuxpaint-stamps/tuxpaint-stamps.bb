SUMMARY = "Rubber stamps collection for Tux Paint"
DESCRIPTION = "This package contains the documentation for the 'Rubber Stamp' images \
which can be used with the 'Stamp' tool within Tux Paint."
LICENSE = "GPL-2.0-or-later"

PV = "2021.11.25"

RPM_NAME = "tuxpaint-stamps-2021.11.25-1.5.noarch.rpm"
RPM_HASH = "cfe412a306a3782ee8ae654333fde355b0bd5b2e2a65684b7e94c045563e5c5c939dfac9106962fea2e5e8ef7a0c1c7fd489bf222f9254e15204e8501a9bdebf"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tuxpaint-stamps"

RDEPENDS:${PN} += "tuxpaint-stamps-category"

inherit rpm
