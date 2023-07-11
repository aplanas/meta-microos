SUMMARY = "A Python wrapper around the OpenWeatherMap web API"
DESCRIPTION = "PyOWM is a client Python wrapper library for the OpenWeatherMap web API. \
It allows quick and easy consumption of OWM weather data from Python \
applications via a simple object model and in a human-friendly fashion."
LICENSE = "MIT"

PV = "2.10.0"

RPM_NAME = "python311-pyowm-2.10.0-1.17.noarch.rpm"
RPM_HASH = "8d415ab3e03be8deae286bd35afa2f262bf6601359f057c710a7e96f4d723e6988c184be8c407aee791745d44b2c136e15bd2662364c63ee45035541a748d1f5"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-pyowm \
python3.11dist-pyowm \
python311-pyowm \
python3dist-pyowm"

RDEPENDS:${PN} += "python-abi \
python311-geojson \
python311-requests"

inherit rpm
