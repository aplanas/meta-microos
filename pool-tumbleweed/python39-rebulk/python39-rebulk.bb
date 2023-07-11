SUMMARY = "Library for defining bulk search patterns to perform advanced string matching"
DESCRIPTION = "ReBulk is a Python library that performs advanced searches in \
strings that would be hard to implement using the re module or \
String methods only. \
 \
It includes some features like Patterns, Match, Rule that \
allow building a custom and complex string matcher."
LICENSE = "MIT"

PV = "3.2.0"

RPM_NAME = "python39-rebulk-3.2.0-1.4.noarch.rpm"
RPM_HASH = "87e89a870d39f4967608210ca5a16ac92db552a7fa722ed85bb67ecee3db1324265943cadfe59ecd375ccc891043dde9ca08efc110bfeb0105438774b5703e0d"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-rebulk \
python39-rebulk \
python3dist-rebulk"

RDEPENDS:${PN} += "python-abi"

inherit rpm
