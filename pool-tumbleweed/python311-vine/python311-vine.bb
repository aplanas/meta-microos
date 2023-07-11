SUMMARY = "Python Promises"
DESCRIPTION = "Promises implementation for python."
LICENSE = "BSD-3-Clause"

PV = "5.0.0"

RPM_NAME = "python311-vine-5.0.0-3.3.noarch.rpm"
RPM_HASH = "a8728fb5ff42364b2d52e423b22cf59583e9b457507c7b8d46d2314ef7d14db935e412f2164bbcc046800b5fee1c1291debd511639952e3da0a41251ec143263"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-vine \
python3.11dist-vine \
python311-vine \
python3dist-vine"

RDEPENDS:${PN} += "python-abi"

inherit rpm
