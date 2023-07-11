SUMMARY = "X extension to control VNC module"
DESCRIPTION = "Xvnc extension allows X clients to read and change VNC configuration."
LICENSE = "GPL-2.0-only & MIT"

PV = "1.13.1"

RPM_NAME = "libXvnc-devel-1.13.1-3.3.aarch64.rpm"
RPM_HASH = "340ee1a5dd1b9950ab270c039719727393c778a7305108b08235d681a586a9af1e7b06b81ed5c2ad38de7d35d44b239a111037ffab3ca7722bef2c75e9e463a9"

RPROVIDES:${PN} += "libXvnc-devel"

RDEPENDS:${PN} += "libXvnc1"

inherit rpm
