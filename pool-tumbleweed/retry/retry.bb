SUMMARY = "A simple tool for retrying command executions in plain POSIX sh"
DESCRIPTION = "A simple tool for retrying command executions in plain POSIX sh."
LICENSE = "MIT"

PV = "1655407786.7ff7de5"

RPM_NAME = "retry-1655407786.7ff7de5-1.3.noarch.rpm"
RPM_HASH = "5e762ec36be91ffad234b607e9e43576a5fa2541f86f2c60ec007134fdb8c7deade5c6a85d21b24399c0c058d2fa20eba080386d4e968d190cd368af5ad0adb7"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "retry"
RDEPENDS:${PN} += "/bin/sh"

inherit rpm
