SUMMARY = "Python library to provide visual text-based progress to long running operations"
DESCRIPTION = "A Python Progressbar library to provide visual (yet text based) progress to long running operations."
LICENSE = "BSD-3-Clause"

PV = "4.2.0"

RPM_NAME = "python39-progressbar2-4.2.0-2.4.noarch.rpm"
RPM_HASH = "3f31ca9969a1d29163aff878f9e94857afcfc062179e2e72c1e0778938dd01b39bea2e0930122ce98142498e6308eeac1b5ce3c9afbe6f9b736d66fa5c37c732"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-progressbar2 \
python39-progressbar2 \
python3dist-progressbar2"

RDEPENDS:${PN} += "python-abi \
python39-python-utils"

inherit rpm
