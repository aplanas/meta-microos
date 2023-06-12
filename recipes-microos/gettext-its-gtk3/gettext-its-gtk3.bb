SUMMARY = "International Tag Set for GTK+ 3"
DESCRIPTION = "This package enhances gettext with an International Tag Set for GTK+ 3"
LICENSE = "LGPL-2.1-or-later"

PV = "3.24.38"

RPM_NAME = "gettext-its-gtk3-3.24.38-1.1.noarch.rpm"
RPM_HASH = "0fb35589920ff4b9359e14473e19f2701a067ed8247f787a899e33cd07516c03c88862497b3cf1d875857f3984a19e08e2a38ca95ab5627a62bca0d6c5c8ef3e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "gettext-its-gtk3"
RDEPENDS:${PN} += ""

inherit rpm
