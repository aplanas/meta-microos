SUMMARY = "Package to return structured data from the output of network devices"
DESCRIPTION = "TextFSM is a project built by Google that takes CLI string output and passes each line through a series of regular expressions until it finds a match. The regular expressions use named capture groups to build a text table out of the significant text. The names of the capture groups are used as column headers, and the captured values are stored as rows in the table."
LICENSE = "Apache-2.0"

PV = "3.1.0"

RPM_NAME = "python310-ntc-templates-3.1.0-1.5.noarch.rpm"
RPM_HASH = "de7afaee58d184018ffb3e51f494a2d324c508516673b4f2bd9d88c74a7d51fa0f0abac5e654ed0a435fcdf23b05b2e42c99ba1e6b79aeb2b2270444266a29d9"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.10dist-ntc-templates \
python310-ntc-templates \
python3dist-ntc-templates"

RDEPENDS:${PN} += "python-abi \
python310-textfsm"

inherit rpm
