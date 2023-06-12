SUMMARY = "Additional Package Documentation"
DESCRIPTION = "This package contains optional documentation provided in addition to this package's base documentation."
LICENSE = "GPL-2.0-or-later"

PV = "0.23.13"

RPM_NAME = "mpd-doc-0.23.13-1.2.noarch.rpm"
RPM_HASH = "0431e2a8e0497724db966a71730ec02285c44db3e2545c8be5672f013298c5c6b48f1508796051eb6daa1f327d06fa6401a6bad4fcbc701c644851c076f87c83"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "mpd-doc"
RDEPENDS:${PN} += ""

inherit rpm
