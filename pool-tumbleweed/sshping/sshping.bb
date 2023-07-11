SUMMARY = "SSH server auditing"
DESCRIPTION = "Utility to test the performance of interactive ssh sessions or scp file \
transfers. It uses ssh to log into a remote system, then runs two tests: the \
first test sends one character at a time, waiting for each character to be \
returned while it records the latency time for each. The second test sends a \
dummy file over scp to /dev/null on the remote system."
LICENSE = "MIT"

PV = "0.1.4+git20230317"

RPM_NAME = "sshping-0.1.4+git20230317-1.2.aarch64.rpm"
RPM_HASH = "eae9d44c4ddc568a03d1daaea030b423e3854d731558699fe69b22ed2d91c37fb38afd1db17c5d8c722bac0d9b11c0fcfc1185ef4463a3dba107523db147c434"

RPROVIDES:${PN} += "sshping"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libgcc-s.so.1 \
libm.so.6 \
libssh.so.4 \
libstdc++.so.6"

inherit rpm
