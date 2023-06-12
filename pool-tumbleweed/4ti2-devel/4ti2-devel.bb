SUMMARY = "Development files for 4ti2"
DESCRIPTION = "This subpackage contains the include files and library links for \
developing against 4ti2's libraries."
LICENSE = "GPL-2.0-or-later"

PV = "1.6.10"

RPM_NAME = "4ti2-devel-1.6.10-1.1.aarch64.rpm"
RPM_HASH = "610f2edb0fe5fdc51626c05115ebe14be3bc18f2627f1b76eef19954af398aac24e033c92c8dde241b470636eb7a7a50c9f450a55e07d925686e135551523a4f"

RPROVIDES:${PN} += "4ti2-devel \
4ti2-devel(aarch-64)"
RDEPENDS:${PN} += "lib4ti2-0 \
libzsolve0"

inherit rpm
