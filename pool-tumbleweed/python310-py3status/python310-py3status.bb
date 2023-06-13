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

RPM_NAME = "python310-py3status-3.50-1.1.noarch.rpm"
RPM_HASH = "e92103b3e277e22378721662b19861507dcec6f652025fa2dd08951ee53f2f745c6d43c637cb9afb433e37aeef9fcfb572bfd822db7ae8ea69a2f169011fccc2"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "py3status \
python3-py3status \
python3.10dist(py3status) \
python310-py3status \
python3dist(py3status)"

RDEPENDS:${PN} += "/bin/sh \
/usr/bin/python3.10 \
python(abi) \
python310-setuptools \
update-alternatives"

inherit rpm
