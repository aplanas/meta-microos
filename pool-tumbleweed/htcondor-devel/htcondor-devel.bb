SUMMARY = "Development files for HTCondor"
DESCRIPTION = "Development files for HTCondor"
LICENSE = "Apache-2.0"

PV = "9.0.16"

RPM_NAME = "htcondor-devel-9.0.16-1.3.aarch64.rpm"
RPM_HASH = "6cd55877eea983e4bd34cf1593fd408007215bfbf5290fa2ebaae6b37273707d6da376198a12f84f7debbd9dbae95681a04e6edf94c13ac39b4bb84c3a51e281"

RPROVIDES:${PN} += "htcondor-devel"

RDEPENDS:${PN} += ""

inherit rpm
