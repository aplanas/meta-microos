SUMMARY = "Command-line tool to sign files and verify signatures"
DESCRIPTION = "Rust implementation of Minisign, a tool to sign files and verify signatures."
LICENSE = "MIT"

PV = "0.6.1+0"

RPM_NAME = "rsign2-0.6.1+0-2.7.aarch64.rpm"
RPM_HASH = "1efd5041399bc21ae93a3314d32f904d711f00a7cc094ee5705f432455eef618a4c7fdea39faf1614f9d93cd8f1e3d2a0ae87f35ade6991fcc582af2886a5af3"

RPROVIDES:${PN} += "rsign \
rsign2"

RDEPENDS:${PN} += "libc.so.6 \
libgcc-s.so.1"

inherit rpm
