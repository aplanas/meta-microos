SUMMARY = "Vehicle stamps collection for Tux Paint"
DESCRIPTION = "tuxpaint-stamps-vehicles package contains a set of 'Rubber Stamp' images \
which can be used with the 'Stamp' tool within Tux Paint."
LICENSE = "GPL-2.0-or-later"

PV = "2021.11.25"

RPM_NAME = "tuxpaint-stamps-vehicles-2021.11.25-1.5.noarch.rpm"
RPM_HASH = "ad2fb07d9c3529b17dac15e4fa5f840bfdf497f4f0714179624b4b7c90576285d04a72acd3f6cef8251ddbff46a781c98852452163bfb2a3b4e6a0a667858e9b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tuxpaint-stamps-category \
tuxpaint-stamps-vehicles"
RDEPENDS:${PN} += "tuxpaint-stamps"

inherit rpm
