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

RPM_NAME = "gcovr-5.2-1.2.noarch.rpm"
RPM_HASH = "c4a3194eb67ae168bf1c9bf5ce7519a4df130bee701482ca74a0133e1ef0f989fe0f8083c72a730da43ce0a617314c9aeba6c9051912ec405f3026cf4a45669b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "gcovr \
python3.10dist-gcovr \
python3dist-gcovr"

RDEPENDS:${PN} += "/usr/bin/python3 \
gcc \
python-abi \
python3-Jinja2 \
python3-lxml"

inherit rpm
