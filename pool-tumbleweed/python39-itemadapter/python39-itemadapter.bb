SUMMARY = "Wrapper for data container objects"
DESCRIPTION = "The ItemAdapter class is a wrapper for data container objects, providing \
a common interface to handle objects of different types in an uniform \
manner, regardless of their underlying implementation."
LICENSE = "BSD-3-Clause"

PV = "0.7.0"

RPM_NAME = "python39-itemadapter-0.7.0-1.3.aarch64.rpm"
RPM_HASH = "2ddb9ec51d05efd376f74639cd016bb8fd4e1cfea21bbd1b0d15e0d18de1044160fd9f2a84ee19c6b2b08e8df0715af7eb4c23c3f1d5f424363ea5f13e47382f"

RPROVIDES:${PN} += "python3.9dist(itemadapter) \
python39-itemadapter \
python39-itemadapter(aarch-64) \
python3dist(itemadapter)"

RDEPENDS:${PN} += "python(abi)"

inherit rpm
