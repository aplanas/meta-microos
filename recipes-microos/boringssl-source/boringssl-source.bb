SUMMARY = "Source code of BoringSSL"
DESCRIPTION = "Source files for BoringSSL implementation"
LICENSE = "OpenSSL"

PV = "20200921"

RPM_NAME = "boringssl-source-20200921-2.6.noarch.rpm"
RPM_HASH = "89ac45bc4a3c5530e58d1f314895d202f21ac366040c0dbe9816dbbbe2f7aff7bf8feca62c76501b42d06a0f0001b01f5e71f0959a24b1d3d4f1e79ccacaf0dc"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "boringssl-source"
RDEPENDS:${PN} += "/bin/bash /bin/sh /usr/bin/perl /usr/bin/python /usr/bin/python3"

inherit rpm
