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

RPM_NAME = "python39-junos-eznc-2.6.7-1.2.noarch.rpm"
RPM_HASH = "43a16e2a30b425f4b62a348033e5d77acad25de7052657cbe1a0600ea3d09da5ae065e5c659a3ad47a800837cab0381771d94301c22720d097282f7dc005fc61"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-junos-eznc \
python39-junos-eznc \
python3dist-junos-eznc"

RDEPENDS:${PN} += "python-abi \
python39-Jinja2 \
python39-PyYAML \
python39-lxml \
python39-ncclient \
python39-netaddr \
python39-ntc-templates \
python39-paramiko \
python39-pyparsing \
python39-pyserial \
python39-scp \
python39-six \
python39-transitions"

inherit rpm
