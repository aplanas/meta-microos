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

RPM_NAME = "python39-Pympler-1.0.1-4.1.noarch.rpm"
RPM_HASH = "2e4742692d9510c810b82cfd153108a98c4ec2e51f438f5ebe3f8f2c0b007fdd76dddd5d3ac7de0a05a97a8322159b2a7c3677fdf233028486cfef8fdfb917ee"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist(pympler) \
python39-Pympler \
python3dist(pympler)"

RDEPENDS:${PN} += "python(abi) \
python39-tk"

inherit rpm
