SUMMARY = "RADOS object class development kit"
DESCRIPTION = "This package contains libraries and headers needed to develop RADOS object \
class plugins."
LICENSE = "LGPL-2.1 & LGPL-3.0 & CC-BY-SA-3.0 & GPL-2.0 & BSL-1.0 & BSD-3-Clause & MIT"

PV = "16.2.13.66+g54799ee0666"

RPM_NAME = "rados-objclass-devel-16.2.13.66+g54799ee0666-3.1.aarch64.rpm"
RPM_HASH = "650344133d401095ecfb25addda7f6651a0d760ae45e97fde9653870fad0b9f2395ef08b96b551a1eacd438b15332610726aed28f2fec5bdbc9d3e8e369951d3"

RPROVIDES:${PN} += "rados-objclass-devel"

RDEPENDS:${PN} += "libradospp-devel"

inherit rpm
