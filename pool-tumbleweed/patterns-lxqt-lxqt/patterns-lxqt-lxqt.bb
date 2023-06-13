SUMMARY = "LXQt Desktop Environment"
DESCRIPTION = "LXQt is a lightweight desktop environment based on Qt."
LICENSE = "MIT"

PV = "20220914"

RPM_NAME = "patterns-lxqt-lxqt-20220914-1.2.aarch64.rpm"
RPM_HASH = "e854b15ffe4b290ceacb200cfdb615f1cff99823e5394280e2f08a42a11a428fdfcbc4d7e2e6a1bd35a3cbffeb571e8db7c89dfe8ca69631055e707792cabe58"

RPROVIDES:${PN} += "pattern() \
pattern-category() \
pattern-icon() \
pattern-order() \
pattern-visible() \
patterns-lxqt-lxqt \
patterns-lxqt-lxqt(aarch-64)"

RDEPENDS:${PN} += "breeze5-icons \
lxqt-about \
lxqt-config \
lxqt-globalkeys \
lxqt-notificationd \
lxqt-openssh-askpass \
lxqt-panel \
lxqt-policykit \
lxqt-powermanagement \
lxqt-qtplugin \
lxqt-runner \
lxqt-session \
lxqt-sudo \
lxqt-themes \
oxygen5-icon-theme \
pattern()"

inherit rpm
