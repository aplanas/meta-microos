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

RPM_NAME = "python311-arrow-1.2.3-2.1.noarch.rpm"
RPM_HASH = "ffefa9ff3227a59cd5c5ac899d1cc73bcaf75949547be623a357db17211aa8d99dbc2db08e3235e1eca287e61f82d588c36c0a0374e4e9863fffcbd6dfddfba1"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.11dist-arrow \
python311-arrow \
python3dist-arrow"

RDEPENDS:${PN} += "python-abi \
python311-python-dateutil"

inherit rpm
