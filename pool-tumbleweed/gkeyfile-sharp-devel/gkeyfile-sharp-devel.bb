SUMMARY = ".NET/C# Bindings for GKeyFile"
DESCRIPTION = "Files for developing programs that use gkeyfile-sharp"
LICENSE = "LGPL-2.1"

PV = "0.2"

RPM_NAME = "gkeyfile-sharp-devel-0.2-18.21.aarch64.rpm"
RPM_HASH = "aaadcd31a5637e04a7bc4860b8b6ccacc0a9f11075157e2d445e5871a8d44f4f7945c3462cbcd92bc496d9bd32d55f1651fb6a2aa539937c5946ea307e8230e7"

RPROVIDES:${PN} += "gkeyfile-sharp-devel \
gkeyfile-sharp-devel(aarch-64) \
pkgconfig(gkeyfile-sharp)"
RDEPENDS:${PN} += "/usr/bin/pkg-config \
gkeyfile-sharp \
pkgconfig(glib-sharp-2.0)"

inherit rpm
