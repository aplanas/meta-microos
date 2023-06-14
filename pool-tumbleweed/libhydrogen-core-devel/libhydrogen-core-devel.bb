SUMMARY = "Development files and headers for libhydrogen-core"
DESCRIPTION = "These are the headers needed to develop apps that \
link with libhydrogen-core."
LICENSE = "GPL-2.0-or-later"

PV = "1.2.0"

RPM_NAME = "libhydrogen-core-devel-1.2.0-1.1.aarch64.rpm"
RPM_HASH = "470daff528d8ba8bd9f36baa2a4864e01441333f7153827666a32931b2a846b7fffb62926a5d3e6533b9f1440f4fdaa9a75860a1a6f9ef7e984defc78f012fd1"

RPROVIDES:${PN} += "libhydrogen-core-devel"

RDEPENDS:${PN} += "libhydrogen-core-1-2-0"

inherit rpm
