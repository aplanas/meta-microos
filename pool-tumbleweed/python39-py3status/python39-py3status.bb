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

PV = "3.50"

RPM_NAME = "python39-py3status-3.50-1.1.noarch.rpm"
RPM_HASH = "11c8d7abed683e101dcb065506a547288f60a2c0059a4358b68db602ecdea71fbf3a2d0764936095029648aa8414a01cd31d801d1848f4244d39827277377279"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "py3status \
python3.9dist-py3status \
python39-py3status \
python3dist-py3status"

RDEPENDS:${PN} += "/bin/sh \
/usr/bin/python3.9 \
python-abi \
python39-setuptools \
update-alternatives"

inherit rpm
