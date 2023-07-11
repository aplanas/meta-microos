SUMMARY = "Core libraries for Shorewall"
DESCRIPTION = "This package contains the core libraries for Shorewall."
LICENSE = "GPL-2.0-only"

PV = "5.2.8"

RPM_NAME = "shorewall-core-5.2.8-5.1.noarch.rpm"
RPM_HASH = "3975a3253b454d2c1bd6039618e1c1e0191d89dab9b9a26d06036e08a9d7c4b0c80fccb99240383435accb8847fffdae0b04f6ecb0cc7e09ee997df5826ef833"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "shorewall-core"

RDEPENDS:${PN} += "/usr/bin/sh \
iptables \
perl-base"

inherit rpm
