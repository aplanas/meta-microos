SUMMARY = "Python module to parse human-readable date/time text"
DESCRIPTION = "A Python module to parse human-readable date/time strings."
LICENSE = "Apache-2.0"

PV = "2.6"

RPM_NAME = "python310-parsedatetime-2.6-3.3.noarch.rpm"
RPM_HASH = "f13e7f5a83eb2ffcc06d777f09798c38c5bb2aeaafbb01118785fcf9c75ebd8a7659e18e68a6105923741b0efa3befab9f7e3eedbaf20af97eb74da1e422ca40"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.10dist-parsedatetime \
python310-parsedatetime \
python3dist-parsedatetime"

RDEPENDS:${PN} += "python-abi"

inherit rpm
