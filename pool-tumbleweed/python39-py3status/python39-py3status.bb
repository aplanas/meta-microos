SUMMARY = "Python extensible i3status wrapper"
DESCRIPTION = "py3status is an extensible i3status wrapper written in python. \
 \
Using py3status, you can take control of your i3bar easily by: \
 \
- using one of the availables modules shipped with py3status \
- writing your own modules and have their output displayed on your bar \
- handling click events on your i3bar and play with them in no time \
- seeing your clock tick every second whatever your i3status interval \
 \
py3status has a standalone mode allowing to bypass i3status when you need \
a py3status-modules-only i3bar."
LICENSE = "BSD-3-Clause"

PV = "3.52"

RPM_NAME = "python39-py3status-3.52-1.1.noarch.rpm"
RPM_HASH = "17390b6271b30980ab56f5db7b37883712f7084680df2fd84b0d8f33656fda9db8739bc43e38e9885b73b515cbc268753cd886426580207d13e45c0114c0e324"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "py3status \
python3.9dist-py3status \
python39-py3status \
python3dist-py3status"

RDEPENDS:${PN} += "/usr/bin/python3.9 \
/usr/bin/sh \
python-abi \
python39-setuptools \
update-alternatives"

inherit rpm
