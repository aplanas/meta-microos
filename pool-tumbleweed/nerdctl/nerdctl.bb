SUMMARY = "Docker-compatible CLI for containerd"
DESCRIPTION = "nerdctl is a Docker-compatible CLI for containerd."
LICENSE = "Apache-2.0"

PV = "1.4.0"

RPM_NAME = "nerdctl-1.4.0-1.1.aarch64.rpm"
RPM_HASH = "2c06fd36943c4821190ef1ad664ead7547d5f89b2905d91b29c42e00350938e33a9909afedb28ce96fea358b62e49432b7ffb59fb2cc443fb14cb3821f03f4bb"

RPROVIDES:${PN} += "nerdctl \
nerdctl(aarch-64)"

RDEPENDS:${PN} += "/bin/sh \
buildkit \
cni-plugins \
containerd \
iptables \
libc.so.6(GLIBC_2.34)(64bit) \
rootlesskit \
slirp4netns"

inherit rpm
