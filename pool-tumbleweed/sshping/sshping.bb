SUMMARY = "SSH server auditing"
DESCRIPTION = "Utility to test the performance of interactive ssh sessions or scp file \
transfers. It uses ssh to log into a remote system, then runs two tests: the \
first test sends one character at a time, waiting for each character to be \
returned while it records the latency time for each. The second test sends a \
dummy file over scp to /dev/null on the remote system."
LICENSE = "MIT"

PV = "0.1.4+git20230317"

RPM_NAME = "sshping-0.1.4+git20230317-1.1.aarch64.rpm"
RPM_HASH = "3c00ce7414741b2614c1e7c701b506ea7ab0e7ba296cc6e6697197bd0da53660045fe6a1eeca57e20c2cfd11c32f5f29c8479949d4167086d7890e389829a1ab"

RPROVIDES:${PN} += "sshping"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libgcc-s.so.1 \
libm.so.6 \
libssh.so.4 \
libstdc++.so.6"

inherit rpm
