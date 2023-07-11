SUMMARY = "OpenStack oslo.concurrency library"
DESCRIPTION = "The oslo.concurrency library has utilities for safely running multi-thread, \
multi-process applications using locking mechanisms and for running \
external processes. \
 \
This package contains the Python 3.x module."
LICENSE = "Apache-2.0"

PV = "5.0.1"

RPM_NAME = "python3-oslo.concurrency-5.0.1-1.3.noarch.rpm"
RPM_HASH = "237caefb85782cec158ad59ba9c90899889fb35432db0ab94f26093dde239c7fb7cc386975257507cc1c82f8dd726fc1508b114991cdbf0be83852372e01927e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-oslo.concurrency \
python3.11dist-oslo.concurrency \
python3dist-oslo.concurrency"

RDEPENDS:${PN} += "/usr/bin/python3 \
python-abi \
python3-fasteners \
python3-oslo.config \
python3-oslo.i18n \
python3-oslo.utils"

inherit rpm
