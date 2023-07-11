SUMMARY = "A Django middleware that logs tracebacks of slow requests"
DESCRIPTION = "A Django middleware that logs tracebacks of slow requests and allows further inspection."
LICENSE = "LGPL-2.1-only"

PV = "1.2"

RPM_NAME = "python311-dogslow-1.2-1.16.noarch.rpm"
RPM_HASH = "07f9e6bfe88ec7aec4c5e9f7a0177dd42a7d3255e1017dc930cd841e2c24476590831c9f6783162879872d6c0b526c369ab19f9fa54b00a9057bd27e207549c4"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-dogslow \
python3.11dist-dogslow \
python311-dogslow \
python3dist-dogslow"

RDEPENDS:${PN} += "python-abi"

inherit rpm
