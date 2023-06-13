SUMMARY = "League Of Movable Type's 'League Gothic' font family"
DESCRIPTION = "League Gothic is a revival of an old classic, Alternate Gothic #1."
LICENSE = "OFL-1.1"

PV = "0.20121218"

RPM_NAME = "lomt-leaguegothic-fonts-0.20121218-8.7.noarch.rpm"
RPM_HASH = "2efcbd72f0d36b1cc47ca1e5bb43e9dc92efd8f71d6b08a9b30d372cdd43e94e2eb928c6e3d14e2d296a95acb8d46e569389b38e250623b1f61023e70f75e73d"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "lomt-leaguegothic-fonts"

RDEPENDS:${PN} += "/bin/sh"

inherit rpm
