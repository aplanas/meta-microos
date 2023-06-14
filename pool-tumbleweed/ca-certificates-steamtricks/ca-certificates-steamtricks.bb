SUMMARY = "Provides /etc/ssl/certs/ca-certificates.crt"
DESCRIPTION = "Provides /etc/ssl/certs/ca-certificates.crt as required by certain proprietary \
software. \
 \
This package was created as part of a workaround by steamtricks."
LICENSE = "GPL-2.0"

PV = "1"

RPM_NAME = "ca-certificates-steamtricks-1-1.14.noarch.rpm"
RPM_HASH = "390aead907c9cbf0084649760453bf13b60f6c06fb9c1365ab64f5d6aa396eccb3d80773534bf75bcfea39c0a84e12133b302fc944b96c2acc0570871b03887d"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "ca-certificates-steamtricks \
steamtricks-data-252950-Rocket-League"

RDEPENDS:${PN} += "/bin/bash \
/bin/sh \
ca-certificates \
coreutils"

inherit rpm
