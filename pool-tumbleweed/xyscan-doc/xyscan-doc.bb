SUMMARY = "Documentation for xyscan"
DESCRIPTION = "xyscan is a tool for scientists in need of extracting data points, \
i.e. numeric values, from a plot. \
 \
This package contains the documentation and help files for xyscan."
LICENSE = "GPL-3.0-or-later"

PV = "4.64"

RPM_NAME = "xyscan-doc-4.64-1.7.noarch.rpm"
RPM_HASH = "81aaee1494fbcd7b27fa33104101a85955c044dfa9e82988d23442acbe9db3a98012de293e6d239b113ec6278c093af78ff348614e2f7dfdbea5d1d418ebc4c3"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "xyscan-doc"

RDEPENDS:${PN} += "xyscan"

inherit rpm
