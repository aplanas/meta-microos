SUMMARY = "Command pipelines for python"
DESCRIPTION = "A wrapper for subprocess which provides command pipeline functionality."
LICENSE = "BSD-3-Clause"

PV = "0.1.7.post1"

RPM_NAME = "python310-sarge-0.1.7.post1-1.4.noarch.rpm"
RPM_HASH = "b2523a13079da19c8347947814bfebb307b58779a4637c3d174e2736ff239cfce29fa3dbc05f9e7c0c9768010b18cae8e1af632b4d2130e229850cd69d6326e6"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.10dist-sarge \
python310-sarge \
python3dist-sarge"

RDEPENDS:${PN} += "python-abi"

inherit rpm
