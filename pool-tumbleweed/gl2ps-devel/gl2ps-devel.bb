SUMMARY = "Development files for GL2PS"
DESCRIPTION = "This package provides development libraries and headers needed to build \
software using GL2PS."
LICENSE = "LGPL-2.0-or-later | SUSE-GL2PS-2.0"

PV = "1.4.2"

RPM_NAME = "gl2ps-devel-1.4.2-1.13.aarch64.rpm"
RPM_HASH = "d35a01e9037d972f1944b28f089fd76b53a8d60f663075c75aeeebae6c29e091e82669ac7abcf1b88865eba68d9ac46a15c9cdd9d556ef1f9e074557f06f7458"

RPROVIDES:${PN} += "gl2ps-devel"

RDEPENDS:${PN} += "libgl2ps1"

inherit rpm
