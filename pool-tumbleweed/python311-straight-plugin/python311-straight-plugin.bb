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

RPM_NAME = "python311-straight-plugin-1.5.0-2.12.noarch.rpm"
RPM_HASH = "bb957afe39343b89762e1925f29fab5c13501fd0c353b370a236907f6d5793b69b7b16ff5e6774d42069812018f7a58572f1d9c008c1ff6a3de19951a9c030f5"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.11dist(straight.plugin) \
python311-straight-plugin \
python3dist(straight.plugin)"

RDEPENDS:${PN} += "python(abi)"

inherit rpm
