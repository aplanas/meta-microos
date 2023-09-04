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

RPM_NAME = "python311-py3status-3.52-1.1.noarch.rpm"
RPM_HASH = "4d27bfe7c7f33408b0370e500a03409e4c98bd9dc3dc8573771325b3ece53776143b985a88d7a6b240742e453c191b6131c01484fe394d826b43a6c2c2cb9a7d"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "py3status \
python3-py3status \
python3.11dist-py3status \
python311-py3status \
python3dist-py3status"

RDEPENDS:${PN} += "/usr/bin/python3.11 \
/usr/bin/sh \
python-abi \
python311-setuptools \
update-alternatives"

inherit rpm
