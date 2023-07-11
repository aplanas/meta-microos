SUMMARY = "Better dates and times for Python"
DESCRIPTION = "Arrow is a Python library that offers a sensible, human-friendly \
approach to creating, manipulating, formatting and converting dates, \
times, and timestamps.  It implements and updates the datetime type, \
plugging gaps in functionality, and provides an intelligent module \
API that supports many common creation scenarios.  Simply put, it \
helps you work with dates and times with fewer imports and a lot \
less code. \
 \
Arrow is heavily inspired by moment.js and requests."
LICENSE = "Apache-2.0"

PV = "1.2.3"

RPM_NAME = "python311-arrow-1.2.3-2.2.noarch.rpm"
RPM_HASH = "2c3c3bc8cd66ec6312d07bb872ab3c3e5f640f90ff4b26d75ca1545eeed1d4d6bbe28a8e8a08ac1092e0cfbdb5474d99ca1937702d484113bf7c70595f6dc3a8"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-arrow \
python3.11dist-arrow \
python311-arrow \
python3dist-arrow"

RDEPENDS:${PN} += "python-abi \
python311-python-dateutil"

inherit rpm
