SUMMARY = "Documentation for the OpenStack DNS as a Service - Client"
DESCRIPTION = "Documentation for the OpenStack DNS as a Service - Client."
LICENSE = "Apache-2.0"

PV = "4.5.0"

RPM_NAME = "python-designateclient-doc-4.5.0-1.4.noarch.rpm"
RPM_HASH = "d7fe4ca3a3cac5daa2fefdb29b34d2bbae44859c57e3586234df4be1f4b1e6a6a00dd3f7c1a1e9ca24c0a0f684000c8e2b045460d8b3a5f73c2fee8377e02599"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python-designateclient-doc"

RDEPENDS:${PN} += ""

inherit rpm
