SUMMARY = "Packet creation and parsing module for Python"
DESCRIPTION = "A packet creation / parsing module for Python, with definitions for \
the basic TCP/IP protocols."
LICENSE = "BSD-3-Clause"

PV = "1.9.7.2"

RPM_NAME = "python311-dpkt-1.9.7.2-1.8.noarch.rpm"
RPM_HASH = "0c3556b98c27c784fcb512d424333a102d831225139f3ca270b37bd84320b119395da68d0cd161f1d91dc62d9a392d785801a780b18a1ff7cb4d580de4e7d071"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.11dist(dpkt) \
python311-dpkt \
python3dist(dpkt)"
RDEPENDS:${PN} += "python(abi)"

inherit rpm
