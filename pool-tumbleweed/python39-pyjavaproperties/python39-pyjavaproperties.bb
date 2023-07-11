SUMMARY = "Python library for parsing Java properties"
DESCRIPTION = "A python library for parsing Java properties files."
LICENSE = "MIT"

PV = "0.7"

RPM_NAME = "python39-pyjavaproperties-0.7-2.16.noarch.rpm"
RPM_HASH = "a7c3d559f22e8dacfd950948e4e88fad6f6661e2aa097216d17b943c845b2ce3b9b98313c6e88a8313395e80b9db9aab840949382bc91667b099aab708d7dadd"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-pyjavaproperties \
python39-pyjavaproperties \
python3dist-pyjavaproperties"

RDEPENDS:${PN} += "python-abi \
python39-base"

inherit rpm
