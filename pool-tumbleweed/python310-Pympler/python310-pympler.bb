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

RPM_NAME = "python310-Pympler-1.0.1-4.3.noarch.rpm"
RPM_HASH = "6799330d24a96277b6975d0f98fa16327452927bc632d266feafa29d08337af870b33bc754623662f9c43311b97bc68715837335a4fa0329b58c350c99407465"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.10dist-pympler \
python310-Pympler \
python3dist-pympler"

RDEPENDS:${PN} += "python-abi \
python310-tk"

inherit rpm
