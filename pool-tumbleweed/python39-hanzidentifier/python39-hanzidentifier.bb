SUMMARY = "Python module that identifies Chinese text as Simplified or Traditional"
DESCRIPTION = "Python module that identifies Chinese text as Simplified or Traditional."
LICENSE = "MIT"

PV = "1.1.0"

RPM_NAME = "python39-hanzidentifier-1.1.0-2.3.noarch.rpm"
RPM_HASH = "87dbf9949ef592945291a7457ceed6e667d441b4ff0a0c1f17abb4d9a48519def0638f52f6f58db4627a7298d1df36d8ecf30da3c3037bbce1f5d7306498bd6e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-hanzidentifier \
python39-hanzidentifier \
python3dist-hanzidentifier"

RDEPENDS:${PN} += "python-abi \
python39-zhon"

inherit rpm
