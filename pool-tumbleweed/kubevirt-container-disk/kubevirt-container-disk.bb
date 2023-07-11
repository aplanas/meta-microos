SUMMARY = "Container disk for kubevirt"
DESCRIPTION = "The containter-disk package provides a container disk functionality for kubevirt"
LICENSE = "Apache-2.0"

PV = "0.59.2"

RPM_NAME = "kubevirt-container-disk-0.59.2-1.1.aarch64.rpm"
RPM_HASH = "b225edf14e3b83799ac65fd7b72400a51faa43d5a32ed9d53c64b734c126d4ca2cb601e2b7a37f7113928aa955d39ff7c8bf6f9db96561ab87139fd329986dd6"

RPROVIDES:${PN} += "kubevirt-container-disk"

RDEPENDS:${PN} += ""

inherit rpm
