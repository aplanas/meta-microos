SUMMARY = "Busybox applets replacing netcat"
DESCRIPTION = "This package contains the symlinks to provide nc with busybox."
LICENSE = "GPL-2.0-or-later"

PV = "1.36.0"

RPM_NAME = "busybox-netcat-1.36.0-26.3.noarch.rpm"
RPM_HASH = "a91369e9698b6820ca21376ade9752b3bfa0930538b64416bd218663948dba2f313daf281d5da49c757695dfb6c65145ab5d88088ae420af2155195d663bd3ab"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "busybox-netcat"

RDEPENDS:${PN} += "busybox"

inherit rpm
