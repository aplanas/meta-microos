SUMMARY = "Cython implementation of PyParsing"
DESCRIPTION = "Cython implementation of PyParsing created for use in Coconut and Undebt."
LICENSE = "Apache-2.0"

PV = "2.4.7.1.2.1"

RPM_NAME = "python39-cPyparsing-2.4.7.1.2.1-1.3.aarch64.rpm"
RPM_HASH = "20a711f116a554312de8faa06770d0d504a419a3114bdcc6bb30e6362eebc7a3e30abee1b10bcfafdddf220e7b19caeae2de25a3ff837a328d23475064fb1830"

RPROVIDES:${PN} += "python3.9dist-cpyparsing \
python39-cPyparsing \
python3dist-cpyparsing"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
python-abi"

inherit rpm
