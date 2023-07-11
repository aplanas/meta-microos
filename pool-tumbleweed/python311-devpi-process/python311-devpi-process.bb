SUMMARY = "Programmatic API to create and use a devpi server process"
DESCRIPTION = "This package provides a programmatic API to create and use a \
devpi server process."
LICENSE = "MIT"

PV = "0.3.0"

RPM_NAME = "python311-devpi-process-0.3.0-1.3.noarch.rpm"
RPM_HASH = "248c8e900a8aa592b44689c9b291849c5d59d653e32eea2693381e894e46f5a9ca2300d398641dfd032ac6ac07bbf41869a2b69888778d302dd98eeacc9b3c8b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-devpi-process \
python3.11dist-devpi-process \
python311-devpi-process \
python3dist-devpi-process"

RDEPENDS:${PN} += "python-abi \
python311-devpi-client \
python311-devpi-server"

inherit rpm
