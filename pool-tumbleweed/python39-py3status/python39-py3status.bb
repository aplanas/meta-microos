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

PV = "3.51"

RPM_NAME = "python39-py3status-3.51-1.1.noarch.rpm"
RPM_HASH = "5b8df4cf3493988b7115d7d777d71a046f70397a8b83cb966c5175ab412ec5cf224a4fb5f2b582c4d3a9cc333363006ab60f670a9e9c2f5039b40a092e73b931"
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
