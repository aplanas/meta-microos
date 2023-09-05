SUMMARY = "Additional Package Documentation"
DESCRIPTION = "This package contains optional documentation provided in addition to this package's base documentation."
LICENSE = "GPL-2.0-or-later"

PV = "0.23.13"

RPM_NAME = "mpd-doc-0.23.13-2.1.noarch.rpm"
RPM_HASH = "ef9c9cbf867ab5e0d6b39e327825c6447f0455acc71786862298762fc1158c990fd0df7e98f0644b20f868f8a54c1882d70171fc4e58416a84007bd380087be7"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "mpd-doc"

RDEPENDS:${PN} += ""

inherit rpm
