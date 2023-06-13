SUMMARY = "Client for managing kubevirt"
DESCRIPTION = "The virtctl client is a command-line utility for managing container native virtualization resources"
LICENSE = "Apache-2.0"

PV = "0.59.0"

RPM_NAME = "kubevirt-virtctl-0.59.0-3.2.aarch64.rpm"
RPM_HASH = "c72672f833a837e5e1feda39b6d4a482f15c249264b53979d9803f6303e393e34c8fa9c769577f4f5f7021d02c8d6d8b53ec38b2be73c96067326aa450261818"

RPROVIDES:${PN} += "kubevirt-virtctl \
kubevirt-virtctl(aarch-64)"

RDEPENDS:${PN} += "libc.so.6(GLIBC_2.34)(64bit)"

inherit rpm
