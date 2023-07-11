SUMMARY = "A Simple KML creator"
DESCRIPTION = "The python package simplekml was created to generate kml (or kmz). \
It was designed to alleviate the burden of having to study KML in order to \
achieve anything worthwhile with it. \
If you have a simple understanding of the structure of KML, then simplekml \
is easy to run with and create usable KML."
LICENSE = "LGPL-3.0-or-later"

PV = "1.3.6"

RPM_NAME = "python311-simplekml-1.3.6-1.4.noarch.rpm"
RPM_HASH = "a3a1635dd3c16a5985e06bafb9846fefd6c9462622599f16ad4dfe80cb5fcfa725442bae723e3cbadb04fe9262fac84124d7d9eec77cfca2b2a150259413568a"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-simplekml \
python3.11dist-simplekml \
python311-simplekml \
python3dist-simplekml"

RDEPENDS:${PN} += "python-abi"

inherit rpm
