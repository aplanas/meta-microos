SUMMARY = "Links for busybox applets"
DESCRIPTION = "This is a meta package requireing all packages providing busybox applets."
LICENSE = "GPL-2.0-or-later"

PV = "1.36.1"

RPM_NAME = "busybox-links-1.36.1-30.1.noarch.rpm"
RPM_HASH = "546a24b9caa0e0a331a62967cdb661ed160d0edbde4179972304a2c9cc029f4af136f29b7b84e9fd6af17e003d5557c0db0f02fe56842706177e0bbfdcd4fd6c"
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
