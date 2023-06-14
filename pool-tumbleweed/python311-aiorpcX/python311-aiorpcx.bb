SUMMARY = "Generic async RPC implementation, including JSON-RPC"
DESCRIPTION = "Generic async RPC implementation, including JSON-RPC"
LICENSE = "MIT"

PV = "0.22.1"

RPM_NAME = "python311-aiorpcX-0.22.1-1.5.noarch.rpm"
RPM_HASH = "23fb523d31cd5d2b05d455c3d502c2433de026abf63e53d65e856beb22053efb4b17e3980dba8ad1aa254069f6759612f60350f0e8ac81db8f3f1272f2781523"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.11dist-aiorpcx \
python311-aiorpcX \
python3dist-aiorpcx"

RDEPENDS:${PN} += "python-abi \
python311-attrs"

inherit rpm
