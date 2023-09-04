SUMMARY = "Base System"
DESCRIPTION = "This is the base runtime system.  It contains only a basic multiuser booting system. For running on real hardware, you need to add additional packages and pattern to make this pattern useful on its own."
LICENSE = "MIT"

PV = "20200505"

RPM_NAME = "patterns-base-base-20200505-42.1.aarch64.rpm"
RPM_HASH = "4f3c0f2b9a82d0a0414c785f606c35e5c993b2b90155803f57fba86d3dbd78c0ddd447f36868587804c4a78225d83ce734e5160e275a9c2335d1b33b0e09977f"

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
