SUMMARY = "Japanese documentation for lxc"
DESCRIPTION = "Japanese language man pages for lxc."
LICENSE = "LGPL-2.1-or-later"

PV = "5.0.2"

RPM_NAME = "lxc-ja-doc-5.0.2-1.1.noarch.rpm"
RPM_HASH = "0f05160d25fca7e240104b186afd566705beb403978cc9dfa3263575daca2985f5fc2142818243dfb64885ea1dd958a360e31584e4d10dc27aef5ff75e9cdbc6"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "lxc-ja-doc"
RDEPENDS:${PN} += "lxc"

inherit rpm
