SUMMARY = "Libraries and Header Files to Develop Programs with iLBC Support"
DESCRIPTION = "Libraries and Header Files to Develop Programs with iLBC Support"
LICENSE = "GPL-2.0+"

PV = "3951"

RPM_NAME = "ilbc-devel-3951-122.31.aarch64.rpm"
RPM_HASH = "934e88ad783558607cc3fec13c09dc3bc78d359cbf23e697dc93e8d76312d91a4bc73d8e9d9f40d54efe40f0949b231a394ab605f47bbe04241cc67c2b3ca87f"

RPROVIDES:${PN} += "ilbc-devel"

RDEPENDS:${PN} += "libilbc0"

inherit rpm
