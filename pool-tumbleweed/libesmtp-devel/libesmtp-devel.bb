SUMMARY = "A Library for Posting Electronic Mail"
DESCRIPTION = "libESMTP is a library to manage posting (or submission of) electronic \
mail using SMTP to a preconfigured Mail Transport Agent (MTA). \
 \
This subpackage contains the API definition files."
LICENSE = "GPL-2.0-or-later & LGPL-2.1-or-later"

PV = "1.1.0"

RPM_NAME = "libesmtp-devel-1.1.0-1.4.aarch64.rpm"
RPM_HASH = "b6b7470ce2f642a7c33250c3f71ca7cf98f3a720d4e01fac1a13da67729970c3d8a37ed5c754e533201d1b04219f5e4983bd267082c961095e020e8219059594"

RPROVIDES:${PN} += "libesmtp-devel \
libesmtp-devel(aarch-64) \
pkgconfig(libesmtp-1.0)"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libesmtp6_2_0 \
pkgconfig(openssl)"

inherit rpm
