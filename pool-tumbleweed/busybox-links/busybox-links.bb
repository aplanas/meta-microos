SUMMARY = "Links for busybox applets"
DESCRIPTION = "This is a meta package requireing all packages providing busybox applets."
LICENSE = "GPL-2.0-or-later"

PV = "1.36.1"

RPM_NAME = "busybox-links-1.36.1-27.1.noarch.rpm"
RPM_HASH = "7d8feb1dd6b0e3bc3fa6aaa2f1a8f7cc43c5cef35dd18d27a56fc06d75955502d349ccc0edb64febcdde0914f5ab03b6e66b1b898c8d1ec103f1263385104374"
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
