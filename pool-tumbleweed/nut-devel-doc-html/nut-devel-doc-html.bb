SUMMARY = "Network UPS Tools - Documentation in HTML"
DESCRIPTION = "Developer manual in HTML format. \
 \
Network UPS Tools is a collection of programs which provide a common \
interface for monitoring and administering UPS hardware."
LICENSE = "GPL-2.0-or-later"

PV = "2.8.0"

RPM_NAME = "nut-devel-doc-html-2.8.0-4.1.noarch.rpm"
RPM_HASH = "05a4428721542dc840bb820bad59ce6167ecaadc2d23754de242320944e00357b21a751841e14857460277b66c5186a6a0d4793b993c7c121f6e037ad6a56cbe"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "nut-devel-doc-html"

RDEPENDS:${PN} += "nut-doc-html \
nut-doc-images"

inherit rpm
