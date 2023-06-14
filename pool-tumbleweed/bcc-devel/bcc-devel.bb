SUMMARY = "Header files for the BPF Compiler Collection"
DESCRIPTION = "Headers and pkg-config build descriptions for developing BCC programs."
LICENSE = "Apache-2.0"

PV = "0.26.0"

RPM_NAME = "bcc-devel-0.26.0-2.10.aarch64.rpm"
RPM_HASH = "1f42962ede1f325e5cbe185f1cbfb714dbd251b9c503ed9860f88902a660094f2545aab2170bbfebbe5e94a9dbe5c2c0a5a4691411852bc8a5043aceca3213eb"

RPROVIDES:${PN} += "bcc-devel \
pkgconfig-libbcc"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libbcc0"

inherit rpm
