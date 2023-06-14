SUMMARY = "A YaST module for configuring VPN gateway and clients"
DESCRIPTION = "A YaST module for managing VPN gateway and client connections to secure site-to-site communication via IPSec VPN."
LICENSE = "GPL-2.0-only"

PV = "4.6.1"

RPM_NAME = "yast2-vpn-4.6.1-1.1.noarch.rpm"
RPM_HASH = "2be02197a7e4d73bd1ebe83f0de73048d72becda74f63fd9dbcd2d4e512b33b8a8281145d273a1b18ed4cd66a4bc6eec66e84b5d6067846647afee3ee5fd4d98"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "yast2-vpn"

RDEPENDS:${PN} += "/usr/bin/mkdir \
/usr/bin/touch \
fillup \
yast2 \
yast2-ruby-bindings"

inherit rpm
