SUMMARY = "Metapackage to pull in all of python-nautilus' packages"
DESCRIPTION = "This package contains files required to build wrappers for python-nautilus."
LICENSE = "GPL-2.0-or-later"

PV = "4.0"

RPM_NAME = "python39-nautilus-devel-4.0-2.1.aarch64.rpm"
RPM_HASH = "538ae6f4ce8e4f36115c2174a4a86baeffb0f0c03bf84da0165df908979bff8d021b7c802a17ab37b3ecc0541f0347b8fb4c71fa6835a5cf74cc70b444ce9667"

RPROVIDES:${PN} += "python39-nautilus-devel"

RDEPENDS:${PN} += "python39-devel \
python39-nautilus \
python39-nautilus-common-devel"

inherit rpm
