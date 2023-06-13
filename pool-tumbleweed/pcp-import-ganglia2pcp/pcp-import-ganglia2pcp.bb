SUMMARY = "Performance Co-Pilot archive tools for importing ganglia data"
DESCRIPTION = "Performance Co-Pilot (PCP) front-end tools for importing ganglia data \
into standard PCP archive logs for replay with any PCP monitoring tool."
LICENSE = "LGPL-2.0+"

PV = "5.2.5"

RPM_NAME = "pcp-import-ganglia2pcp-5.2.5-3.4.aarch64.rpm"
RPM_HASH = "b693a2befc0f17658828bc80215f365d144b04bdb1637ee19dbb0532aee14343bc92f5f8047c1196b9f81443d14180c8d130ac26c061f6b3479b46af706ea170"

RPROVIDES:${PN} += "pcp-import-ganglia2pcp \
pcp-import-ganglia2pcp(aarch-64)"

RDEPENDS:${PN} += "/usr/bin/env \
perl-PCP-LogImport"

inherit rpm
