SUMMARY = "A X11 client Go bindings"
DESCRIPTION = "it is a X11 protocol go language binding."
LICENSE = "GPL-3.0+"

PV = "0.6.9"

RPM_NAME = "deepin-x11-client-0.6.9-1.7.aarch64.rpm"
RPM_HASH = "650ad7e4307bc9058f9731eaf60cd6ea84bd7f484dac496e18120787fbd6cfe78462584f50dd37cfcacf3a244ca14dfbf80346a3b1389c8509ede91ec16147ca"

RPROVIDES:${PN} += "deepin-x11-client deepin-x11-client(aarch-64)"
RDEPENDS:${PN} += ""

inherit rpm
