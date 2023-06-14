SUMMARY = "A Simple KML creator"
DESCRIPTION = "The python package simplekml was created to generate kml (or kmz). \
It was designed to alleviate the burden of having to study KML in order to \
achieve anything worthwhile with it. \
If you have a simple understanding of the structure of KML, then simplekml \
is easy to run with and create usable KML."
LICENSE = "LGPL-3.0-or-later"

PV = "1.3.6"

RPM_NAME = "python311-simplekml-1.3.6-1.3.noarch.rpm"
RPM_HASH = "38ae7299047e94cc1d6884db7f171ea8cc5fa23a8690d9bf375e6bbca84fc08c27fd0e526ff293820d754e8d886b73a47850dd82f73da06c8d64c9a2d9292462"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.11dist-simplekml \
python311-simplekml \
python3dist-simplekml"

RDEPENDS:${PN} += "python-abi"

inherit rpm
