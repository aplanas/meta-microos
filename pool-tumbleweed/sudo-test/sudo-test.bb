SUMMARY = "Tests for the package"
DESCRIPTION = "Tests for fate#313276"
LICENSE = "ISC"

PV = "1.9.13p3"

RPM_NAME = "sudo-test-1.9.13p3-3.3.aarch64.rpm"
RPM_HASH = "b40f883f41a7bcedd88df561f7bfb0b68561cb28746c2faa82ab871bd27698c27d52efbbd5704c432894b2653e513005c8fe2a3d236c5c2e96982628d68523ae"

RPROVIDES:${PN} += "sudo-test"

RDEPENDS:${PN} += "/usr/bin/sh \
sudo"

inherit rpm
