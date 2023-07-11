SUMMARY = "A library for stubbing in Python"
DESCRIPTION = "Pretend is a library to make stubbing with Python easier."
LICENSE = "BSD-3-Clause"

PV = "1.0.9"

RPM_NAME = "python310-pretend-1.0.9-3.3.noarch.rpm"
RPM_HASH = "41e400ae4ceec0db9784ce66bff93d68c8d45cb108e0e7abd59f0cdf0024114e881d0ac41188780af7bb2aeaae5e6627a39b996d867c20ac78c60d79228178e2"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.10dist-pretend \
python310-pretend \
python3dist-pretend"

RDEPENDS:${PN} += "python-abi"

inherit rpm
