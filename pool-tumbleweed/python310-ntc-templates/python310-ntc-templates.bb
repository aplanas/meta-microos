SUMMARY = "Package to return structured data from the output of network devices"
DESCRIPTION = "TextFSM is a project built by Google that takes CLI string output and passes each line through a series of regular expressions until it finds a match. The regular expressions use named capture groups to build a text table out of the significant text. The names of the capture groups are used as column headers, and the captured values are stored as rows in the table."
LICENSE = "Apache-2.0"

PV = "3.1.0"

RPM_NAME = "python310-ntc-templates-3.1.0-1.3.noarch.rpm"
RPM_HASH = "7b16142bfabc0711c2d231b5b2374812bb652a723c883e85cf316a2f0ecc5fe27d3ef63f83c80eb3394a2458e8152c98cd56c3a8459a9b40a6f12028cdd13aec"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-ntc-templates \
python3.10dist(ntc-templates) \
python310-ntc-templates \
python3dist(ntc-templates)"

RDEPENDS:${PN} += "python(abi) \
python310-textfsm"

inherit rpm
