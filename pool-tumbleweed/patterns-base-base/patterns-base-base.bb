SUMMARY = "Base System"
DESCRIPTION = "This is the base runtime system.  It contains only a basic multiuser booting system. For running on real hardware, you need to add additional packages and pattern to make this pattern useful on its own."
LICENSE = "MIT"

PV = "20200505"

RPM_NAME = "patterns-base-base-20200505-41.1.aarch64.rpm"
RPM_HASH = "f91ce360ab4c45168ec24005a807835f4c215e979b34149ac5b34809545e0bf3a8335d3aed5cf1613c0448e39513520eba9514d2018211c463967ff76ee470b3"

RPROVIDES:${PN} += "pattern- \
pattern-category- \
pattern-icon- \
pattern-order- \
pattern-visible- \
patterns-base-base \
patterns-openSUSE-base \
patterns-openSUSE-minimal"

RDEPENDS:${PN} += "aaa-base \
bash \
ca-certificates-mozilla \
coreutils \
glibc \
libnss-usrfiles2 \
pam \
pam-config \
pattern- \
purge-kernels-service \
rpm \
system-user-nobody \
systemd \
util-linux"

inherit rpm
