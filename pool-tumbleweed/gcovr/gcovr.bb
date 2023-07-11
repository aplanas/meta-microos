SUMMARY = "A code coverage report generator using GNU gcov"
DESCRIPTION = "Gcovr provides a utility for managing the use of the GNU gcov utility \
and generating summarized code coverage results. \
 \
This command is inspired by the Python coverage.py package, which provides \
a similar utility in Python. The gcovr command produces either compact \
human-readable summary reports, machine readable XML reports \
(in Cobertura format) or simple HTML reports. Thus, gcovr can be viewed \
as a command-line alternative to the lcov utility, which runs gcov and \
generates an HTML-formatted report."
LICENSE = "BSD-3-Clause"

PV = "5.2"

RPM_NAME = "gcovr-5.2-1.3.noarch.rpm"
RPM_HASH = "92d772d7616a45d485c7bfb3fdf4026b5fb0ca7a79ee73c213651ecc34a28b8d2313d8dba44b3a9ed62bcfdb9134eae31c9722498fdf9b4744c27be66492411b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "gcovr \
python3.11dist-gcovr \
python3dist-gcovr"

RDEPENDS:${PN} += "/usr/bin/python3 \
gcc \
python-abi \
python3-Jinja2 \
python3-lxml"

inherit rpm
