SUMMARY = "A journaling, incremental, deduplicating archiver"
DESCRIPTION = "zpaq is a journaling, incremental, deduplicating archiver. \
'Journaling' means that when you update a file or directory, both the \
old and new versions are saved and can be extracted. 'Incremental' \
means that only those files whose last-modified date has changed \
since the previous backup are added. For 100 GB of files, this \
typically takes 1-2 minutes, vs. a few hours to create the first \
version. 'Deduplicating' means that identical files or fragments are \
stored only once to save time and space."
LICENSE = "SUSE-Public-Domain & MIT"

PV = "7.15"

RPM_NAME = "zpaq-7.15-3.10.aarch64.rpm"
RPM_HASH = "416e9102c1f61fdab6951a24c1887ac42aea50c525f7532a0d0a2a6cfee2dc457e58e2e2f43e0f61168f715e656083be322cbc1524806d2acde3a9135a2ac4a0"

RPROVIDES:${PN} += "zpaq"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libgcc-s.so.1 \
libstdc++.so.6"

inherit rpm
