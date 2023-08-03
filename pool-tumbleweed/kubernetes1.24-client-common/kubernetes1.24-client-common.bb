SUMMARY = "Kubernetes client tools common files"
DESCRIPTION = "Kubernetes client tools common files"
LICENSE = "Apache-2.0"

PV = "1.24.16"

RPM_NAME = "kubernetes1.24-client-common-1.24.16-1.1.aarch64.rpm"
RPM_HASH = "74bc578fd7ddb3308c95e20e05b694dc36c9fb5c64e4aaf87fd387541795c4092b0697135975779989ad1bfca987894e369bab6dd9a30f792a4761ad763c1cec"

RPROVIDES:${PN} += "kubernetes-client-common \
kubernetes1.24-client-common"

RDEPENDS:${PN} += "/usr/bin/sh \
kubernetes1.24-client"

inherit rpm
