SUMMARY = "Python module to use libmagic"
DESCRIPTION = "This package contains the Python binding that require the magic 'file' \
interface."
LICENSE = "BSD-3-Clause & BSD-4-Clause"

PV = "5.44"

RPM_NAME = "python311-magic-5.44-2.3.aarch64.rpm"
RPM_HASH = "f3ade4e7e97095fc6ee48b49d4ea299f36e12590c06bd5038e4d1ec21c14cddf0705f3aefd82bc99521c2ac614713a6976ccfa8a1b15d4a97ed1d1882a9d3aa2"

RPROVIDES:${PN} += "python3-file-magic \
python3-magic \
python3.11dist-file-magic \
python311-file-magic \
python311-magic \
python3dist-file-magic"

RDEPENDS:${PN} += "libmagic1 \
python-abi"

inherit rpm
