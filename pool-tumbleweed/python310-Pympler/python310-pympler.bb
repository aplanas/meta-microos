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

RPM_NAME = "python310-Pympler-1.0.1-4.1.noarch.rpm"
RPM_HASH = "4da0c4cfaa5ef702abe87dd172130d66e82b4f6041322f39fb24c6bd8e9e10b927c01e11c18fead8d47072bb22659906ccc7e3b7ef8e3d052546e46ddd3c73c5"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-Pympler \
python3.10dist(pympler) \
python310-Pympler \
python3dist(pympler)"

RDEPENDS:${PN} += "python(abi) \
python310-tk"

inherit rpm
