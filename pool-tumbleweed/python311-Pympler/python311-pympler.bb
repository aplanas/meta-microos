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

RPM_NAME = "python311-Pympler-1.0.1-4.1.noarch.rpm"
RPM_HASH = "1a4a47c0621f29b9d41ad60b28248a11a4658ede04d696547e5252de5d96275b9604710fc836f0fa5123c50d519a1bf06d0c4329711370d1796a99f9c921147f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.11dist-pympler \
python311-Pympler \
python3dist-pympler"

RDEPENDS:${PN} += "python-abi \
python311-tk"

inherit rpm
