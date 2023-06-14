SUMMARY = "A Python wrapper around the OpenWeatherMap web API"
DESCRIPTION = "PyOWM is a client Python wrapper library for the OpenWeatherMap web API. \
It allows quick and easy consumption of OWM weather data from Python \
applications via a simple object model and in a human-friendly fashion."
LICENSE = "MIT"

PV = "2.10.0"

RPM_NAME = "python39-pyowm-2.10.0-1.15.noarch.rpm"
RPM_HASH = "d1667e39f318ece7b8d685f40a6656e7bb421b9703d0fa724c487642542aaf4fd3aaf9d2c6671f755b530a19be8051d2769eb6dec1d0bed9e069aeb2b3a7d878"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-pyowm \
python39-pyowm \
python3dist-pyowm"

RDEPENDS:${PN} += "python-abi \
python39-geojson \
python39-requests"

inherit rpm
