SUMMARY = "Hardware identification and configuration data"
DESCRIPTION = "hwdata contains various hardware identification and configuration data, \
such as the pci.ids and usb.ids databases."
LICENSE = "GPL-2.0-or-later"

PV = "0.370"

RPM_NAME = "hwdata-0.370-1.1.noarch.rpm"
RPM_HASH = "d20de9bc758684fd8e229483473f2024db7caf335bbb5e615de5119bb1c7af881fafb17254319ef468183bfa7fbd56171b8b1ebb1fb1a32a1a60c3e5602d16c7"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "hwdata \
pciutils-ids \
pkgconfig(hwdata)"
RDEPENDS:${PN} += "/bin/sh \
/usr/bin/perl \
/usr/bin/pkg-config \
coreutils \
perl"

inherit rpm
