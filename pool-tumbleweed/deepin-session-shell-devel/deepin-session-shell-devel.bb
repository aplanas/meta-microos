SUMMARY = "Development tools for deepin-session-shell"
DESCRIPTION = "The deepin-session-shell-devel package contains the header files and developer \
docs for deepin-session-shell-devel."
LICENSE = "GPL-3.0+"

PV = "5.5.48"

RPM_NAME = "deepin-session-shell-devel-5.5.48-1.5.aarch64.rpm"
RPM_HASH = "be0d7927d2b1334221d46bcbb66f6fd5e8b7dda8dc244ba16ee4636a1054149c9d1f5a971476d99dd6c25029b47b2cb4734aadf9fd5fe14537f3cc2f627da7a8"

RPROVIDES:${PN} += "cmake-DdeSessionShell \
deepin-session-shell-devel"

RDEPENDS:${PN} += ""

inherit rpm
