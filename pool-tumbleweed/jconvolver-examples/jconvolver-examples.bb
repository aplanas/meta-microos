SUMMARY = "Configuration examples for jconvolver"
DESCRIPTION = "This package contains configuration examples for jconvolver, a convolution \
engine for JACK."
LICENSE = "GPL-2.0-or-later"

PV = "1.1.0"

RPM_NAME = "jconvolver-examples-1.1.0-1.4.noarch.rpm"
RPM_HASH = "5a875328ad03675671402383dd9df18ebbaa671bb31ae4af55d31be971f7b52f99017f0e1db9b4de4e4671b553586e4ee0dcdd822801194cc47bbc80a1a46f6a"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "jconvolver-examples"

RDEPENDS:${PN} += "jconvolver"

inherit rpm
