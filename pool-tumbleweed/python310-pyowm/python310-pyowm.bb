SUMMARY = "A Python wrapper around the OpenWeatherMap web API"
DESCRIPTION = "PyOWM is a client Python wrapper library for the OpenWeatherMap web API. \
It allows quick and easy consumption of OWM weather data from Python \
applications via a simple object model and in a human-friendly fashion."
LICENSE = "MIT"

PV = "2.10.0"

RPM_NAME = "python310-pyowm-2.10.0-1.17.noarch.rpm"
RPM_HASH = "f592327f7681255c29b2e12dbf06aed4837eadfc90177c7ebaf18dccaf19a076f4197c32da3fdccc35ce84f9e2a292f327228449418f692dd06fa8132f738758"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.10dist-pyowm \
python310-pyowm \
python3dist-pyowm"

RDEPENDS:${PN} += "python-abi \
python310-geojson \
python310-requests"

inherit rpm
