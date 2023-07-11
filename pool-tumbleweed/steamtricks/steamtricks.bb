SUMMARY = "Workarounds for problems with Steam on Linux"
DESCRIPTION = "steamtricks provides workarounds for problems with Steam on Linux. \
 \
Steam primarily targets Ubuntu and not the wider base of Linux distributions. \
This has led to a number of suboptimal experiences for users not on an \
officially supported distribution. The goal of this project is to \
provide workarounds and solutions to those problems in an easy to use package. \
Currently, workarounds exist in some distribution packages and in various forums \
and the like. This project aims to be the upstream source for packaging Steam \
fixes."
LICENSE = "GPL-2.0-only"

PV = "0.3.1"

RPM_NAME = "steamtricks-0.3.1-2.3.noarch.rpm"
RPM_HASH = "3f9209f0c3611bdef5da1f50b1cb17047a8d3034a9c1609bf870e2fee8777d2a089fc61185d66e05910bcca1c02ac7e528e32b396e5881fdca23cc9ff7ac91cc"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "steamtricks"

RDEPENDS:${PN} += "/usr/bin/env \
coreutils \
findutils \
grep \
patch \
rpm \
sed \
systemd \
util-linux \
which"

inherit rpm
