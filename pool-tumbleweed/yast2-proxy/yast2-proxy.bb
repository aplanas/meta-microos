SUMMARY = "YaST2 - Proxy Configuration"
DESCRIPTION = "This package contains the YaST2 component for proxy configuration."
LICENSE = "GPL-2.0-or-later"

PV = "4.6.0"

RPM_NAME = "yast2-proxy-4.6.0-1.1.noarch.rpm"
RPM_HASH = "c6454938ad1ea3f188f654c15bf63b3bc06667abc326a845bfd65d4b9cd568ccbfa9992f3187a4c20b653d8df5ee4f87643b017c64afdbc1303a7577441fbe14"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "yast2-proxy"

RDEPENDS:${PN} += "yast2 \
yast2-ruby-bindings"

inherit rpm
