SUMMARY = "Command-line tool to sign files and verify signatures"
DESCRIPTION = "Rust implementation of Minisign, a tool to sign files and verify signatures."
LICENSE = "MIT"

PV = "0.6.3+0"

RPM_NAME = "rsign2-0.6.3+0-1.1.aarch64.rpm"
RPM_HASH = "41996c41c05e077118c8d034eef3d5aeda21700bcb92b793b1d6c0c0767d853d2a460c31057b41178a432830ae1932e2d809b8d01a87b0be1d6e12c172af1437"

RPROVIDES:${PN} += "rsign \
rsign2"

RDEPENDS:${PN} += "libc.so.6 \
libgcc-s.so.1"

inherit rpm
