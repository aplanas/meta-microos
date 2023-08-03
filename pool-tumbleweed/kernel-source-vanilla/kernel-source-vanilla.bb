SUMMARY = "Vanilla Linux kernel sources with minor build fixes"
DESCRIPTION = "Vanilla Linux kernel sources with minor build fixes. \
 \
 \
Source Timestamp: 2023-07-25 04:42:30 +0000 \
GIT Revision: 55520bc826c5b1d40857ed0536eb87438cb95192 \
GIT Branch: stable"
LICENSE = "GPL-2.0-only"

PV = "6.4.6"

RPM_NAME = "kernel-source-vanilla-6.4.6-1.1.noarch.rpm"
RPM_HASH = "4cb8a258af10fea4dfa3cba567fa0578ace51fdd0cd437ae336197f2a2482f6a625d94d56d22472686b468ea1c62b611170af8761c938e0c4fb2642ca82c4b97"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "kernel-source-vanilla \
multiversion-kernel"

RDEPENDS:${PN} += "kernel-macros"

inherit rpm
