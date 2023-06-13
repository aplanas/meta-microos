SUMMARY = "Xmoto architecture independent data"
DESCRIPTION = "Xmoto translations and some other architecture independent data."
LICENSE = "GPL-2.0-or-later"

PV = "0.6.2"

RPM_NAME = "xmoto-data-0.6.2-1.3.noarch.rpm"
RPM_HASH = "cc844f6780efaf3c82c7917e0d79d91e8fad997b2c34481c0641d13bd02cbaeb5a5363af7231e946a538f2e62b96961c8b519ab6130f2cb20f70a12510d5edb9"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "xmoto-data"

RDEPENDS:${PN} += "xmoto"

inherit rpm
