SUMMARY = "A Python wrapper around the OpenWeatherMap web API"
DESCRIPTION = "PyOWM is a client Python wrapper library for the OpenWeatherMap web API. \
It allows quick and easy consumption of OWM weather data from Python \
applications via a simple object model and in a human-friendly fashion."
LICENSE = "MIT"

PV = "2.10.0"

RPM_NAME = "python311-pyowm-2.10.0-1.15.noarch.rpm"
RPM_HASH = "05e25b1d0a93f7d34d2a8ba63164fb9d20ffa4d7247ea59fa69632c914b43e3ea4f6deed98a85f7a59724c2f79de1dcc00cba2313b4b753ae3665bef505a4b80"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.11dist(pyowm) \
python311-pyowm \
python3dist(pyowm)"
RDEPENDS:${PN} += "python(abi) \
python311-geojson \
python311-requests"

inherit rpm
