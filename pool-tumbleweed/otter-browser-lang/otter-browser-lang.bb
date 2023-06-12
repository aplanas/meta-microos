SUMMARY = "Translations for package otter-browser"
DESCRIPTION = "Provides translations for the 'otter-browser' package."
LICENSE = "GPL-3.0-or-later"

PV = "1.0.03"

RPM_NAME = "otter-browser-lang-1.0.03-1.7.noarch.rpm"
RPM_HASH = "c3b8cbf2d39dd619f4180438c76f3a94aab590f3bdca6b995d899d59105c51954e199ef284add0d3f1d573d3901a63e77b9012ae74182ca8132fb61047303bfb"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "otter-browser-lang \
otter-browser-lang-all"
RDEPENDS:${PN} += "otter-browser"

inherit rpm
