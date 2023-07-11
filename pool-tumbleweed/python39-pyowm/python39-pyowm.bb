SUMMARY = "A Python wrapper around the OpenWeatherMap web API"
DESCRIPTION = "PyOWM is a client Python wrapper library for the OpenWeatherMap web API. \
It allows quick and easy consumption of OWM weather data from Python \
applications via a simple object model and in a human-friendly fashion."
LICENSE = "MIT"

PV = "2.10.0"

RPM_NAME = "python39-pyowm-2.10.0-1.17.noarch.rpm"
RPM_HASH = "0637de7a2b19e1f5febbfeaa4b5703ae2ba39dc60bab7785fce350856a352c95ff29adb7090b051d21a9712f3a7b1be8296c2401e7e2a276a856cc95b406c1c8"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-pyowm \
python39-pyowm \
python3dist-pyowm"

RDEPENDS:${PN} += "python-abi \
python39-geojson \
python39-requests"

inherit rpm
