SUMMARY = "Deepin Features installer"
DESCRIPTION = "The tool will help your to enable all feature of deepin-api and deepin-daemon. \
For Ensuring you openSUSE is in security, We remove all the dbus and policykit \
features on deepin-api and deepin-daemon. \
 \
If user dose not care about security issues, he can click 'I agree' to install \
this package. Or click 'I disagree' to exit installation."
LICENSE = "WTFPL"

PV = "1.1"

RPM_NAME = "deepin-feature-enable-1.1-1.13.aarch64.rpm"
RPM_HASH = "0ee3e1d341c0675f5ec7cd67d642fde207a79cb04e416c052d81cf68519aee8d78aeb99dde18544496e33e99ca454725484c54c91bc2e45f02a0de5600077f5d"

RPROVIDES:${PN} += "deepin-feature-enable"

RDEPENDS:${PN} += "/usr/bin/bash \
deepin-daemon-dbus \
deepin-daemon-polkit"

inherit rpm
