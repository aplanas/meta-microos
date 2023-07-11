SUMMARY = "Jalali datetime binding for python"
DESCRIPTION = "jdatetime is the Jalali implementation of Python's datetime module."
LICENSE = "Python-2.0"

PV = "4.1.0"

RPM_NAME = "python39-jdatetime-4.1.0-1.6.noarch.rpm"
RPM_HASH = "8361cc841d8469971b160d53d7a3ee5b29d02c84e7150f6751f2516fae1e22ab4e9992b6f64026d7c0c0bdeb86b881863c4793f65be7ad17146c7997212a6438"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-jdatetime \
python39-jdatetime \
python3dist-jdatetime"

RDEPENDS:${PN} += "python-abi"

inherit rpm
