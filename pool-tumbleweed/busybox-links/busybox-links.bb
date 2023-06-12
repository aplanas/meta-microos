SUMMARY = "Links for busybox applets"
DESCRIPTION = "This is a meta package requireing all packages providing busybox applets."
LICENSE = "GPL-2.0-or-later"

PV = "1.36.0"

RPM_NAME = "busybox-links-1.36.0-26.3.noarch.rpm"
RPM_HASH = "098c74a1484d7bca72f1da6491995a269711ca753b54f80cafee323bee0e618ad87de95646aa8e7a498d29c46390ccc1ae617528582434198ea6fc5991c80472"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "busybox-links"
RDEPENDS:${PN} += "busybox \
busybox-adduser \
busybox-attr \
busybox-bc \
busybox-bind-utils \
busybox-bzip2 \
busybox-coreutils \
busybox-cpio \
busybox-diffutils \
busybox-dos2unix \
busybox-ed \
busybox-findutils \
busybox-gawk \
busybox-grep \
busybox-gzip \
busybox-hexedit \
busybox-hostname \
busybox-iproute2 \
busybox-iputils \
busybox-kbd \
busybox-less \
busybox-man \
busybox-misc \
busybox-ncurses-utils \
busybox-net-tools \
busybox-netcat \
busybox-patch \
busybox-policycoreutils \
busybox-procps \
busybox-psmisc \
busybox-sed \
busybox-selinux-tools \
busybox-sendmail \
busybox-sh \
busybox-sha3sum \
busybox-sharutils \
busybox-syslogd \
busybox-sysvinit-tools \
busybox-tar \
busybox-telnet \
busybox-tftp \
busybox-time \
busybox-traceroute \
busybox-tunctl \
busybox-unzip \
busybox-util-linux \
busybox-vi \
busybox-vlan \
busybox-wget \
busybox-which \
busybox-whois \
busybox-xz"

inherit rpm