SUMMARY = "Python plugin loader"
DESCRIPTION = "straight.plugin is a Python plugin loader inspired by twisted.plugin with two \
important distinctions: \
 \
 - Fewer dependencies \
 - Python 3 compatible \
 \
The system is used to allow multiple Python packages to provide plugins within \
a namespace package, where other packages will locate and utilize. The plugins \
themselves are modules in a namespace package where the namespace identifies \
the plugins in it for some particular purpose or intent."
LICENSE = "MIT"

PV = "1.5.0"

RPM_NAME = "python39-straight-plugin-1.5.0-2.13.noarch.rpm"
RPM_HASH = "824577659db673a7cc060876f1824da61cc2d086ba86bc7be0ecae20d14a0765bb15bb1f0ba233f794957c6b0337fd6594d103d42b15f779a90fbac230d8e8f2"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-straight.plugin \
python39-straight-plugin \
python3dist-straight.plugin"

RDEPENDS:${PN} += "python-abi"

inherit rpm
