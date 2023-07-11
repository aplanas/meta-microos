SUMMARY = "A tool to analyze the memory behavior of Python objects"
DESCRIPTION = "Pympler is a development tool to measure, monitor and analyze the \
memory behavior of Python objects in a running Python application. \
 \
By pympling a Python application, detailed insight in the size and \
the lifetime of Python objects can be obtained.  Undesirable or \
unexpected runtime behavior like memory bloat and other 'pymples' \
can easily be identified."
LICENSE = "Apache-2.0"

PV = "1.0.1"

RPM_NAME = "python39-Pympler-1.0.1-4.3.noarch.rpm"
RPM_HASH = "804e6a26dda5fe64846c989c1ecc538769ca4711f7924677740b5940f6e0e534f307263fcfce51ae2853872285cb268b3eca52af738f520abcc999c1327eb645"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-pympler \
python39-Pympler \
python3dist-pympler"

RDEPENDS:${PN} += "python-abi \
python39-tk"

inherit rpm
