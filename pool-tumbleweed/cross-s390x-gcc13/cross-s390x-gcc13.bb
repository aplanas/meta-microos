SUMMARY = "The GNU Compiler Collection targeting s390x"
DESCRIPTION = "The GNU Compiler Collection as a cross-compiler targeting s390x. \
 \
Note this is only useful for building freestanding things like the \
kernel since it fails to include target libraries and headers."
LICENSE = "GPL-3.0-or-later"

PV = "13.2.1+git7683"

RPM_NAME = "cross-s390x-gcc13-13.2.1+git7683-1.1.aarch64.rpm"
RPM_HASH = "4c8005ab57460f90a565a168e2f8fc2c41b6eaf19c11d3fd1621b89ddaf9344f155306dbacec9c106d0d7d9227733972f864d72dea515b3d84b231810b43a6ab"

RPROVIDES:${PN} += "cross-s390x-gcc13"

RDEPENDS:${PN} += "/usr/bin/sh \
cross-s390x-binutils \
libstdc++6-devel-gcc13 \
update-alternatives"

inherit rpm
