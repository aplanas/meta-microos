SUMMARY = "Network UPS Tools - Documentation in HTML"
DESCRIPTION = "User manual in HTML format. \
 \
Network UPS Tools is a collection of programs which provide a common \
interface for monitoring and administering UPS hardware."
LICENSE = "GPL-2.0-or-later"

PV = "2.8.0"

RPM_NAME = "nut-doc-html-2.8.0-3.1.noarch.rpm"
RPM_HASH = "d42bf323ec54eb3268098cb1d2c036748da11f6e43c9934149c769648ad33acaf291c66e678d1b926f0d6c90f142565d024e033ac894b0ef7c4438f3dbd82148"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "nut-doc-html"

RDEPENDS:${PN} += "nut-doc-images"

inherit rpm
