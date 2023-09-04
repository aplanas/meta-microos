SUMMARY = "Documentation for Crash"
DESCRIPTION = "This subpackage contains the crash whitepaper from Dave Anderson. \
 \
 \
 \
Authors: \
-------- \
    David Anderson <anderson@redhat.com>"
LICENSE = "GFDL-1.2-only"

PV = "8.0.3"

RPM_NAME = "crash-doc-8.0.3-2.2.aarch64.rpm"
RPM_HASH = "cfe893ee1a3842a5209d5ed6e19109c0e91fdd17551c0f41d077cae8c0abc396f9962fa0637231fe5c2d259352ffda85892a25d5e155e6f71a91f91e5dd2c4fb"

RPROVIDES:${PN} += "crash-doc"

RDEPENDS:${PN} += "crash"

inherit rpm
