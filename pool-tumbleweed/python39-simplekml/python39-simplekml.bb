SUMMARY = "A Simple KML creator"
DESCRIPTION = "The python package simplekml was created to generate kml (or kmz). \
It was designed to alleviate the burden of having to study KML in order to \
achieve anything worthwhile with it. \
If you have a simple understanding of the structure of KML, then simplekml \
is easy to run with and create usable KML."
LICENSE = "LGPL-3.0-or-later"

PV = "1.3.6"

RPM_NAME = "python39-simplekml-1.3.6-1.4.noarch.rpm"
RPM_HASH = "f91193640703c5d81eb0c985fdff10db7f5e7132f724dbd6fd1b14a17c7fe5898525364117c4513601f48b311cbc9594f5130ab27feff0b397988c6952890554"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-simplekml \
python39-simplekml \
python3dist-simplekml"

RDEPENDS:${PN} += "python-abi"

inherit rpm
