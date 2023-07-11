SUMMARY = "top(1) like utility for Ceph Filesystem"
DESCRIPTION = "This package provides a top(1) like utility to display Ceph Filesystem metrics \
in realtime."
LICENSE = "LGPL-2.1 & LGPL-3.0 & CC-BY-SA-3.0 & GPL-2.0 & BSL-1.0 & BSD-3-Clause & MIT"

PV = "16.2.13.66+g54799ee0666"

RPM_NAME = "cephfs-top-16.2.13.66+g54799ee0666-3.1.noarch.rpm"
RPM_HASH = "0f61eabc2c8a6c0349eb89e2b452edb2618f31a263796f60863ca4512e3a5644f8dccdd0b026ae45476937c1fd67b895fa6959933d4e6e898f99dd871d977bfb"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "cephfs-top \
python3.11dist-cephfs-top \
python3dist-cephfs-top"

RDEPENDS:${PN} += "/usr/bin/python3.11 \
python3-rados"

inherit rpm
