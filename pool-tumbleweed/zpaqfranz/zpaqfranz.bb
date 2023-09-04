SUMMARY = "A journaling, incremental, deduplicating archiver"
DESCRIPTION = "Swiss army knife for backup and disaster recovery, like 7z or RAR on steroids,with deduplicated 'snapshots' (versions). Conceptually similar to Mac time machine, but much more efficiently."
LICENSE = "SUSE-Public-Domain & MIT"

PV = "58.8"

RPM_NAME = "zpaqfranz-58.8-1.1.aarch64.rpm"
RPM_HASH = "ac1e72ca479ef0b305f0675ecd9a4f8fc5b496825e805ef1e1cb7195db46007c2c8579e2f8a4640f9273da8d79b8d97f977055792038e4736369b304671987ba"

RPROVIDES:${PN} += "zpaqfranz"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libgcc-s.so.1 \
libm.so.6 \
libstdc++.so.6"

inherit rpm
