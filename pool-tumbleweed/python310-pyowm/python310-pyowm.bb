SUMMARY = "A Python wrapper around the OpenWeatherMap web API"
DESCRIPTION = "PyOWM is a client Python wrapper library for the OpenWeatherMap web API. \
It allows quick and easy consumption of OWM weather data from Python \
applications via a simple object model and in a human-friendly fashion."
LICENSE = "MIT"

PV = "2.10.0"

RPM_NAME = "python310-pyowm-2.10.0-1.15.noarch.rpm"
RPM_HASH = "7ad98d85e78c51e4a9fb2a605c3e950e37b80d1f297c736f53d871900650ef76a9069558919c626ec571ebdd2a95d20f1fa6eee262aca6b98a3fb7dcec5eea44"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-pyowm \
python3.10dist-pyowm \
python310-pyowm \
python3dist-pyowm"

RDEPENDS:${PN} += "python-abi \
python310-geojson \
python310-requests"

inherit rpm
