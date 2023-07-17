SUMMARY = "Network UPS Tools - Documentation in HTML"
DESCRIPTION = "User manual in HTML format. \
 \
Network UPS Tools is a collection of programs which provide a common \
interface for monitoring and administering UPS hardware."
LICENSE = "GPL-2.0-or-later"

PV = "2.8.0"

RPM_NAME = "nut-doc-html-2.8.0-4.1.noarch.rpm"
RPM_HASH = "8c351633f63c9950f9b538ce6e928dd787978b3b9a9a93ce94048560662ef222a663de3c646ea04f0afa40cf6292078538a6cd831a3e14c5467494e56b22c438"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "nut-doc-html"

RDEPENDS:${PN} += "nut-doc-images"

inherit rpm
