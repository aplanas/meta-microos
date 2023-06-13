SUMMARY = "Container registry command line client"
DESCRIPTION = "Container registry v2 command line client and repo listing generator \
with security checks. It can be used to get and manipulate several \
informations about container images, manifestes and layers from a \
container registry including vulnerability reports and can generate a \
static website for a registry."
LICENSE = "MIT"

PV = "0.16.1"

RPM_NAME = "reg-0.16.1-1.15.aarch64.rpm"
RPM_HASH = "072cd98fed72abdb227f08ea0bbc350b14c9ec465488922437d8b2ae7458983bd945f34e3745adf3270a767258a7669b737cc806cf452a47631cb9c1835e2146"

RPROVIDES:${PN} += "reg \
reg(aarch-64)"

RDEPENDS:${PN} += "libc.so.6(GLIBC_2.34)(64bit)"

inherit rpm
