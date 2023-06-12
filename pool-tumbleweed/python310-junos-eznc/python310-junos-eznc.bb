SUMMARY = "Junos 'EZ' automation for non-programmers"
DESCRIPTION = "Junos PyEZ is designed to provide the same capabilities as a user would have \
on the Junos CLI, but in an environment built for automation tasks. \
These capabilities include, but are not limited to: \
 \
 - Remote connectivity and management of Junos devices via NETCONF \
 - Provide 'facts' about the device \
 - Retrieve 'operational' or 'run-state' information \
 - Retrieve configuration information \
 - Make configuration changes in unstructured and structured ways \
 - Provide common utilities for tasks such as secure copy of files and \
   software updates"
LICENSE = "Apache-2.0"

PV = "2.6.7"

RPM_NAME = "python310-junos-eznc-2.6.7-1.2.noarch.rpm"
RPM_HASH = "57b4c7a31be4ef3ab606d93051b68594d70d000e68e6cd8a9382d90274230eebaa9d943bc57c2b5572827f313372c44343adc369b036fa3b8cd9e6ca6d92e2c3"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-junos-eznc \
python3.10dist(junos-eznc) \
python310-junos-eznc \
python3dist(junos-eznc)"
RDEPENDS:${PN} += "python(abi) \
python310-Jinja2 \
python310-PyYAML \
python310-lxml \
python310-ncclient \
python310-netaddr \
python310-ntc-templates \
python310-paramiko \
python310-pyparsing \
python310-pyserial \
python310-scp \
python310-six \
python310-transitions"

inherit rpm
