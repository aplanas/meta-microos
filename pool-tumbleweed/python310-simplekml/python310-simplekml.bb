SUMMARY = "A Simple KML creator"
DESCRIPTION = "The python package simplekml was created to generate kml (or kmz). \
It was designed to alleviate the burden of having to study KML in order to \
achieve anything worthwhile with it. \
If you have a simple understanding of the structure of KML, then simplekml \
is easy to run with and create usable KML."
LICENSE = "LGPL-3.0-or-later"

PV = "1.3.6"

RPM_NAME = "python310-simplekml-1.3.6-1.4.noarch.rpm"
RPM_HASH = "95333716969026ce5566a4133777aa42fb4a113dcf3fcbc71b051cadf22796dae42f0fb674516f49d396db784f0b331939ba2f5ca6764a66d193cd5e6b455867"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.10dist-simplekml \
python310-simplekml \
python3dist-simplekml"

RDEPENDS:${PN} += "python-abi"

inherit rpm
