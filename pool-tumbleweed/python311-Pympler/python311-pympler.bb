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

RPM_NAME = "python311-Pympler-1.0.1-4.3.noarch.rpm"
RPM_HASH = "dd0f81e96058b5883dcb1ad5d8c8ae0180705254b1b915ad06b80d893b119b742fc5a63017e5239fb166948af335220f1cc8d0246abac13f87354debfb0867a2"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-Pympler \
python3.11dist-pympler \
python311-Pympler \
python3dist-pympler"

RDEPENDS:${PN} += "python-abi \
python311-tk"

inherit rpm
