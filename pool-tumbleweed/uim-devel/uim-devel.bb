SUMMARY = "Development files for the UIM input method framework"
DESCRIPTION = "Include Files and Libraries mandatory for Development with uim."
LICENSE = "BSD-3-Clause & LGPL-2.1-or-later & (BSD-3-Clause | LGPL-2.0-only)"

PV = "1.8.8"

RPM_NAME = "uim-devel-1.8.8-9.10.aarch64.rpm"
RPM_HASH = "ebda8804a5144fc9282b10eadc22b64f121530d93fe73edb9128830425a7604f04385ed617801b7f880b5ed04c59133bb79437ca4a36c5c704bf7b6cef21a355"

RPROVIDES:${PN} += "pkgconfig-uim \
uim-devel"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
uim"

inherit rpm
