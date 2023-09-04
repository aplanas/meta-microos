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

RPM_NAME = "python310-py3status-3.52-1.1.noarch.rpm"
RPM_HASH = "281ee8d59918b07ddc0884c6a91896919999a331e88ade306b2d68196d5530a62c161569f583305319ee343822915f9de4fea612c96bb16f83155a91b1613894"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "py3status \
python3.10dist-py3status \
python310-py3status \
python3dist-py3status"

RDEPENDS:${PN} += "/usr/bin/python3.10 \
/usr/bin/sh \
python-abi \
python310-setuptools \
update-alternatives"

inherit rpm
