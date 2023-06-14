SUMMARY = "System group kvm"
DESCRIPTION = "This package provides the system group 'kvm'."
LICENSE = "MIT"

PV = "20170617"

RPM_NAME = "system-group-kvm-20170617-24.14.noarch.rpm"
RPM_HASH = "c6a54606210874895de611f3e63a1d8e8ce4816de5603872b9f76b85ae7a62e8e834a95be587de2629df24b03e64917d90ff382c810fdbc9e14cfc6f1544abd9"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "group-kvm \
system-group-kvm"

RDEPENDS:${PN} += "/bin/sh \
sysuser-shadow"

inherit rpm
