SUMMARY = "Library to convert between binary and SI units"
DESCRIPTION = "Python library to convert between and within binary (IEC) and decimal (SI) units."
LICENSE = "Apache-2.0 | MIT"

PV = "1.0.0"

RPM_NAME = "python39-binary-1.0.0-2.8.noarch.rpm"
RPM_HASH = "68a46cde6b5ffcd4967869184976e9a897c160a26c4aac6f29c71b4c5f5e991f51663367113c77894a89d6812ef664939bd419f93b01a59779ace48a29135fc2"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist(binary) \
python39-binary \
python3dist(binary)"

RDEPENDS:${PN} += "python(abi)"

inherit rpm
