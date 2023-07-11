SUMMARY = "Python programmatic control of X windows"
DESCRIPTION = "Python tool to programmatically control windows inside X."
LICENSE = "MIT"

PV = "0.4"

RPM_NAME = "python39-wmctrl-0.4-2.4.noarch.rpm"
RPM_HASH = "5f209df3eaa8f32059960c8e1d21f0044357fc28638bc2b87ce1769dda338647f6c6940ee0be5fcfb93fcfece9f28ed5d980a0840fede994f9d46826b683f528"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-wmctrl \
python39-wmctrl \
python3dist-wmctrl"

RDEPENDS:${PN} += "python-abi \
wmctrl \
xorg-x11-server"

inherit rpm
