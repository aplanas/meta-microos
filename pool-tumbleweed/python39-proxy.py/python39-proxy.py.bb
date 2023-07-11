SUMMARY = "TLS interception capable proxy server"
DESCRIPTION = "Fast, Lightweight, Pluggable, TLS interception capable proxy server \
focused on Network monitoring, controls & Application development, testing, debugging. \
 \
Note: On SUSE distributions, the command is installed as proxy-py not as proxy."
LICENSE = "BSD-3-Clause"

PV = "2.4.3"

RPM_NAME = "python39-proxy.py-2.4.3-1.4.noarch.rpm"
RPM_HASH = "ea00612dacb3e144ec6bdaf0d9dbf788fabb083362b9614987e376b44a00d9376a516543d0533c39cac79ea7249f86299a010b8f729927ba64e13a9f918c0df0"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-proxy.py \
python39-proxy.py \
python3dist-proxy.py"

RDEPENDS:${PN} += "/usr/bin/python3.9 \
/usr/bin/sh \
python-abi \
update-alternatives"

inherit rpm
