SUMMARY = "Themes for Window Maker"
DESCRIPTION = "This package contains themes for the Window Maker window manager. \
Documentation: \
 \
/usr/share/doc/packages/wmthemes"
LICENSE = "GPL-2.0+"

PV = "0.1"

RPM_NAME = "WindowMaker-themes-0.1-395.16.noarch.rpm"
RPM_HASH = "66881fbd2365221eebcdd4380f63f227613c25a7730d417701f683575db748e469a4b13bcb973ae050c0070d583e6c92e4d5ade227ec67ccfa123053374d24eb"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "WindowMaker-themes \
wmthemes"

RDEPENDS:${PN} += "WindowMaker"

inherit rpm
