SUMMARY = "Documentation for OSProfiler"
DESCRIPTION = "Documentation for OSProfiler."
LICENSE = "Apache-2.0"

PV = "3.4.3"

RPM_NAME = "python-osprofiler-doc-3.4.3-1.6.noarch.rpm"
RPM_HASH = "57556a7d83393867438205b8e90d03e8133675c35fe4528e2895ee113ec058bbe5ca2e6ea7754670c34ea05805e797d2f6c244602212be8bc63bc1913b6be060"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python-osprofiler-doc"

RDEPENDS:${PN} += ""

inherit rpm
