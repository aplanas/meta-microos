SUMMARY = "Minimal Appliance Base"
DESCRIPTION = "The 32bit pattern complementing minimal_base."
LICENSE = "MIT"

PV = "20200505"

RPM_NAME = "patterns-base-minimal_base-32bit-20200505-41.1.aarch64.rpm"
RPM_HASH = "792323af398518acd0a065045173a1a5dd4de8e3591c726a055a5d180b9a63f762d0db520cc60afe379ca015748bf165639d0943c8f11bca78509b297d0420a8"

RPROVIDES:${PN} += "pattern- \
patterns-base-minimal-base-32bit"

RDEPENDS:${PN} += ""

inherit rpm
