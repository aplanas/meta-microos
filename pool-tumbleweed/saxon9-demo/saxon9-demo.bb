SUMMARY = "Demos for saxon9"
DESCRIPTION = "Demonstrations and samples for saxon9."
LICENSE = "Apache-2.0 & MPL-1.0"

PV = "9.4.0.7"

RPM_NAME = "saxon9-demo-9.4.0.7-16.7.noarch.rpm"
RPM_HASH = "d816499bb588d54f77ef5a4998fe4b3cef25f49e89247418491a4de042ccae832238ead2cbb3c8e84056b312f503a51959d12ffa9a0a3580eb7fc3214cad08d6"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "saxon9-demo"

RDEPENDS:${PN} += "saxon9"

inherit rpm
