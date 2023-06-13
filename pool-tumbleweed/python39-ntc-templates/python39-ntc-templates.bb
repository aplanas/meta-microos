SUMMARY = "Package to return structured data from the output of network devices"
DESCRIPTION = "TextFSM is a project built by Google that takes CLI string output and passes each line through a series of regular expressions until it finds a match. The regular expressions use named capture groups to build a text table out of the significant text. The names of the capture groups are used as column headers, and the captured values are stored as rows in the table."
LICENSE = "Apache-2.0"

PV = "3.1.0"

RPM_NAME = "python39-ntc-templates-3.1.0-1.3.noarch.rpm"
RPM_HASH = "8f6142908dad8aebe8c8f1716879797e899fc6af65b079c1984c9e49edce9cef39149bc480002b5fc3cf41bed0769b1af2e735b7df59091fc8f5de174272b187"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist(ntc-templates) \
python39-ntc-templates \
python3dist(ntc-templates)"

RDEPENDS:${PN} += "python(abi) \
python39-textfsm"

inherit rpm
