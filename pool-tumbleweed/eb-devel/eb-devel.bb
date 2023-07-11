SUMMARY = "EB Header Files and Libraries"
DESCRIPTION = "EB header files and libraries."
LICENSE = "GPL-2.0+"

PV = "4.4.3"

RPM_NAME = "eb-devel-4.4.3-3.29.aarch64.rpm"
RPM_HASH = "7df3e1699df6b195dd7790f4adf2eee772571e33643b4ea332b9a4555d6203f5f4e77f8880660981db3f6c78229fe335f519b55db99ced47867a57135e83fb2e"

RPROVIDES:${PN} += "eb-devel \
ebdev"

RDEPENDS:${PN} += "eb"

inherit rpm
