SUMMARY = "openSUSE MicroOS using Micro DNF"
DESCRIPTION = "This is the openSUSE MicroOS runtime system using the Micro DNF package manager. \
It contains only a minimal multiuser booting system."
LICENSE = "MIT"

PV = "5.0"

RPM_NAME = "patterns-microos-base-microdnf-5.0-73.1.aarch64.rpm"
RPM_HASH = "bbe2db0263df249b7cfb442b04a81e25a513852aeea6cf5bd84a5d0685aecce4387973f1ae430e29704c277cb3d0945478c4fa773b468b7926317948ef7bab92"

RPROVIDES:${PN} += "pattern- \
pattern-category- \
pattern-icon- \
pattern-order- \
pattern-visible- \
patterns-microos-base-microdnf"

RDEPENDS:${PN} += "libdnf-plugin-txnupd \
microdnf \
pattern-"

inherit rpm
