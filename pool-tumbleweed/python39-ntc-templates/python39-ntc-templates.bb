SUMMARY = "Package to return structured data from the output of network devices"
DESCRIPTION = "TextFSM is a project built by Google that takes CLI string output and passes each line through a series of regular expressions until it finds a match. The regular expressions use named capture groups to build a text table out of the significant text. The names of the capture groups are used as column headers, and the captured values are stored as rows in the table."
LICENSE = "Apache-2.0"

PV = "3.1.0"

RPM_NAME = "python39-ntc-templates-3.1.0-1.5.noarch.rpm"
RPM_HASH = "b9046cb8f713407ea39533be21651dd48acb420ed426a0e88f18c4a8a95d0a6ddb0c58e24e2b125054a08df0e496c024d91c48940b8e871d0a568db9d9440969"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-ntc-templates \
python39-ntc-templates \
python3dist-ntc-templates"

RDEPENDS:${PN} += "python-abi \
python39-textfsm"

inherit rpm
