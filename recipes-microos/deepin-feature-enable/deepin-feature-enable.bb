SUMMARY = "Deepin Features installer"
DESCRIPTION = "The tool will help your to enable all feature of deepin-api and deepin-daemon. \
For Ensuring you openSUSE is in security, We remove all the dbus and policykit \
features on deepin-api and deepin-daemon. \
 \
If user dose not care about security issues, he can click 'I agree' to install \
this package. Or click 'I disagree' to exit installation."
LICENSE = "WTFPL"

PV = "1.1"

RPM_NAME = "deepin-feature-enable-1.1-1.12.aarch64.rpm"
RPM_HASH = "bb75313d3919fbb3ac3ea13bf4fb3cbc5891667178042b160b7fb1ef15d4305e45e139bebb53f6e3bdb48cbd0cbd468be6e69618b791b64d14560a3271b795ef"

RPROVIDES:${PN} += "deepin-feature-enable deepin-feature-enable(aarch-64)"
RDEPENDS:${PN} += "/bin/bash deepin-daemon-dbus deepin-daemon-polkit"

inherit rpm
