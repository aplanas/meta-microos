SUMMARY = "Python dependency file parser"
DESCRIPTION = "A parser for Python dependency files."
LICENSE = "MIT"

PV = "0.6.2"

RPM_NAME = "python311-dparse-0.6.2-1.3.noarch.rpm"
RPM_HASH = "2107dc6e4283378f538e18887751ba51ccc329708e92049a66918ef4e77222f2e9467de741948d9960d289060bd61436efe71aa8975efa6fd4075c2e294542ef"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.11dist-dparse \
python311-dparse \
python3dist-dparse"

RDEPENDS:${PN} += "python-abi \
python311-PyYAML \
python311-packaging"

inherit rpm
