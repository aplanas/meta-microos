SUMMARY = "Python library for parsing Java properties"
DESCRIPTION = "A python library for parsing Java properties files."
LICENSE = "MIT"

PV = "0.7"

RPM_NAME = "python39-pyjavaproperties-0.7-2.15.noarch.rpm"
RPM_HASH = "f76551ade00f286b2490cb4a0a0aa80b272af35d07ebc0d54d3b81ef46a50f833fd539fb2278044941dbb13491f393c1c005e6a57b4055e7f175b5f1c2cadce9"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist(pyjavaproperties) \
python39-pyjavaproperties \
python3dist(pyjavaproperties)"

RDEPENDS:${PN} += "python(abi) \
python39-base"

inherit rpm
