SUMMARY = "Platform Independent File Lock in Python"
DESCRIPTION = "This package contains a single module, which implements a platform \
independent file lock in Python, which provides a simple way of \
inter-process communication."
LICENSE = "Unlicense"

PV = "3.12.0"

RPM_NAME = "python311-filelock-3.12.0-1.1.noarch.rpm"
RPM_HASH = "23b018aad9f2d13d375c74291f91e11eb257ec3567881d70d26ebc1cca72821b9e21d6303cc63fe0456adc17c180a41a754e757457d7f8d831c1a03dce724bd0"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.11dist(filelock) \
python311-filelock \
python3dist(filelock)"

RDEPENDS:${PN} += "python(abi)"

inherit rpm
